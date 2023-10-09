package com.spring.emp;

import java.util.Scanner;
public class Main {
    public static void main(String []args){
        int id;
        String name;
        String email;
        String dob;
        int age;
        double salary;
        String status;
        EmployeeInt s=new EmployeeImpl();
        System.out.println("Welcome to Employee Management Application");
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1.Add Employee\n"+
                    "2.Show All Employee\n"+
                    "3.Show Employee based on id\n" +
                    "4.Update the Employee\n"+
                    "5.Delete the Employee\n");
            System.out.println("Enter your choice: ");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                    Employee emp=new Employee();
                    System.out.println("Enter ID: ");
                    id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Name: ");
                    name=sc.nextLine();
                    System.out.println("Enter Email: ");
                    email=sc.nextLine();
                    System.out.println("Enter DOB: ");
                    dob=sc.nextLine();
                    System.out.println("Enter Age: ");
                    age=sc.nextInt();
                    System.out.println("Enter Salary: ");
                    salary=sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter Status: ");
                    status=sc.nextLine();

                    emp.setId(id);
                    emp.setName(name);
                    emp.setEmail(email);
                    emp.setDOB(dob);
                    emp.setAge(age);
                    emp.setSalary(salary);
                    emp.setStatus(status);
                    s.createEmployee(emp);
                    break;

                case 2:
                    s.showAllEmployee();
                    break;

                case 3:
                    System.out.println("Enter id to show the details: ");
                    int empid=sc.nextInt();
                    s.showEmployeeBasedOnID(empid);
                    break;

                case 4:
                    try {
                        System.out.println("Enter id to update the details: ");
                        int empid1 = sc.nextInt();
                        sc.nextLine();

                        Employee up = new Employee();

                        System.out.println("Enter the new Name: ");
                        up.setName(sc.nextLine());

                        System.out.println("Enter the new Email: ");
                        up.setEmail(sc.nextLine());

                        System.out.println("Enter the new DOB: ");
                        up.setDOB(sc.nextLine());

                        System.out.println("Enter the new Age: ");
                        up.setAge(sc.nextInt());

                        System.out.println("Enter the new Salary: ");
                        up.setSalary(sc.nextDouble());
                        sc.nextLine();

                        System.out.println("Enter the new Status: ");
                        up.setStatus(sc.nextLine());

                        s.updateEmployee(empid1, up);
                        System.out.println("Employee details updated successfully!");
                    } catch (Exception ex) {
                        System.err.println("Error updating employee details: " + ex.getMessage());
                    }
                    break;

                case 5:
                    System.out.println("Enter the id to delete: ");
                    id=sc.nextInt();
                    s.deleteEmployee(id);
                    break;

                case 6:
                    System.out.println("Thank you for using the application !!");
                    System.exit(0);

                default:
                    System.out.println("Enter valid choice !!");
                    break;
            }
        }
        while(true);
    }
}