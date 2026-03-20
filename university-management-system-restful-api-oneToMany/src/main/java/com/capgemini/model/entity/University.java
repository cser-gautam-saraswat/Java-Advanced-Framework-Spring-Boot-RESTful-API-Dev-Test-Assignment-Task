package com.capgemini.model.entity;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;

@Entity
public class University implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "university_id")
    private List<College> colleges;

    public University() {}

    public University(Integer id, String name, List<College> colleges) {
        this.id = id;
        this.name = name;
        this.colleges = colleges;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<College> getColleges() { return colleges; }
    public void setColleges(List<College> colleges) { this.colleges = colleges; }
}