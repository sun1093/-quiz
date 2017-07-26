package org.pdt.quiz.ctrl.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

/**
 * Thymeleaf的設計範本<br/>
 * 
 * @author Orange
 *
 */
@Controller
public class TestController {

    @RequestMapping(path = "/test", method = {RequestMethod.POST, RequestMethod.GET})
    public String test(Map<String, Object> model, HttpServletRequest request) throws Exception {
        System.out.println(request.getMethod());

        if(RequestMethod.GET.toString().equals(request.getMethod())) {


        }else {
            List<String> l = new ArrayList<String>();
            l.add("abc");
            l.add("abc1");

            model.put("message", "Hello " + request.getParameter("input1"));
            model.put("prods",  l);

            //ServletInputStream inputStream = request.getInputStream();
        }

        return "test";

    }

    //    public void process(HttpServletRequest request, HttpServletResponse response, ServletContext servletContext,
    //            TemplateEngine templateEngine) throws IOException {
    //        // ProductService productService = new ProductService();
    //        // List<Product> allProducts = productService.findAll();
    //        
    //       
    //
    //        WebContext ctx = new WebContext(request, response, servletContext, request.getLocale());
    //        ctx.setVariable("prods", l);
    //
    //        templateEngine.process("test", ctx, response.getWriter());
    //    }

}