package net.javaguides.springboot.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.backend.model.Features;

public interface FeaturesRepository extends JpaRepository<Features,Integer>{
    public static FeaturesRepository featuresRepository(){
        return featuresRepository();
    }
    
}
