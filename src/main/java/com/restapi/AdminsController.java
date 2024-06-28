package com.restapi;

import org.springframework.web.bind.annotation.*;

@RestController
public class AdminsController {

    @GetMapping(path = "/admin")
    public String getAdmin(){
        return "http GET request to get the admin details";
    }

    @GetMapping(path = "/{adminId}")
    public String getAdminId(@PathVariable String adminId){
        return "GET request to get the adminId " + adminId ;
    }

    @PostMapping(path = "/create")
    public String createAdmin(){
        return "http POST request to create the admin";
    }
    @PutMapping(path = "/update")
    public String updateAdmin(){
        return "http GET request to update the admin details";
    }
    @DeleteMapping(path = "/delete")
    public String deleteAdmin(){
        return "http GET request to delete the admin";
    }
    @GetMapping(path = "/")
    public String ping(){
        return "welcome to the rundeck test";
    }

}
