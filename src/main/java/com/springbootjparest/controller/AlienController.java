package com.springbootjparest.controller;

import com.springbootjparest.DAO.AlienRepo;
import com.springbootjparest.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
public class AlienController {

    @Autowired
    AlienRepo alienRepo;

    @GetMapping("/aliens")
    public List<Alien> getAliens (){

        return alienRepo.findAll();
    }

    @GetMapping("/aliens/{alienId}")
    public Optional<Alien> getAliens (@PathVariable("alienId") int id){

        return alienRepo.findById( id );

    }

// send request in raw body:
//    @PostMapping(path = "/alien")
//    public Alien addAlien (@RequestBody Alien alien){
//
//       alienRepo.save( alien );
//        return alien;
//    }


    // send request in multipart/form-data:
    @PostMapping(path = "/alien")
    public Alien addAlien ( Alien alien) {

        alienRepo.save( alien );
        return alien;

    }

    // send request in raw body:
    @DeleteMapping (path = "/alien/{id}")
    public String deleteAlien (@PathVariable int id){

        Alien a = alienRepo.getOne(id );
       alienRepo.delete( a );
        return "deleted!";
    }

    // send request in raw body:
    @PutMapping (path = "/alien")
    public Alien updateorcreateAlien (@RequestBody Alien alien){

        alienRepo.save( alien );

        return alien;
    }

}
