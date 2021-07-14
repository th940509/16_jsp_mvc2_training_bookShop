package bookshop.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import bookshop.dao.MemberDAO;
import bookshop.controller.CommandAction;

public class _20_Confirm implements CommandAction {

	@Override
	public String requestPro(HttpServletRequest request,HttpServletResponse response) throws Throwable {
		
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id"); // 18_register.jsp에서 ajax로 받아온 id 
		  
		MemberDAO manager = MemberDAO.getInstance();
		int check= manager.confirm(id); // check에 반환된 x값 대입
		
		request.setAttribute("check", new Integer(check)); // check 값 지정
		                                 // 래퍼클래스
		
		return "/20_confirm.jsp";
		
	}
	
}