package org.jsp.mvc.controller;

import org.jsp.mvc.model.Voter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ViewController {
	public ViewController() {
		
	}
	@RequestMapping("/display")

 public String display(Voter v,Model model) {
   model.addAttribute("voter",v);
return "Display";
 }
	@RequestMapping("/info")
	public String getInfo() {
		return "Info";
	}
	@RequestMapping({"/login"})
	   public String getLoginPage() {
	      return "Login";
	   }

	   @RequestMapping({"/loginInfo"})
	   @ResponseBody
	   public String getLoginInfo(String user_Name, String password) {
	      return "<center><h2 style='color: orange'>" + user_Name + "  " + password + "</h2></center>";
	   }
}
