package com.example.demo.MODEL;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="vaccinedetails")
public class User {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    private String idtype;
    private String name;
    private String contactno;
    private String vacname;
    
    
    public String getIdtype() {
        return idtype;
    }
    public String getName() {
        return name;
    }
    public String getContactno() {
        return contactno;
    }
    public String getVacname() {
        return vacname;
    }

    
    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setContactno(String contactno) {
        this.contactno = contactno;
    }
    public void setVacname(String vacname) {
        this.vacname = vacname;
    }
    
    @Override
    public String toString() {
        return "User [idtype=" + idtype + ", name=" + name + ", contactno=" + contactno + ", vacname=" + vacname + "]";
    }
    
    
}
