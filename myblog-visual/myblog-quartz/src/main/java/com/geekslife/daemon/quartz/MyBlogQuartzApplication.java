package com.geekslife.daemon.quartz;

import com.geekslife.common.feign.annotation.EnableMyBlogFeignClients;
import com.geekslife.common.security.annotation.EnableMyBlogResourceServer;
import com.geekslife.common.swagger.annotation.EnableMyBlogDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author frwcloud
 * @date 2023-07-05
 */
@EnableMyBlogDoc("job")
@EnableMyBlogFeignClients
@EnableMyBlogResourceServer
@EnableDiscoveryClient
@SpringBootApplication
public class MyBlogQuartzApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyBlogQuartzApplication.class, args);
	}

}
