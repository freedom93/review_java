package com.freedom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * ������ת����
 * @author lifen
 */
@Controller
public class OtherContorller {
		/***
		 * ��������ת������ͨ��String�ķ���ֵ����תҳ��
		 * @return
		 */
		@RequestMapping("other")
		public String other(){
			return "other";
		}

}
