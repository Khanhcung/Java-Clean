package com.ddd.service.impl;

import com.ddd.service.event.EventAppService;
import org.springframework.stereotype.Service;

@Service
public class EventAppServiceImpl implements EventAppService {

    @Override
    public String get(String str) {
        return "a" + str;
    }
}
