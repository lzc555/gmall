package com.atguigu.gmall.gateway.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.cloud.gateway.filter.factory.GatewayFilterFactory;
import org.springframework.stereotype.Component;

/**
 * @author lzc
 * @create 2019-12-17 10:18
 */
@Component
public class AuthGatewayFilterFactory extends AbstractGatewayFilterFactory<Object> {
    @Autowired
    private AuthGatewayFilter authGatewayFilter;
    @Override
    public GatewayFilter apply(Object config) {
        return authGatewayFilter;
    }
}
