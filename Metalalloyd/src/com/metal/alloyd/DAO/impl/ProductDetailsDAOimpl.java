/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metal.alloyd.DAO.impl;

import com.metal.alloyd.DAO.ProductDetailsDAO;
import com.metal.alloyd.model.ProductDetails;
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
public class ProductDetailsDAOimpl implements ProductDetailsDAO {

    ProductDetails prod = new ProductDetails();

    @Override
    public void addProductDetails(ProductDetails pd) {
        Connection cont = null;
        PreparedStatement prestate = null;

        try {
            cont = DButil.getconnection();
            String sql = "INSERT INTO ProductDetails (Alcode, Name, Thickness, EmpNum) VALUES (?,?,?,?)";

            prestate = cont.prepareStatement(sql);
            prestate.setInt(1, prod.getAlcode());
            prestate.setString(2, prod.getName());
            prestate.setDouble(3, prod.getThickness());
            prestate.setInt(4, prod.getEmpNum());
            prestate.executeUpdate();
            System.out.println("Products Details successfully Added");
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            if (prestate != null) {
                try {
                    prestate.close();
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
    public void updateProductDetails(ProductDetails pd, int alcode) {
        Connection cont = null;
        PreparedStatement prestate = null;
        try {
            cont = DButil.getconnection();
            String sql = "UPDATE ProductDetails SET Alcode = ?, Name = ?, Thickness = ?,EmpNum =?";
            prestate = cont.prepareStatement(sql);
            prestate.setInt(1, prod.getAlcode());
            prestate.setString(2, prod.getName());
            prestate.setDouble(3, prod.getThickness());
            prestate.setInt(4, prod.getEmpNum());
            prestate.executeUpdate();
            System.out.println("Product Details is updated succefully");

        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            if (prestate != null) {
                try {
                    prestate.close();
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
    public void deleteProductDetails(int alcode) {
        Connection cont = null;
        PreparedStatement presstate = null;

        try {
            cont = DButil.getconnection();
            String sql = "DELETE FROM ProductDetails WHERE alcode = ?";
            presstate = cont.prepareStatement(sql);
            presstate.setInt(1, prod.getAlcode());
            presstate.executeUpdate();
            System.out.println("Products Deleted Successfully");

        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            if (presstate != null) {
                try {
                    presstate.close();
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
    public ProductDetails getProductDetailsbyalcode(int alcode) {
        Connection cont = null;
        PreparedStatement presstate = null;
        ResultSet res = null;
        try {
            cont = DButil.getconnection();
            String sql = "SELECT * FROM ProductDetails WHERE alcode = ?";
            presstate = cont.prepareStatement(sql);
            presstate.setInt(1, alcode);
            res = presstate.executeQuery();

            while (res.next()) {
                prod.setAlcode(res.getInt("Alcode"));
                prod.setName(res.getString("Name"));
                prod.setThickness(res.getDouble("Thickness"));
                prod.setEmpNum(res.getInt("Empnum"));
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            if (res != null) {
                try {
                    res.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
            if (presstate != null) {
                try {
                    presstate.close();
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
        return prod;
    }

    @Override
    public List<ProductDetails> selectAllProduct() {
        List<ProductDetails> prods = new ArrayList<>();
        Statement state = null;
        Connection cont = null;
        ResultSet res = null;

        try {
            cont = DButil.getconnection();
            String sql = "SELECT * FROM ProductDetails";
            state = cont.createStatement();
            res = state.executeQuery(sql);
            
            while (res.next()){
                prod.setAlcode(res.getInt("Alcode"));
                prod.setName(res.getString("Name"));
                prod.setThickness(res.getDouble("Thickness"));
                prod.setEmpNum(res.getInt("Empnum"));
            }
        }catch (SQLException se){
            se.printStackTrace();
        }
        finally{
            if(res != null){
                try{
                    res.close();
                }catch(SQLException se){
                    se.printStackTrace();
                }
            }
            if(state != null){
                try{
                    state.close();
                }catch(SQLException se){
                    se.printStackTrace();
                }
            }
            if (cont != null){
                try{
                    cont.close();
                }catch(SQLException se){
                    se.printStackTrace();
                }
                }
            }
        return prods;
        }
    }


