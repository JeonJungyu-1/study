package com.scit.test13;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value="/selector1" , method = RequestMethod.GET)
	public String selector1() {
		return "selector1";
	}
	
	@RequestMapping(value="/selector2" , method = RequestMethod.GET)
	public String selector2() {
		return "selector2";
	}

	@RequestMapping(value="/selector3" , method = RequestMethod.GET)
	public String selector3() {
		return "selector3";
	}

	@RequestMapping(value="/selector4" , method = RequestMethod.GET)
	public String selector4() {
		return "selector4";
	}

	@RequestMapping(value="/each" , method = RequestMethod.GET)
	public String each() {
		return "each";
	}

	@RequestMapping(value="/selector5" , method = RequestMethod.GET)
	public String selector5() {
		return "selector5";
	}
	
	@RequestMapping(value="/selector6" , method = RequestMethod.GET)
	public String selector6() {
		return "selector6";
	}

	@RequestMapping(value="/selector7" , method = RequestMethod.GET)
	public String selector7() {
		return "selector7";
	}

	@RequestMapping(value="/selector8" , method = RequestMethod.GET)
	public String selector8() {
		return "selector8";
	}
}
