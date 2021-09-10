package top.smartsoftware.datagram.service;

import org.springframework.stereotype.Service;
import top.smartsoftware.datagram.factory.DatagramAnalysisFactory;
import top.smartsoftware.datagram.model.VO.BatchAnalysisVO;
import top.smartsoftware.datagram.model.kstar.v2.*;
import top.smartsoftware.datagram.util.ByteUtility;
import top.smartsoftware.datagram.util.ConstUtil;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class KstarV2DatagramAnalysisService implements BaseDatagramAnalysisService {

    @PostConstruct
    public void init() {
        DatagramAnalysisFactory.register(ConstUtil.PROTOCOL.KSTAR_V2.getProtocolCode(), this);
    }


    public byte[] getDataBytes(String datagram){
        byte[] allBytes = ByteUtility.hexToByte(datagram);
        byte[] dataBytes= Arrays.copyOfRange(allBytes, 2, allBytes.length);
        return dataBytes;
    }

    @Override
    public String chargeAnalysis(String datagram)  {
        byte[] dataBytes = getDataBytes(datagram);
        KStarPacket pkg = new KStarPacket(dataBytes, KStarPacketConst.StartFlag);
        int command = pkg.getCommand();
        switch (command) {
            case 6:
                KStarCmd6 msg6 = KStarCmd6.reqFromBytes(pkg.getMsgBodyBytesRegion());
                System.out.println(msg6.toString());
                return msg6.toString();
            case 20:
                KStarCmd14 msg14 = KStarCmd14.reqFromBytes(pkg.getMsgBodyBytesRegion());
                System.out.println(msg14.toString());
                return msg14.toString();
        }
        return "解析失败，请检查报文是否正确";
    }

    @Override
    public List<BatchAnalysisVO> chargeBatchAnalysis(String datagram) {
        String[] split = datagram.split("\\r?\\n");
        List<String> rxList = Arrays.stream(split).filter(f -> f.contains("RX,cmd:00000014") || f.contains("RX,cmd:00000006") ).collect(Collectors.toList());
        List<BatchAnalysisVO> voList = new ArrayList<>();
        rxList.forEach(e->{
            String dateTime = e.substring(0, 19);
            String data=e.substring(e.indexOf("[")+1,e.indexOf("]"));
            voList.add(new BatchAnalysisVO(dateTime,chargeAnalysis(data)));
        });
        return voList;
    }
}
