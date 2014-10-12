package com.freedom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 其他跳转方法
 * @author lifen
 */
@Controller
public class OtherContorller {
		/***
		 * 其他的跳转方法，通过String的返回值来跳转页面
		 * @return
		 */
		@RequestMapping("other")
		public String other(){
			return "other";
		}

}
