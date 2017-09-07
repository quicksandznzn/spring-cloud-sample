package org.spring.springcloud.eureka.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.springcloud.eureka.service.ComputeService;
import org.springframework.stereotype.Service;

/**
 * Created by quicksandzn@gmail.com on 2017/7/24.
 */
@Service
public class ComputeServiceImpl implements ComputeService {

    private static final Logger LOG = LoggerFactory.getLogger(ComputeServiceImpl.class);

    @Override
    public Integer add(Integer a, Integer b) {
        LOG.info("==================" + a);
        return a + b;
    }
}
