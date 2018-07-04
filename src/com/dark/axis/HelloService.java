/**
 * 
 */
/**
 * @author Administrator
 *
 */
package com.dark.axis;

public class HelloService {
    
    public String sayHello() {
        return "hello";
    }
    
    public String sayHelloName(String name) {
        if(name == null || "".equals(name)){
            name = "nihao ";
        }
        return "hello:" + name;
    }
}
