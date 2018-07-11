package com.lhs.pension.controller;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lhs.pension.dao.PMemberIDao;
import com.lhs.pension.dao.RentPensionIDao;
import com.lhs.pension.dto.RentPension;


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
	public String loginProc(HttpServletRequest request, Model model,HttpSession session) throws UnsupportedEncodingException {
		
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		
		try{
		PMemberIDao dao = sqlSession.getMapper(PMemberIDao.class);
		Map<String,String> map = new HashMap();
		map.put("id",id);
		map.put("pass",pass);
		
		int loginOk = dao.login(map);
		if(loginOk>0){
			session.setAttribute("id", id);
			return "Main?center=CarReserveMain.jsp";
		}else{
			JOptionPane.showMessageDialog(null,"회원아이디 혹은 패스워드가 틀립니다.");
			return "Main?center=Login.jsp";
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return "LoginProc";
	}
	
	
	
}