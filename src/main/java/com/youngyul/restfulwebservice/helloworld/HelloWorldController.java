package com.youngyul.restfulwebservice.helloworld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    // GET
    // /hello-world (endpoint)
    //@RequestMapping(method=RequestMethod.GET, path ="/hello-world")

    @GetMapping( path = "/hello-world")
    public String HelloWorld(){
        return "Hello world";
    }

    @GetMapping( path = "/hello-world-bean")
    public HelloWorldBean HelloWorldBean(){
        return new HelloWorldBean("Hello world");
    }

    @GetMapping(path = "/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello world, %s, name"));
    }


}
