package com.mcy.cloud.gateway.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;


/**
 * @author wangerting
 */
@Slf4j
@Component
public class GatewayFilterFactory implements GlobalFilter, Ordered {
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		ServerHttpRequest request = exchange.getRequest().mutate().build();
		log.info("网关接收到请求：{}",request.getURI());
		return chain.filter(exchange.mutate().request(request.mutate().build()).build());
	}

	@Override
	public int getOrder() {
		return 0;
	}

}
