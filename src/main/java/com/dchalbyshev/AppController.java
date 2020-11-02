package com.dchalbyshev;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
  @GetMapping("/hello world")
   public String say(){
 return  "Say";
   }

}
