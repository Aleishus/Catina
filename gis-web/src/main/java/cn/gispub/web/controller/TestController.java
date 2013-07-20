package cn.gispub.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.gispub.impl.service.TestMyBatis;

/**
 * 
 * 
 * 功能描述： XXXXXX
 * @author 作者 aleishus
 * @created Jul 20, 2013 5:34:17 PM
 * @version 1.0.0
 * @date Jul 20, 2013 5:34:17 PM
 */
@Controller
@RequestMapping("/test")
public class TestController {

	private static Logger	logger	= Logger.getLogger(TestController.class);
	
	@Autowired 
	private TestMyBatis tb ;

	@RequestMapping("/hello")
	public String helloWorld(Model model) {

	
		model.addAttribute("dev", tb.getOne(2L));
		logger.info("ok go ");
		return "test/hello.ftl";

	}

}
