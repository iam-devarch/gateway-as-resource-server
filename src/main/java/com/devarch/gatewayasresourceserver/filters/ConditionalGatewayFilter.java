package com.devarch.gatewayasresourceserver.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class ConditionalGatewayFilter implements GatewayFilter {

    final Logger logger = LoggerFactory.getLogger(ConditionalGatewayFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        logger.info("Conditional Gateway Filter executed");
        return chain.filter(exchange);
    }
}