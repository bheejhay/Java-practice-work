/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metal.alloyd.DAO;

import com.metal.alloyd.model.Commonkey;
import com.metal.alloyd.model.OrdersDetails;
import java.util.List;

/**
 *
 * @author USER
 */
public interface OrdersDetailsDAO {
    
    public void addOrdersDetails (OrdersDetails od);
    
    public void updateOrdersDetails (OrdersDetails od, int alcode);
    
    public void deleteOrderDetails (int alcode);
    
    public OrdersDetails getOrderDetailsbyalcode (int alcode);
    
    public List <OrdersDetails> selectallOrders();
}
