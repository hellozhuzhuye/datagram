package top.smartsoftware.datagram.service;

import org.springframework.stereotype.Service;
import top.smartsoftware.datagram.factory.DatagramAnalysisFactory;
import top.smartsoftware.datagram.model.BO.DatagramBO;
import top.smartsoftware.datagram.model.VO.BatchAnalysisVO;

import java.util.List;

@Service
public class DatagramAnalysisService {



    public String chargeAnalysis(DatagramBO datagramBO) throws Exception {
        return DatagramAnalysisFactory.get(datagramBO.getProtocolCode()).chargeAnalysis(datagramBO.getDatagram());
    }


    public List<BatchAnalysisVO> chargeBatchAnalysis(DatagramBO datagramBO) throws Exception {
        return DatagramAnalysisFactory.get(datagramBO.getProtocolCode()).chargeBatchAnalysis(datagramBO.getDatagram());
    }
}
