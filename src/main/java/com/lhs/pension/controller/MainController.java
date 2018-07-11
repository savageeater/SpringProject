package com.lhs.pension.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Handles requests for the application home page.
 */





@Controller
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	

@Autowired
private SqlSession sqlSession;

	
	@RequestMapping("/Main")
	public String main(Model model, HttpServletRequest request) {
		return "Main";
	}
	
	@RequestMapping("/Login")
	public String login(Model model) {
		return "Login";
	}
	@RequestMapping("/LoginProc")
	public String loginProc(HttpServletRequest request, Model model,HttpSession session) {
		
	
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		try{
		//RentCarDAO dao = sqlSession.getMapper(RentCarDAO.class);
		Map<String,String> map = new HashMap();
		map.put("id",id);
		map.put("pass",pass);
		boolean loginOk = dao.login(map);
		if(loginOk){
			session.setAttribute("id", id);
			return "Main?center=CarReserveMain.jsp";
		}else{
			//alert("회원아이디 혹은 패스워드가 틀립니다.");
			return "Main.jsp?center=Login.jsp";
			
		}
		}catch(Exception e){
			e.printStackTrace();
		}

		
		
		
		
		return "LoginProc";
	}
	
}
