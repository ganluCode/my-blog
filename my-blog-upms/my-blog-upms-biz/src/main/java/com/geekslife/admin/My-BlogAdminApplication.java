/*
 *
 *      Copyright (c) 2018-2025, lengleng All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 *  Redistributions in binary form must reproduce the above copyright
 *  notice, this list of conditions and the following disclaimer in the
 *  documentation and/or other materials provided with the distribution.
 *  Neither the name of the pig4cloud.com developer nor the names of its
 *  contributors may be used to endorse or promote products derived from
 *  this software without specific prior written permission.
 *  Author: lengleng (wangiegie@gmail.com)
 *
 */

package com.geekslife.admin;

import com.geekslife.common.feign.annotation.EnableMy-BlogFeignClients;
import com.geekslife.common.security.annotation.EnableMy-BlogResourceServer;
import com.geekslife.common.swagger.annotation.EnableMy-BlogDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lengleng
 * @date 2018年06月21日
 * <p>
 * 用户统一管理系统
 */
@EnableMy-BlogDoc(value = "admin")
@EnableMy-BlogFeignClients
@EnableMy-BlogResourceServer
@EnableDiscoveryClient
@SpringBootApplication
public class My-BlogAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(My-BlogAdminApplication.class, args);
	}

}
