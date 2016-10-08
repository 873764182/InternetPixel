package com.pixel.internet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	/* 对用的Controller对应的View Spring会注入 */
	private String view;

	public void setView(String view) {
		this.view = view;
	}

	public String getView() {
		return view;
	}

	@RequestMapping("/index")
	public ModelAndView controllerMethod() {
		ModelAndView mav = new ModelAndView(view);
		mav.addObject("data_key", "方法一");
		return mav;
	}

	@RequestMapping("/index/{id}")
	public ModelAndView controllerMethod(@RequestParam(value = "id", required = false) String id) {
		ModelAndView mav = new ModelAndView(view);
		mav.addObject("data_key", "方法二 " + id);
		return mav;
	}

}
