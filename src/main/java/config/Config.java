package config;

import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description: 代码自定义配置端口
 * @Date:Create：in 2020/10/11 15:49
 * @Modified By：
 */
//@Configuration 表示该类为配置类，该注解可以被@ComponenScan 扫描到
@Configuration
public class Config implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {
    @Override
    public void customize(ConfigurableServletWebServerFactory factory){
        //设置端口为8848
        factory.setPort(8848);
    }
}
