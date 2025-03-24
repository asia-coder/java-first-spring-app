package com.todo_app.todo.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    private String email;
    private LocalDate birth;
    private Integer age;

    public User(Long id, String name, String email, LocalDate birthDay, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birth = birthDay;
        this.age = age;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
