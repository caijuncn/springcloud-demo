package com.demo.base51feignhystrix;

import org.springframework.stereotype.Component;

/**
 * @author caijun
 * @Title: RemoteServiceoneServiceHystric
 * @ProjectName springcloud-demo
 * @Description: TODO
 * @date 2019-11-12 17:44
 */
@Component
public class RemoteServiceoneServiceHystric implements RemoteServiceoneService {

    @Override
    public String sayHiFromClientOne() {
        return "sorry error!";
    }
}
