package net.javaguides.springboot.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idc;
    @Column(name="namec")
    private String namec;
    @Column(name="domain")
    private String domain;
    public Company(){

    }
    public Company(String namec,String domain){
        super();
        this.domain = domain;
        this.namec = namec;
    }
    public Integer getIdc() {
        return idc;
    }
    public void setIdc(Integer idc) {
        this.idc = idc;
    }
    public String getNamec() {
        return namec;
    }
    public void setNamec(String namec) {
        this.namec = namec;
    }
    public String getDomain() {
        return domain;
    }
    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    
}
