package top.smartsoftware.datagram.service;

import org.springframework.stereotype.Service;
import top.smartsoftware.datagram.factory.DatagramAnalysisFactory;
import top.smartsoftware.datagram.model.VO.BatchAnalysisVO;
import top.smartsoftware.datagram.model.shenghong.v28.SHPacket;
import top.smartsoftware.datagram.model.shenghong.v28.ShCmd104;
import top.smartsoftware.datagram.model.shenghong.v28.ShCmd202;
import top.smartsoftware.datagram.model.shenghong.v28.ShCmd502;
import top.smartsoftware.datagram.model.shenghong.v28.code.ShCmd504;
import top.smartsoftware.datagram.util.ByteUtility;
import top.smartsoftware.datagram.util.ConstUtil;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class Shv28DatagramAnalysisService implements BaseDatagramAnalysisService{

    @PostConstruct
    public void init() {
        DatagramAnalysisFactory.register(ConstUtil.PROTOCOL.SH_V28.getProtocolCode(), this);
    }

    @Override
    public String chargeAnalysis(String datagram) {
        byte[] bytes = ByteUtility.hexToByte(datagram);
        SHPacket shPacket = new SHPacket(bytes);
        int command = shPacket.getCommand();
        switch (command) {
            case 202:
                ShCmd202 msg202 = (ShCmd202) shPacket.getCommandObj("202");
                System.out.println(msg202);
                return msg202.toString();
            case 502:
                ShCmd502 msg502 = (ShCmd502) shPacket.getCommandObj("502");
                System.out.println(msg502);
                return msg502.toString();
            case 104:
                ShCmd104 msg104 = (ShCmd104) shPacket.getCommandObj("104");
                System.out.println(msg104);
                return msg104.toString();
            case 504:
                ShCmd504 msg504 = (ShCmd504) shPacket.getCommandObj("504");
                System.out.println(msg504);
                return msg504.toString();
        }
        return "解析失败，请检查报文是否正确";
    }

    @Override
    public List<BatchAnalysisVO> chargeBatchAnalysis(String datagram) {
        String[] split = datagram.split("\\r?\\n");
        List<String> rxList = Arrays.stream(split).filter(f -> f.contains("RX,cmd:00000068;dec:104") || f.contains("RX,cmd:000000CA;dec:202") || f.contains("RX,cmd:000001F6;dec:502") || f.contains("RX,cmd:000001F8;dec:504") ).collect(Collectors.toList());
        List<BatchAnalysisVO> voList = new ArrayList<>();
        rxList.forEach(e->{
            String dateTime = e.substring(0, 19);
            String data=e.substring(e.indexOf("[")+1,e.indexOf("]"));
            voList.add(new BatchAnalysisVO(dateTime,chargeAnalysis(data)));
        });
        return voList;
    }
}
