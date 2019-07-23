package cn.com.scitc.i18n_1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;

@Configuration
public class MyConfig {
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolve();
    }
}
