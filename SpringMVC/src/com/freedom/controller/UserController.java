package com.freedom.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * UserController����ģ���û���¼��
 * ��username,password�ύ��Controller�н��д���
 * ���ҵ�½�ɹ���username,password���ݵ��ɹ���ҳ�档
 * @author lifen
 */
@Controller
public class UserController {
	 /*** 
     * �û���½ 
     * <p>ע�����ã�ֻ����POST�ύ���÷��� 
     * @param username 
     * @param password 
     * @return 
     */  
//    @RequestMapping(value="login",method=RequestMethod.POST)  
//    public ModelAndView login(String username,String password){  
//        //��֤���ݹ����Ĳ����Ƿ���ȷ�����򷵻ص���½ҳ�档  
//        if(this.checkParams(new String[]{username,password})){  
//            //ָ��Ҫ���ص�ҳ��Ϊsuccess.jsp  
//            ModelAndView mav = new ModelAndView("success");  
//            //���������ظ�ҳ��  :ͨ��ModelAndView�� addObject�������������뵽request��
//            mav.addObject("username",username);  
//            mav.addObject("password", password);  
//            return mav;  
//        }  
//        return new ModelAndView("home");  
//    } 
    
    /*** 
     * ��һ�ֲ������ݵ���ʽ 
     * ͨ��request��������������Ĳ����� 
     * @param username 
     * @param password 
     * @param request 
     * @return 
     */  
    @RequestMapping(value="login",method=RequestMethod.POST)  
	public ModelAndView login(String username, String password,
			HttpServletRequest request) {
		if (this.checkParams(new String[] { username, password })) {
			// ֱ��ͨ�����������뵽request����ʹ��
			request.setAttribute("username", username);
			request.setAttribute("password", password);
			return new ModelAndView("success");
		}
		request.setAttribute("msg", "�û����������벻��Ϊ�գ�");
		return new ModelAndView("home");
	}
      
    /*** 
     * ��֤�����Ƿ�Ϊ�� 
     * @param params 
     * @return 
     */  
    private boolean checkParams(String[] params){  
        for(String param:params){  
            if(param==""||param==null||param.isEmpty()){  
                return false;  
            }  
        }  
        return true;  
    }  

}
