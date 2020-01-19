/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metal.alloyd.DAO;

import com.metal.alloyd.model.ProductDetails;
import java.util.List;

/**
 *
 * @author USER
 */
public interface ProductDetailsDAO {
    
    public void addProductDetails (ProductDetails pd);
    
    public void  updateProductDetails (ProductDetails pd,int alcode);
    
    public void deleteProductDetails (int alcode);
    
    public ProductDetails getProductDetailsbyalcode(int alcode);
    
    public List <ProductDetails> selectAllProduct(); 
}
