package top.smartsoftware.datagram.service;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
import top.smartsoftware.datagram.model.BO.HlhtDecryptBO;
import top.smartsoftware.datagram.model.DTO.PlatformSecretDTO;
import top.smartsoftware.datagram.util.CommonResponse;

import javax.annotation.Resource;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class HlhtDecryptService {

    @Autowired
    RedisTemplate<String,String> redisTemplate;

    private final static String PLATFORM_SECRET_REDIS_KEY = "platformSecret";

    public CommonResponse getHlhtDecrypt(HlhtDecryptBO hlhtDecryptBO) {
        if (hlhtDecryptBO.getPlatformId() == -1){
            if (StringUtils.isEmpty(hlhtDecryptBO.getDataSecret()) || StringUtils.isEmpty(hlhtDecryptBO.getDataSecretIv())){
                return CommonResponse.custom("自定义密钥不能为空",4001);
            }
            //自定义密钥解密
            String decrypt = decrypt(hlhtDecryptBO.getData(), hlhtDecryptBO.getDataSecret(), hlhtDecryptBO.getDataSecretIv());
            if (StringUtils.isEmpty(decrypt)){
                return CommonResponse.custom("解密失败 请检查数据是否正确",4001);
            }
            return CommonResponse.success(decrypt);
        }else {
            String value = redisTemplate.opsForList().index(PLATFORM_SECRET_REDIS_KEY, hlhtDecryptBO.getPlatformId());
            PlatformSecretDTO platformSecretDTO = JSONUtil.toBean(value, PlatformSecretDTO.class);
            String decrypt = decrypt(hlhtDecryptBO.getData(), platformSecretDTO.getDataSecret(), platformSecretDTO.getDataSecretIv());
            if (StringUtils.isEmpty(decrypt)){
                return CommonResponse.custom("解密失败 请检查数据是否正确",4001);
            }
            return CommonResponse.success(decrypt);
        }
    }

    public CommonResponse getHlhtEncrypt(HlhtDecryptBO hlhtDecryptBO) {
        if (hlhtDecryptBO.getPlatformId() == -1){
            if (StringUtils.isEmpty(hlhtDecryptBO.getDataSecret()) || StringUtils.isEmpty(hlhtDecryptBO.getDataSecretIv())){
                return CommonResponse.custom("自定义密钥不能为空",4001);
            }
            //自定义密钥加密
            String decrypt = encrypt(hlhtDecryptBO.getData(), hlhtDecryptBO.getDataSecret(), hlhtDecryptBO.getDataSecretIv());
            if (StringUtils.isEmpty(decrypt)){
                return CommonResponse.custom("加密失败 请检查数据是否正确",4001);
            }
            return CommonResponse.success(decrypt);
        }else {
            String value = redisTemplate.opsForList().index(PLATFORM_SECRET_REDIS_KEY, hlhtDecryptBO.getPlatformId());
            PlatformSecretDTO platformSecretDTO = JSONUtil.toBean(value, PlatformSecretDTO.class);
            String decrypt = encrypt(hlhtDecryptBO.getData(), platformSecretDTO.getDataSecret(), platformSecretDTO.getDataSecretIv());
            if (StringUtils.isEmpty(decrypt)){
                return CommonResponse.custom("加密失败 请检查数据是否正确",4001);
            }
            return CommonResponse.success(decrypt);
        }
    }

    public CommonResponse getPlatformSecretList() {
        List<String> platformSecret = redisTemplate.opsForList().range(PLATFORM_SECRET_REDIS_KEY, 0, -1);
        ArrayList<PlatformSecretDTO> list = new ArrayList<>();
        if (platformSecret.size()!=0){
            platformSecret.forEach(e->{
                PlatformSecretDTO platformSecretDTO = JSONUtil.toBean(e, PlatformSecretDTO.class);
                list.add(platformSecretDTO);
            });
            return CommonResponse.success(list);
        }
        return CommonResponse.custom("没有密钥信息",4001);
    }

    // 加密
    public static String encrypt(String sSrc, String sKey, String dataSecretIv) {
        try {
            byte[] raw = sKey.getBytes(StandardCharsets.UTF_8);
            SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");//"算法/模式/补码方式"
            IvParameterSpec iv = new IvParameterSpec(dataSecretIv.getBytes());//使用CBC模式，需要一个向量iv，可增加加密算法的强度1234567890123456
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
            byte[] encrypted = cipher.doFinal(sSrc.getBytes());
            String str = new BASE64Encoder().encode(encrypted);
            str = str.replaceAll("\r", "");
            str = str.replaceAll("\n", "");
            return str;
        } catch (Exception e) {
            log.error("encrypt 异常：", e);
            return null;
        }
    }

    // 解密
    public static String decrypt(String sSrc, String sKey, String dataSecretIv) {
        try {
            byte[] raw = sKey.getBytes(StandardCharsets.UTF_8);
            SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            IvParameterSpec iv = new IvParameterSpec(dataSecretIv.getBytes());
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
            byte[] encrypted1 = new BASE64Decoder().decodeBuffer(sSrc);//先用base64解密
            byte[] original = cipher.doFinal(encrypted1);
            return new String(original, StandardCharsets.UTF_8);
        } catch (Exception e) {
            log.error("encrypt 异常：", e);
            return null;
        }
    }

}
