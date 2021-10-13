package com.scit.test3;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.test3.vo.MemberVO;
import com.scit.test3.vo.TestVO;

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
	
	@RequestMapping(value="/test1" , method = RequestMethod.GET)
	public String test1(String str, boolean flag, int num) {
		System.out.println("요청 전달 확인");
		System.out.println(str);
		System.out.println(num);
		System.out.println(flag);
		return "test1";
	}
	
	@RequestMapping(value="/test2" , method = RequestMethod.GET)
	public String test2(TestVO vo) {
		System.out.println("전달받은 값 : " + vo);
		return "test1";
	}
	
	@RequestMapping(value="/join" , method = RequestMethod.POST)
	public String join(MemberVO vo) {
		System.out.println(vo);
		return "test1";
	}
}
