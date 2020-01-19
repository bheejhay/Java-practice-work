/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metal.alloyd.DAO.impl;

import com.metal.alloyd.DAO.OrdersDetailsDAO;
import com.metal.alloyd.model.OrdersDetails;
import com.metal.alloyd.util.DButil;
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
public class OrderDetailsDAOImpl implements OrdersDetailsDAO {

    OrdersDetails ord = new OrdersDetails();

    @Override
    public void addOrdersDetails(OrdersDetails od) {
        PreparedStatement pres = null;
        Connection cont = null;
        try {
            cont = DButil.getconnection();
            String sql = "INSERT INTO OrdersDetails ( Custnum, Alcode, datein, Qty) VALUES (?,?,?,?)";
            pres = cont.prepareStatement(sql);
            pres.setInt(1, ord.getCustNum());
            pres.setInt(2, ord.getAlcode());
            pres.setString(3, ord.getDate());
            pres.setInt(4, ord.getQty());
            pres.executeUpdate();
            System.out.println("Orders Details Added Successfully");
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            if (pres != null) {
                try {
                    pres.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
            if (cont != null) {
                try {
                    cont.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
        }
    }

    @Override
    public void updateOrdersDetails(OrdersDetails od, int alcode) {
        Connection cont = null;
        PreparedStatement pres = null;

        try {
            cont = DButil.getconnection();
            String sql = "UPDATE OrderDetails SET Custnum =?, Alcode = ?, datein = ?, Qty =? ";
            pres = cont.prepareStatement(sql);
            pres.setInt(1, ord.getCustNum());
            pres.setInt(2, ord.getAlcode());
            pres.setString(3, ord.getDate());
            pres.setInt(4, ord.getQty());
            pres.executeUpdate();
            System.out.println("Orders Updated Successfully");
        } catch (SQLException se) {
            se.printStackTrace();

        } finally {
            if (pres != null) {
                try {
                    pres.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
            if (cont != null) {
                try {
                    cont.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }

        }
    }

    @Override
    public void deleteOrderDetails(int alcode) {
        Connection cont = null;
        PreparedStatement pres = null;

        try {
            cont = DButil.getconnection();
            String sql = "DELETE FROM OrdersDetails WHERE alcode = ?";
            pres = cont.prepareStatement(sql);
            pres.setInt(1, ord.getAlcode());
            pres.executeUpdate();
            System.out.println("Order(s) deleted Successfully");
        } catch (SQLException se) {
            se.printStackTrace();
        }
        if (pres != null) {
            try {
                pres.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        if (cont != null) {
            try {
                cont.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    @Override
    public OrdersDetails getOrderDetailsbyalcode(int alcode) {
        Connection cont = null;
        PreparedStatement pres = null;
        ResultSet ret = null;

        try {
            cont = DButil.getconnection();
            String sql = "SELECT * FROM OrderDetails WHERE alcode =? ";
            pres = cont.prepareStatement(sql);
            pres.setInt(1, alcode);
            ret = pres.executeQuery();

            while (ret.next()) {
                ord.setCustNum(ret.getInt("Custnum"));
                ord.setAlcode(ret.getInt("Alcode"));
                ord.setDate(ret.getString("datein"));
                ord.setQty(ret.getInt("Qty"));
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            if (ret != null) {
                try {
                    ret.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
            if (pres != null) {
                try {
                    pres.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
            if (cont != null) {
                try {
                    cont.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
        }
        return ord;
    }

    @Override
    public List<OrdersDetails> selectallOrders() {
        Connection cont = null;
        Statement state = null;
        ResultSet ret = null;
        List<OrdersDetails> ords = new ArrayList<>();

        try {
            cont = DButil.getconnection();
            String sql = "SELECT * FROM OrdersDetails ";
            state = cont.createStatement();
            ret = state.executeQuery(sql);

            while (ret.next()) {
                ord.setCustNum(ret.getInt("Custnum"));
                ord.setAlcode(ret.getInt("Alcode"));
                ord.setDate(ret.getString("datein"));
                ord.setQty(ret.getInt("Qty"));
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            if (ret != null) {
                try {
                    ret.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
            if (state != null) {
                try {
                    state.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
            if (cont != null) {
                try {
                    cont.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }

            }
        }
        return ords;
    }

}
