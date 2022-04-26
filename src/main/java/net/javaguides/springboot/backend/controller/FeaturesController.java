package net.javaguides.springboot.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import net.javaguides.springboot.backend.model.Features;


import net.javaguides.springboot.backend.repository.FeaturesRepository;
@RestController
@RequestMapping("/api/v1/")
public class FeaturesController {
    @Autowired
    private FeaturesRepository featuresRepository;
    @GetMapping("/features")
    public List<Features> getAllKeywords(){
        return featuresRepository.findAll();
    }
 
    
    
}
