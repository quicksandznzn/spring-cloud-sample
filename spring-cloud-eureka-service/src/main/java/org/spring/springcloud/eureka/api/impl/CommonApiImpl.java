package org.spring.springcloud.eureka.api.impl;

import org.spring.springcloud.api.CommonApi;
import org.spring.springcloud.eureka.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by quicksandzn@gmail.com on 2017/7/24.
 */
@Service
public class CommonApiImpl implements CommonApi {

    @Autowired
    private ComputeService computeService;

    @Override
    public Integer add(Integer a, Integer b) {
        return computeService.add(a, b);
    }
}
