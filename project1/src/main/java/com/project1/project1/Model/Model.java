package com.project1.project1.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Model {
@GetMapping("/welcome")
public String Msg()
{
    return "Hello good afternoon ";
} 
}
