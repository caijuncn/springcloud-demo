package com.example.service11one;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "xidd") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
