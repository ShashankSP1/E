package com.spring.emp;

public interface EmployeeInt {
    //create employee
    public void createEmployee(Employee emp);
    //show employee
    public void showAllEmployee();
    //show employee
    public void showEmployeeBasedOnID(int id);
    //update employee

    void updateEmployee(int empid, Employee up,int id, String name, String dob, int age, double salary, String status);
//    void updateEmployee(int empid1, Employee up);

    void updateEmployee(int id, int empid1, String name, String dob, int age, double salary, String status);

    void updateEmployee(int empid1, Employee up);

    //delete employee
    public void deleteEmployee(int id);

}
