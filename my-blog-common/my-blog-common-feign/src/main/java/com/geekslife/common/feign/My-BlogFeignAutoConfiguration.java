/*
 * Copyright (c) 2020 pig4cloud Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.geekslife.common.feign;

import com.alibaba.cloud.sentinel.feign.SentinelFeignAutoConfiguration;
import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;
import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.RequestOriginParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.geekslife.common.feign.core.My-BlogFeignRequestCloseInterceptor;
import com.geekslife.common.feign.sentinel.ext.My-BlogSentinelFeign;
import com.geekslife.common.feign.sentinel.handle.My-BlogUrlBlockHandler;
import com.geekslife.common.feign.sentinel.parser.My-BlogHeaderRequestOriginParser;
import feign.Feign;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.openfeign.My-BlogFeignClientsRegistrar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

/**
 * sentinel 配置
 *
 * @author lengleng
 * @date 2020-02-12
 */
@Configuration(proxyBeanMethods = false)
@Import(My-BlogFeignClientsRegistrar.class)
@AutoConfigureBefore(SentinelFeignAutoConfiguration.class)
public class My-BlogFeignAutoConfiguration {

	@Bean
	@Scope("prototype")
	@ConditionalOnMissingBean
	@ConditionalOnProperty(name = "feign.sentinel.enabled")
	public Feign.Builder feignSentinelBuilder() {
		return My-BlogSentinelFeign.builder();
	}

	@Bean
	@ConditionalOnMissingBean
	public BlockExceptionHandler blockExceptionHandler(ObjectMapper objectMapper) {
		return new My-BlogUrlBlockHandler(objectMapper);
	}

	@Bean
	@ConditionalOnMissingBean
	public RequestOriginParser requestOriginParser() {
		return new My-BlogHeaderRequestOriginParser();
	}

	/**
	 * add http connection close header
	 * @return
	 */
	@Bean
	public My-BlogFeignRequestCloseInterceptor my-blogFeignRequestCloseInterceptor() {
		return new My-BlogFeignRequestCloseInterceptor();
	}

}
