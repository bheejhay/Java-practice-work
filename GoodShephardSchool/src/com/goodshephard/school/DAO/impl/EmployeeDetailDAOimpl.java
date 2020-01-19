/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goodshephard.school.DAO.impl;

import com.goodshephard.school.DAO.EmployeeDetailDAO;
import com.goodshephard.school.model.EmployeeDetail;
import com.goodshephard.school.util.DButil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class EmployeeDetailDAOimpl implements EmployeeDetailDAO {

    @Override
    public void addEmployeeDetail(EmployeeDetail emp) {
        Connection conn = null;
        PreparedStatement prepstatement = null;

        try {
            conn = DButil.getConnection();
            String sql = "INSERT INTO employeedetail(firstname, lastname, middlename, gender, subject, departmentno)"
                    + " VALUES(?,?,?,?,?,?) ";
            prepstatement = conn.prepareStatement(sql);
            prepstatement.setString(1, emp.getFirstName());
            prepstatement.setString(2, emp.getLastName());
            prepstatement.setString(3, emp.getMiddleName());
            prepstatement.setString(4, emp.getGender());
            prepstatement.setString(5, emp.getSubject());
            prepstatement.setString(6, emp.getDepartmentNo());
            prepstatement.executeUpdate();
            System.out.println("Employee details Succefully added");
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            if (prepstatement != null) {
                try {
                    prepstatement.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
        }
    }

    @Override
    public void updateEmployeeDetail(EmployeeDetail emp, int employeeId) {
        Connection conn = null;
        PreparedStatement prepstatement = null;
        try {
            conn = DButil.getConnection();
            String sql = "UPDATE employeedetail SET firstname = ?, lastname=?, middlename = ?, "
                    + "gender =?, subject = ?, departmentno = ? WHERE employeeid = ?";
            prepstatement = conn.prepareStatement(sql);
            prepstatement.setString(1, emp.getFirstName());
            prepstatement.setString(2, emp.getLastName());
            prepstatement.setString(3, emp.getMiddleName());
            prepstatement.setString(4, emp.getGender());
            prepstatement.setString(5, emp.getSubject());
            prepstatement.setString(6, emp.getDepartmentNo());
            prepstatement.setInt(7, employeeId);
            prepstatement.executeUpdate();
            System.out.println("Employee details updated successfully");

        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            if (prepstatement != null) {
                try {
                    prepstatement.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
        }
    }

    @Override
    public void deleteEmployeeDetail(int EmployeeId) {
        Connection conn = null;
        PreparedStatement prepstatement = null;
        try {
            conn = DButil.getConnection();
            String sql = "DELETE FROM employeedetail WHERE employeeid = ?";
            prepstatement = conn.prepareStatement(sql);
            prepstatement.setInt(1, EmployeeId);
            prepstatement.executeUpdate();
            System.out.println("Employee Details Deleted Successfully");
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            if (prepstatement != null) {
                try {
                    prepstatement.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
        }
    }

    @Override
    public EmployeeDetail getEmployeeDetailById(int employeeId) {
        EmployeeDetail emp = new EmployeeDetail();
        Connection conn = null;
        PreparedStatement prepstatement = null;
        ResultSet resset = null;
        try {
            conn = DButil.getConnection();
            String sql = "SELECT * FROM employeedetail WHERE employeeid = ? ";
            prepstatement = conn.prepareStatement(sql);
            prepstatement.setInt(1, employeeId);
            resset = prepstatement.executeQuery();
            while (resset.next()) {
                emp.setEmployeeid(resset.getInt("employeeid"));
                emp.setFirstName(resset.getString("firstname"));
                emp.setLastName(resset.getString("lastname"));
                emp.setMiddleName(resset.getString("middlename"));
                emp.setGender(resset.getString("gender"));
                emp.setSubject(resset.getString("subject"));
                emp.setDepartmentNo(resset.getString("departmentno"));

            }
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            if (resset != null) {
                try {
                    prepstatement.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }

                if (prepstatement != null) {
                    try {
                        prepstatement.close();
                    } catch (SQLException se) {
                        se.printStackTrace();
                    }
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException se) {
                        se.printStackTrace();
                    }
                }
            }
        }
        return emp;
    }

    @Override
    public List<EmployeeDetail> selectAllEmployee() {
        EmployeeDetail emp = new EmployeeDetail();
        List<EmployeeDetail> emps = new ArrayList<>();
        ResultSet resset = null;
        Statement state = null;
        Connection conn = null;

        try {
            conn = DButil.getConnection();
            String sql = "SELECT * FROM employeedetail ";
            state = conn.createStatement();
            resset = state.executeQuery(sql);

            while (resset.next()) {
                emp.setEmployeeid(resset.getInt("employeeid"));
                emp.setFirstName(resset.getString("firstname"));
                emp.setLastName(resset.getString("lastname"));
                emp.setMiddleName(resset.getString("middlename"));
                emp.setGender(resset.getString("gender"));
                emp.setSubject(resset.getString("subject"));
                emp.setDepartmentNo(resset.getString("departmentno"));
                emps.add(emp);
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            if (resset != null) {
                try {
                    state.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }

                if (state != null) {
                    try {
                        state.close();
                    } catch (SQLException se) {
                        se.printStackTrace();
                    }
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException se) {
                        se.printStackTrace();
                    }
                }
            }

        }
        return emps;
    }
}
