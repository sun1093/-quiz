package org.pdt.quiz.ctrl.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


/**
 * Restful Service的基本範例<br/>
 * 日後開發時可參考此<br/>
 * @author Orange
 *
 */
@Controller
@RestController
public class HelloRSController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/rsTest")
    public String rsTest() {
        return "rsTest!";
    }

}