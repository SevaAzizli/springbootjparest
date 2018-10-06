package com.springbootjparest.controller;

import com.springbootjparest.DAO.AlienRepo;
import com.springbootjparest.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlienController {

    @Autowired
    AlienRepo alienRepo;

    @RequestMapping("/")
    public String home(){

        return "home.jsp";
    }

    @RequestMapping("/addAlien")
    public String addAlien(Alien theAlien){

        alienRepo.save( theAlien );
        return "home.jsp";
    }

    @RequestMapping("/getAlien")
    public ModelAndView getAlien(@RequestParam int id){

        ModelAndView mv = new ModelAndView( "fetch.jsp" );
        Alien alien = alienRepo.findById( id ).orElse( new Alien() );

        //Create our custom methods and queries
//        System.out.println(alienRepo.findByZlang( "Java" ));
//        System.out.println(alienRepo.findByIdGreaterThan( 2 ));
        System.out.println(alienRepo.findByZlangSortedByName("Java" ));
        mv.addObject( alien );
        return mv;
    }




}
