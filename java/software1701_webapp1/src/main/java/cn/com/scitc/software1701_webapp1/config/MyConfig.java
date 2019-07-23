package cn.com.scitc.software1701_webapp1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;

@Configuration
public class MyConfig {
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResole();
    }
}
