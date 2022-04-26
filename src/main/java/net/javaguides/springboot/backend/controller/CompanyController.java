package net.javaguides.springboot.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import net.javaguides.springboot.backend.repository.CompanyRepository;
import net.javaguides.springboot.backend.model.Company;
@RestController
@RequestMapping("/api/v1/")
public class CompanyController {
    @Autowired
    private CompanyRepository companyRepository;
    @GetMapping("/company")
    public List<Company> getAllKeywords(){
        return companyRepository.findAll();
    }
 
    
    
}
