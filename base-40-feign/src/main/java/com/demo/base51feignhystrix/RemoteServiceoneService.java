package com.demo.base51feignhystrix;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author caijun
 * @Title: RemoteServiceoneService
 * @ProjectName springcloud-demo
 * @Description: TODO
 * @date 2019-11-12 17:14
 */
@FeignClient(value = "SERVICE-ONE")
public interface RemoteServiceoneService {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne();

}
