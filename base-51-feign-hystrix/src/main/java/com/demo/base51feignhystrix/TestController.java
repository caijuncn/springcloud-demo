package com.demo.base51feignhystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caijun
 * @Title: TestController
 * @ProjectName springcloud-demo
 * @Description: TODO
 * @date 2019-11-11 16:02
 */
@RestController
public class TestController {

    @Autowired
    private RemoteServiceoneService remoteServiceoneService;

    @RequestMapping("/hi")
    public String hi() {
        return remoteServiceoneService.sayHiFromClientOne();
    }
}
