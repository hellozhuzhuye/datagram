package top.smartsoftware.datagram.service;


import top.smartsoftware.datagram.model.VO.BatchAnalysisVO;

import java.util.List;

public interface BaseDatagramAnalysisService {

    String chargeAnalysis(String datagram) throws Exception;

    List<BatchAnalysisVO> chargeBatchAnalysis(String datagram) throws Exception;


}
