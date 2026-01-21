package com.Kushagra.SpringBoot_Web_App;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    public String home(){

        return "index.jsp";
    }
}
