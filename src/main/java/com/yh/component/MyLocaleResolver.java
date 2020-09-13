package com.yh.component;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * 自定义LocaleResolver
 */
public class MyLocaleResolver  implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        String locale = httpServletRequest.getParameter("locale");
        Locale returnLocal = Locale.getDefault();

        if (!StringUtils.isEmpty(locale)){
            String[] locales  = locale.split("_");
            returnLocal  =new Locale(locales[0],locales[1]);
        }
        return returnLocal;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
