package com.Kushagra.SpringBoot_Web_App;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("Home Method Called...");
        return "index.jsp";
    }

    @RequestMapping("add")
    public String add(HttpServletRequest req){

        System.out.println("in add");

        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1 + num2;
        System.out.println(result);

        return "result.jsp";
    }
}
