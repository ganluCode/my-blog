package com.geekslife.daemon.quartz;

import com.geekslife.common.feign.annotation.EnableMy-BlogFeignClients;
import com.geekslife.common.security.annotation.EnableMy-BlogResourceServer;
import com.geekslife.common.swagger.annotation.EnableMy-BlogDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author frwcloud
 * @date 2023-07-05
 */
@EnableMy-BlogDoc("job")
@EnableMy-BlogFeignClients
@EnableMy-BlogResourceServer
@EnableDiscoveryClient
@SpringBootApplication
public class My-BlogQuartzApplication {

	public static void main(String[] args) {
		SpringApplication.run(My-BlogQuartzApplication.class, args);
	}

}
