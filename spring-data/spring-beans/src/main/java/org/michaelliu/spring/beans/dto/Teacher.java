package org.michaelliu.spring.beans.dto;

import java.io.Serializable;

/**
 * Created by Michael on 7/5/16.
 */
public class Teacher implements Serializable {

    private static final long serialVersionUID = -3947581067326767855L;

    private Long id;

    private String name;

    private String department;

    public Teacher() {
    }

    public Teacher(Long id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
