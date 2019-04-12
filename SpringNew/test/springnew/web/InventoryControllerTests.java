/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springnew.web;
import java.util.Map; 
import org.springframework.web.servlet.ModelAndView; 
import springnew.service.SimpleProductManager;
import springnew.web.InventoryController; 
import junit.framework.TestCase; 
/**
 *
 * @author ahish
 */

public class InventoryControllerTests extends TestCase { 

    public void testHandleRequestView() throws Exception{
        InventoryController controller = new InventoryController();
        controller.setProductManager(new SimpleProductManager());
        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        Map modelMap = (Map) modelAndView.getModel().get("model");
        String nowValue = (String) modelMap.get("now");
        assertNotNull(nowValue);
    }

}
