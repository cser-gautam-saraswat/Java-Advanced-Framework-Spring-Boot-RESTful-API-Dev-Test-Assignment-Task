package com.capgemini.model.entity;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;

@Entity
public class College implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "college_id")
    private List<Department> departments;

    public College() {}

    public College(Integer id, String name, List<Department> departments) {
        this.id = id;
        this.name = name;
        this.departments = departments;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Department> getDepartments() { return departments; }
    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}