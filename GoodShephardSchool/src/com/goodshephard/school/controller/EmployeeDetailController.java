/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goodshephard.school.controller;

import com.goodshephard.school.DAO.impl.EmployeeDetailDAOimpl;
import com.goodshephard.school.model.EmployeeDetail;
import java.util.List;

/**
 *
 * @author USER
 */
public class EmployeeDetailController {

    EmployeeDetailDAOimpl daoi = new EmployeeDetailDAOimpl();
    EmployeeDetail emp = new EmployeeDetail();

    public void addEmployee(String first, String last, String middle,
            String gender, String subject, String department) {

        emp.setFirstName(first);
        emp.setLastName(last);
        emp.setMiddleName(middle);
        emp.setGender(gender);
        emp.setGender(gender);
        emp.setSubject(subject);
        emp.setDepartmentNo(department);

        EmployeeDetail empdetail = new EmployeeDetail(emp.getFirstName(), emp.getLastName(), emp.getMiddleName(),
                emp.getSubject(), emp.getDepartmentNo(), emp.getGender());
        daoi.addEmployeeDetail(empdetail);
    }

    public void updateEmployee(int id, String first, String last, String middle,
            String gender, String subject, String department) {
        emp.setFirstName(first);
        emp.setLastName(last);
        emp.setMiddleName(middle);
        emp.setGender(gender);
        emp.setGender(gender);
        emp.setSubject(subject);
        emp.setDepartmentNo(department);

        EmployeeDetail empdetail = new EmployeeDetail(emp.getFirstName(), emp.getLastName(), emp.getMiddleName(),
                emp.getSubject(), emp.getDepartmentNo(), emp.getGender());
        daoi.updateEmployeeDetail(empdetail, emp.getEmployeeid());

    }

    public void deleteEmployee(int id) {
        emp.setEmployeeid(id);
        EmployeeDetail empdetail = new EmployeeDetail(emp.getEmployeeid());
        daoi.deleteEmployeeDetail(emp.getEmployeeid());
    }

    public void getEmployeeById(int id) {
        emp.setEmployeeid(id);
        EmployeeDetail empdetail = daoi.getEmployeeDetailById(emp.getEmployeeid());
        System.out.println("Id\tFirst name\tLast name\tMiddle name\tSubject\tDepartment no\tGender");
        System.out.println(empdetail.getFirstName() + "\t" + empdetail.getLastName() + "\t" + empdetail.getMiddleName() + "\t"
                + empdetail.getSubject() + "\t" + empdetail.getDepartmentNo() + "\t" + empdetail.getGender());
    }

    public void selectAllEmployee() {
        System.out.println("Id\tFirst name\tLast name\tMiddle name\tSubject\tDepartment no\tGender");
        List<EmployeeDetail> empdetail = daoi.selectAllEmployee();
        for (EmployeeDetail empdetails : empdetail) {
            System.out.println(empdetails.getFirstName() + "\t" + empdetails.getLastName() + "\t" + empdetails.getMiddleName() + "\t"
                    + empdetails.getSubject() + "\t" + empdetails.getDepartmentNo() + "\t" + empdetails.getGender());

        }

    }

}
