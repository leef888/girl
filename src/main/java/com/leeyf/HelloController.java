package com.leeyf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author:leeyf
 * @date:Created in21:30 2018/9/27
 */

@RestController
@RequestMapping("/hello")
public class HelloController {

    //@Value("${cupSize}")
    //private String cupSize;
    //@Value("${age}")
    //private int age;
    //@Value("${content}")
    //private String content;

    @Autowired
    private GirlProperties girlProperties;

    //@RequestMapping(value = {"/say"},method = RequestMethod.GET)
    @GetMapping("/say")
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
        //return "Hello Spring Boot";
        //return girlProperties.getCupSize()+girlProperties.getAge();
        //return cupSize+"\n"+age+"\n"+ content;
        return "index"+id;
    }
}
