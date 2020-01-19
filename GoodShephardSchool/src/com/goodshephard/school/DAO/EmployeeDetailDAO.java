/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goodshephard.school.DAO;

import com.goodshephard.school.model.EmployeeDetail;
import java.util.List;

/**
 *
 * @author USER
 */
    public interface EmployeeDetailDAO {

    // add employee to database
    public void addEmployeeDetail(EmployeeDetail emp);

    //update employee in database
    public void updateEmployeeDetail(EmployeeDetail emp, int employeeId);

    // delete employee
    public void deleteEmployeeDetail(int EmployeeId);

    // find a particular employee
    public EmployeeDetail getEmployeeDetailById(int employeeId);

    //find all employee
    public List<EmployeeDetail> selectAllEmployee();
}
