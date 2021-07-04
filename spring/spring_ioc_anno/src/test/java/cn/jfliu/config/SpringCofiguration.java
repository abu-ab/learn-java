package cn.jfliu.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// 标识该类为spring核心配置类
@Configuration

//<context:component-scan base-package="cn.jfliu" />
@ComponentScan("cn.jfliu")
@Import({DataSourceConfiguration.class})
public class SpringCofiguration {



}
