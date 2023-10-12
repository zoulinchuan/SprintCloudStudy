package com.zou.controller;

import com.zou.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DeptConsumerController {

    @Autowired
    @Qualifier("restTemplate")
    RestTemplate restTemplate;

    @Autowired
    DiscoveryClient discoveryClient;

    public static final String REST_URL_STR = "http://PROVIDER-DEPT";

    @RequestMapping("/getall")
    public Object test(){
        List<List<ServiceInstance>> servicesList = new ArrayList<>();
        //获取服务名称
        List<String> serviceNames = discoveryClient.getServices();
        for (String serviceName : serviceNames) {
            //获取服务中的实例列表
            List<ServiceInstance> serviceInstances = discoveryClient.getInstances(serviceName);
            servicesList.add(serviceInstances);
        }
        return servicesList;
    }

    @ResponseBody
    @RequestMapping("/consumer/dept/getall")
    public List<Dept> getAll(){
        List<Dept> list = restTemplate.getForObject(REST_URL_STR+"/dept/getall",List.class);

        return list;
    }

}
