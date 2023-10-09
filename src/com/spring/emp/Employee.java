package com.spring.emp;
public class Employee {
    private int id;
    private String name;
    private String email;
    private String dob;
    private int age;
    private double salary;
    private String status;
    public Employee(){

    }

    public Employee(int id, String name, String email, String dob, int age, double salary, String status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
        this.salary = salary;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {this.email = email;}

    public String getDOB() {
        return dob;
    }

    public void setDOB(String dob) {
        this.dob = dob;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {this.age = age;}
    public double getSalary() {return salary;}
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getstatus() {return status;
    }
    public void setStatus(String status) {this.status = status;}

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                "name=" +name+
                "email=" +email+
               "dob=" +dob+
                " age=" +age +
                " salary=" + salary +
               " status=" + status+
                "}";
    }
}
