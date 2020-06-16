package com.ibn.user.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @version 1.0
 * @description:
 * @projectName：springboot-struts2
 * @see: com.ibn.user.config
 * @author： RenBin
 * @createTime：2020/6/15 16:22
 */
@Configuration
@MapperScan(basePackages = {"com.ibn.user.dao"})
//　dubbo发布接口,及调用接口
@ImportResource(locations = {"classpath:dubbo/*.xml"})
public class AppAutoConfiguration {
}
