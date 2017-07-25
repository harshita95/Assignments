package com.harshita.srp.assignment2;

/**
 * Created by marwahh on 7/25/2017.
 */
public class EmployeeService {
    private int empId;
    private String name;
    private double salary;
    private String phone;
    private String desig;

    public EmployeeService(int empId, String name, double salary, String phone, String desig) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.phone = phone;
        this.desig = desig;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getPhone() {
        return phone;
    }

    public String getDesig() {
        return desig;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDesig(String desig) {
        setDesig(desig);
    }

}
