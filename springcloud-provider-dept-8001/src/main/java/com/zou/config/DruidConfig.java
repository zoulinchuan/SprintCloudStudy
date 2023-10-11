package com.zou.config;

//import com.alibaba.druid.pool.DruidDataSource;
//import com.alibaba.druid.support.http.StatViewServlet;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Configuration
//public class DruidConfig {
//
//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource.druid")
//    public DruidDataSource druidDataSource(){
//        return new DruidDataSource();
//    }
//
//    //后台监控
//    @Bean
//    public ServletRegistrationBean registrationBean(){
//        ServletRegistrationBean bean=new ServletRegistrationBean(new StatViewServlet());
//        //代表访问什么样的请求可以进入到druid监控控制台(如果有虚拟目录druid会自定帮我们加上)
//        //访问就是: 域名:端口/项目虚拟目录/druid
//        bean.addUrlMappings("/druid/*");
//        Map<String,String> initParams=new HashMap<String,String>();
//        initParams.put("loginUsername", "admin");//账户密码是固定的
//        initParams.put("loginPassword", "123456");
//        initParams.put("allow", "");//这个值为空就允许所有人访问
//        bean.setInitParameters(initParams);
//        return bean;
//    }
//}
