package com.springbootjparest.controller;

import com.springbootjparest.DAO.AlienRepo;
import com.springbootjparest.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlienController {

    @Autowired
    AlienRepo alienRepo;

    @RequestMapping("/")
    public String home(){

        return "home.jsp";
    }

    @RequestMapping("/addAlien")
    public String getAlien(Alien theAlien){

        alienRepo.save( theAlien );
        return "home.jsp";
    }

}
