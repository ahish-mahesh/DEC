/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springnew.web;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView; 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory; 
import java.io.IOException;
import java.util.Date; 

/**
 *
 * @author ahish
 */
public class HelloController implements Controller { 

    protected final Log logger = LogFactory.getLog(getClass()); 

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
        String now = (new Date()).toString();
        logger.info("Returning hello view with " + now); 
        return new ModelAndView("hello", "now", now);
    }
}