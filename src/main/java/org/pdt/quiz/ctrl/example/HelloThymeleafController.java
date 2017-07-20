package org.pdt.quiz.ctrl.example;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Thymeleaf的設計範本<br/>
 * @author Orange
 *
 */
@Controller
public class HelloThymeleafController {


    @RequestMapping("/welcome")
    public String welcome(Map<String, Object> model) {
        model.put("message", "Hello World!");
        return "welcome";
    }

}