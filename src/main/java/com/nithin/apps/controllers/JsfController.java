package com.nithin.apps.controllers;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "jsfController")
public class JsfController {
 
    public String loadTodoPage() {
        checkPermission();
        return "/result.jsp";
    }
 
    private void checkPermission() {
        // Details omitted
    }
}