package cn.com.scitc.software1701_webapp1.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocaleResole implements LocaleResolver {
    private Log log = LogFactory.getLog(getClass());
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
       log.info("aa");

       String lang = httpServletRequest.getParameter("lang");
       if(lang == null) {
           String accpt_lang = httpServletRequest.getHeader("Accapt-language");
           Locale locale = Locale.getDefault();
           log.info(locale.getLanguage());
           return locale;
       }
       String[] list = lang.split("_");
       Locale locale = new Locale(list[0],list[1]);
       return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
