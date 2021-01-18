package com.event.controller;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import com.alibaba.nacos.spring.context.annotation.discovery.EnableNacosDiscovery;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * author:RaoB
 * date:2021/1/11 0011
 */
@RestController
@EnableNacosDiscovery
public class NacosDiscoveryController {

    @NacosInjected
    private NamingService namingService;

    @Value("${server.port}")
    private int port;

    @Value("${spring.application.name}")
    private String applicationName;

    @PostConstruct
    public void register(){
        try {
            Instance instance = new Instance();
            instance.setIp("127.0.0.1");
            Map<String,String> metadata = new HashMap<String,String>();
            metadata.put("getInstance","getInstance");
            instance.setMetadata(metadata);
            instance.setPort(port);
            instance.setServiceName(applicationName);
            namingService.registerInstance(applicationName,instance);
        } catch (NacosException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("getInstance")
    @ResponseBody
    public List<Instance> getInstance(){
        List<Instance> allInstances = null;
        try {
            allInstances = namingService.getAllInstances(applicationName);
        } catch (NacosException e) {
            e.printStackTrace();
        }
        return allInstances;
    }


}
