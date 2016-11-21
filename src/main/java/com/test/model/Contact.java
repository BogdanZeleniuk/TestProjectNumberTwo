package com.test.model;


import javax.persistence.*;

@Entity
@Table(name = "contacts")
public class Contact extends BaseEntity{

    @Column(name = "name", nullable = false)
    private String name;

    public Contact() {
    }
    public Contact(String name) {
        this(null,name);
    }
    public Contact(Integer id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                '}';
    }
}
