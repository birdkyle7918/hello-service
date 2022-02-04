package com.birdkyle7918.helloservice.service.impl;

import com.birdkyle7918.helloservice.service.HttpRequestService;
import com.birdkyle7918.helloservice.util.HttpClientUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

@Service
public class HttpRequestServiceImpl implements HttpRequestService {

    private static final Logger LOGGER = LoggerFactory.getLogger(HttpRequestServiceImpl.class);


    @Override
    public void doHttpRequest(){

        Map<String, String> params = new HashMap<>();
        params.put("code", "utf-8");
        params.put("q", "玩具");


        try {
            String result = HttpClientUtils.get("http://suggest.taobao.com/sug", params);
            LOGGER.info("返回结果是 {}", result);
        }catch (URISyntaxException uriSyntaxException) {
            uriSyntaxException.printStackTrace();
        }

    }
}
