package top.smartsoftware.datagram.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.smartsoftware.datagram.model.BO.HlhtDecryptBO;
import top.smartsoftware.datagram.service.HlhtDecryptService;
import top.smartsoftware.datagram.util.CommonResponse;

@RestController
@CrossOrigin(allowCredentials = "true")
@RequestMapping("/hlhtDecrypt")
public class HlhtDecryptController {

    @Autowired
    HlhtDecryptService hlhtDecryptService;

    @PostMapping("/getHlhtDecrypt")
    public CommonResponse getHlhtDecrypt(@RequestBody HlhtDecryptBO hlhtDecryptBO){
        return hlhtDecryptService.getHlhtDecrypt(hlhtDecryptBO);
    }

    @GetMapping("/getPlatformSecretList")
    public CommonResponse getPlatformSecretList(){
        return hlhtDecryptService.getPlatformSecretList();
    }

}
