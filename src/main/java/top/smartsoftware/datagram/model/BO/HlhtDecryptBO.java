package top.smartsoftware.datagram.model.BO;

public class HlhtDecryptBO {
    private String data;
    private Integer platformId; //为-1时为自定义密钥解密
    private String dataSecret;
    private String dataSecretIv;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getPlatformId() {
        return platformId;
    }

    public void setPlatformId(Integer platformId) {
        this.platformId = platformId;
    }

    public String getDataSecret() {
        return dataSecret;
    }

    public void setDataSecret(String dataSecret) {
        this.dataSecret = dataSecret;
    }

    public String getDataSecretIv() {
        return dataSecretIv;
    }

    public void setDataSecretIv(String dataSecretIv) {
        this.dataSecretIv = dataSecretIv;
    }
}
