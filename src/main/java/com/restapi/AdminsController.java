package com.restapi;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admins")
public class AdminsController {

    @GetMapping
    public String getAdmin(){
        return "http GET request to get the admin details";
    }

    @GetMapping(path = "/{adminId}")
    public String getAdminId(@PathVariable String adminId){
        return "GET request to get the adminId " + adminId ;
    }

    @PostMapping
    public String createAdmin(){
        return "http POST request to create the admin";
    }
    @PutMapping
    public String updateAdmin(){
        return "http GET request to update the admin details";
    }
    @DeleteMapping
    public String deleteAdmin(){
        return "http GET request to delete the admin";
    }
    @GetMapping(path = "ping")
    public String ping(){
        return "welcome to the admin page";
    }

}
