/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bradz.confi;

import bradz.boom.com.MyInterface;
import bradz.boom.com.Header;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author 211064084
 */

public class AppConfig {
    
 @Bean(name = "class1")
 public MyInterface getMyClass()
 {
     
     return new Header();
 }
    
    
}
