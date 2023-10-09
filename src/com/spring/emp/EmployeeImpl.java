package com.spring.emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
public class EmployeeImpl implements EmployeeInt{
    Connection con;
    @Override
    public void createEmployee(Employee emp) {
        con = DBconnection.createDBConnection();
        String query="insert into employeelist values(?,?,?,?,?,?,?)";
        try{
            PreparedStatement pstm= con.prepareStatement(query);
            pstm.setInt(1,emp.getId());
            pstm.setString(2,emp.getName());
            pstm.setString(3,emp.getEmail());
            pstm.setString(4,emp.getDOB());
            pstm.setInt(5,emp.getAge());
            pstm.setDouble(6,emp.getSalary());
            pstm.setString(7,emp.getstatus());
            int cnt=pstm.executeUpdate();
            if(cnt!=0)
                System.out.println("Employee inserted successfully");
        }
        catch(Exception ex){
            ex.printStackTrace();

        }
    }

    @Override
    public void showAllEmployee() {
        con=DBconnection.createDBConnection();
        String query="select * from employeelist";
        System.out.println("Employee details:");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.format("%-5s  %-25s  %-30s  %-15s  %-5s  %-10s  %-10s%n","ID","Name","Email","DOB","Age","Salary","Status");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        try{
            Statement stmt=con.createStatement();
            ResultSet result=stmt.executeQuery(query);
            while(result.next()){
                System.out.format("%-5d  %-25s  %-30s  %-15s  %-5d  %-10.2f  %-10s%n",
                        result.getInt(1),
                        result.getString(2),
                        result.getString(3),
                        result.getString(4),
                        result.getInt(5),
                        result.getDouble(6),
                        result.getString(7)
                );

                System.out.println("-----------------------------------------------------------------------------------------------------------------");
            }

        }
        catch(Exception ex){
            ex.printStackTrace();

        }

    }

    @Override
    public void showEmployeeBasedOnID(int id) {
        con=DBconnection.createDBConnection();
        String query="select * from employeelist where id="+id;
        try{
            Statement stmt=con.createStatement();
            ResultSet result=stmt.executeQuery(query);

            while(result.next()){
                System.out.format("%-5s  %-25s  %-30s  %-15s  %-5s  %-10s  %-10s%n","ID","Name","Email","DOB","Age","Salary","Status");
                System.out.println("-----------------------------------------------------------------------------------------------------------");
                System.out.format("%-5d  %-25s  %-30s  %-15s  %-5d  %-10.2f  %-10s%n",
                        result.getInt(1),
                        result.getString(2),
                        result.getString(3),
                        result.getString(4),
                        result.getInt(5),
                        result.getDouble(6),
                        result.getString(7)
                        );
                System.out.println("-----------------------------------------------------------------------------------------------------------");
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public void updateEmployee(int empid, Employee up, int id, String name, String dob, int age, double salary, String status) {

    }


    @Override
    public void updateEmployee(int id, int empid1, String name, String dob, int age, double salary, String status) {
        con = DBconnection.createDBConnection();
        String query = "update employeelist set name=?, dob=?, age=?, salary=?, status=? where id=?";
        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1, name);
            pstm.setString(2, dob);
            pstm.setInt(3, age);
            pstm.setDouble(4, salary);
            pstm.setString(5, status);
            pstm.setInt(6, id);
            int cnt = pstm.executeUpdate();
            if (cnt != 0) {
                System.out.println("Employee details updated successfully !!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void updateEmployee(int empid1, Employee up) {
        con = DBconnection.createDBConnection();
    }

    @Override
    public void deleteEmployee(int id) {
        con=DBconnection.createDBConnection();
        String query="delete from employeelist where id=?";
        try{
            PreparedStatement pstm=con.prepareStatement(query);
            pstm.setInt(1,id);
            int cnt=pstm.executeUpdate();
            if(cnt!=0)
                System.out.println("Employee deleted successfully !!"+id);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

    }
}
