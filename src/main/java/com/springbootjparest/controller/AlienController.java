package com.springbootjparest.controller;

import com.springbootjparest.DAO.AlienRepo;
import com.springbootjparest.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class AlienController {

    @Autowired
    AlienRepo alienRepo;

    @RequestMapping("/aliens")
    @ResponseBody
    public List<Alien> getAliens (){

        return alienRepo.findAll();
    }


    @RequestMapping("/aliens/{alienId}")
    @ResponseBody
    public Optional<Alien> getAliens (@PathVariable("alienId") int id){

        return alienRepo.findById( id );


    }




}
