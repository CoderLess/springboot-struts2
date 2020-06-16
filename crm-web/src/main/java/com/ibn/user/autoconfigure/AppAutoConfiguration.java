package com.ibn.user.autoconfigure;

import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.context.annotation.*;

/**
 * @version 1.0
 * @description:
 * @projectName：springboot-struts2
 * @see: com.ibn.autoconfigure
 * @author： RenBin
 * @createTime：2020/6/15 13:54
 */
@Configuration
@ImportResource(locations = { "classpath:spring/*.xml","classpath:struts.xml"})
@ComponentScan(value ={"com.ibn.user.action.**"},  excludeFilters =  @ComponentScan.Filter(type =
        FilterType.ASSIGNABLE_TYPE,classes = {AppAutoConfiguration.class}))
public class AppAutoConfiguration {
    /**
     * @description: 配置struts2的核心拦截器,路径如果不配置的话默认的就是拦截所有路径
     * @author：RenBin
     * @createTime：2020/6/15 14:07
     */
    @Bean
    public StrutsPrepareAndExecuteFilter strutsPrepareAndExecuteFilter(){
        return new StrutsPrepareAndExecuteFilter();
    }
}
