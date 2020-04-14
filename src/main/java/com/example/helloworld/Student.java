package com.example.helloworld;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
    @NotNull(message = "{student.id.notnull}", groups = validationGroup1.class)
    private Integer id;
    @NotNull(message = "{student.name.notnull}", groups = {validationGroup1.class, validationGroup2.class})
    @Size(min = 2, max = 10, message = "{student.name.length}", groups = {validationGroup1.class, validationGroup2.class})
    private String name;
    @Email(message = "{student.email.error}",groups = {validationGroup1.class,validationGroup2.class})
    private String email;
    @Max(value = 150, message = "{student.age.error}", groups = {validationGroup2.class})
    private Integer age;

    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id = " + id +
                ", name = '" + name + "\'" +
                ", email ='" + email + "\'" +
                ", age =" + age +
                "}";
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}