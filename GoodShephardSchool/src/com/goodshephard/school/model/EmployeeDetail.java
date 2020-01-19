/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goodshephard.school.model;

/**
 *
 * @author USER
 */
public class EmployeeDetail {
    
    private int employeeid;
    private String firstName, lastName,middleName, subject, departmentNo,gender;

    public EmployeeDetail() {
    }

    public EmployeeDetail(int employeeid) {
        this.employeeid = employeeid;
    }

    public EmployeeDetail(int employeeid, String firstName, String lastName, String middleName, String subject, String departmentNo, String gender) {
        this.employeeid = employeeid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.subject = subject;
        this.departmentNo = departmentNo;
        this.gender = gender;
    }

    public EmployeeDetail(String firstName, String lastName, String middleName, String subject, String departmentNo, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.subject = subject;
        this.departmentNo = departmentNo;
        this.gender = gender;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int emplyeeid) {
        this.employeeid = emplyeeid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getDepartmentNo() {
        return departmentNo;
    }

    public void setDepartmentNo(String departmentNo) {
        this.departmentNo = departmentNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    

    @Override
    public String toString() {
        return "EmployeeDetail{" + "emplyeeid=" + employeeid + ", firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName + ", departmentNo=" + departmentNo + ", gender=" + gender + '}';
    }
    
    
}
