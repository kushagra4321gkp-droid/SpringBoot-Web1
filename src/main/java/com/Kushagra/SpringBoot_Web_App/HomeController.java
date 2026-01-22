package com.Kushagra.SpringBoot_Web_App;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName(){
        return "C#";
    }

    @RequestMapping("/")
    public String home(){
        System.out.println("Home Method Called...");
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int num, @RequestParam("num2") int num2, ModelAndView mv){

        System.out.println("in add");

//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num + num2 + 2;
        System.out.println(result);

//        session.setAttribute("result", result);

        mv.addObject("result", result);
        mv.setViewName("result");

        return mv;
    }

    @RequestMapping("addStudent")
    public String addStudent(Student s){

        return "result";




//    @RequestMapping("addStudent")
//    public ModelAndView addStudent(@RequestParam("sid") int sid, @RequestParam("sname") String sname, ModelAndView mv){
//
//        Student s = new Student();
//        s.setSid(sid);
//        s.setSname(sname);
//
//        mv.addObject("student", s);
//        mv.setViewName("result");
//
//        return mv;

//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int result = num + num2 + 2;
//        System.out.println(result);

//        session.setAttribute("result", result);
//        mv.addObject("result", result);
//        mv.setViewName("result");
//        return mv;
//
    }

}

//prefix = view folder
//postfix(suffix) = .jsp
