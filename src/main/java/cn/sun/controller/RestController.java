package cn.sun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class RestController {
    public RestController() {
    }
    @RequestMapping(value = "/login/{username}" , method = RequestMethod.GET)
    public ModelAndView myMethod(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, @PathVariable("username") String username, ModelMap modelMap){
        modelMap.put("loginUser",username);
        return new ModelAndView("/hello",modelMap);
    }
    @RequestMapping(value = "/welcome",method = RequestMethod.GET)
    public  String registPost(){
        return "/welcome";
    }
}
