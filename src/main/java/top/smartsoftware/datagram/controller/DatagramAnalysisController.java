package top.smartsoftware.datagram.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.smartsoftware.datagram.model.BO.DatagramBO;
import top.smartsoftware.datagram.service.DatagramAnalysisService;
import top.smartsoftware.datagram.util.CommonResponse;

@CrossOrigin(allowCredentials = "true")
@RestController
@RequestMapping("/datagramAnalysis")
public class DatagramAnalysisController {

    @Autowired
    DatagramAnalysisService datagramAnalysisService;

    @PostMapping("/chargeAnalysis")
    public CommonResponse chargeAnalysis(@RequestBody DatagramBO datagramBO) throws Exception {
        return CommonResponse.success(datagramAnalysisService.chargeAnalysis(datagramBO));
    }

    @PostMapping("/chargeBatchAnalysis")
    public CommonResponse chargeBatchAnalysis(@RequestBody DatagramBO datagramBO) throws Exception {
        return CommonResponse.success(datagramAnalysisService.chargeBatchAnalysis(datagramBO));
    }

}
