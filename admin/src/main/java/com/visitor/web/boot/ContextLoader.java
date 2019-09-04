package com.visitor.web.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

/**
 * 此类负责默认网址在控制台的输出
 * @ClassName ContextLoader
 * @Description 加载系统数据
 * @Date 2018/11/22
 */
@Component
public class ContextLoader implements ApplicationRunner, ServletContextAware {

    private static final Logger LOGGER = LoggerFactory.getLogger(ContextLoader.class);

    @Autowired
    private ServletContext servletContext;


    @Value("${visitor.contextPath}")
    private String contextPath;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        LOGGER.info(contextPath);
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
    }
}
