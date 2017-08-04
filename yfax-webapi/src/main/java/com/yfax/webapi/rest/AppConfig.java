package com.yfax.webapi.rest;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Minbo.He
 * 配置接口
 */
@Controller
@RequestMapping("/api/cfdb")
public class AppConfig {
	protected static Logger logger = LoggerFactory.getLogger(AppConfig.class);
	
	/**
	 * APP关于页
	 */
	@RequestMapping("/about")
    public String about(Map<String, Object> model) {
        return "about";
    }
}
