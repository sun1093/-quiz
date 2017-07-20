package org.pdt.quiz.ctrl.test;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.util.Map;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Thymeleaf的設計範本<br/>
 * @author Orange
 *
 */
@Controller
public class TestController {


    @RequestMapping(path="/test", method=RequestMethod.POST)
    public String test(Map<String, Object> model, HttpServletRequest request) throws Exception {  
        model.put("message", "Hello " + request.getParameter("input1"));
        ServletInputStream inputStream = request.getInputStream();
        
        return "test";
    }

}