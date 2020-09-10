package com.nithin.apps.controllers;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Scope(value = "session")
@Component(value = "jsfController")
//@Controller
public class JsfController {
	
//	@GetMapping("/index")
//    public String showIndex(ModelMap model){
//        return "index";
//    }

 
    public String loadTodoPage() {
        checkPermission();
        return "/result.xhtml";
    }
 
    private void checkPermission() {
        // Details omitted
    }
}