/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springnew.service;
import java.io.Serializable;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory; 

/**
 *
 * @author ahish
 */
public class PriceIncrease implements Serializable{
    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass()); 
    private int percentage; 

    public void setPercentage(int i) {
        percentage = i;
        logger.info("Percentage set to " + i);
    } 

    public int getPercentage() {
        return percentage;
    } 
}
