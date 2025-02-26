package com.geekslife.common.feign.core;

import feign.RequestInterceptor;
import org.springframework.http.HttpHeaders;

/**
 * @author lengleng
 * @date 2024/3/15
 * <p>
 * http connection close
 */
public class My-BlogFeignRequestCloseInterceptor implements RequestInterceptor {

	/**
	 * set connection close
	 * @param template
	 */
	@Override
	public void apply(feign.RequestTemplate template) {
		template.header(HttpHeaders.CONNECTION, "close");
	}

}
