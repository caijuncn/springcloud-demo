package com.demo.base50ribbonhystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
    RestTemplate restTemplate;

    @RequestMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String hi() {
        return restTemplate.getForObject("http://SERVICE-TWO/hi",String.class);
    }

    public String hiError() {
        return "hi,sorry,error!";
    }
}
