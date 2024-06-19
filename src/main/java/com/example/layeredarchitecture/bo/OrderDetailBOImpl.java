package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.*;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;

public class OrderDetailBOImpl {
    public boolean saveOrderDetails(OrderDetailDTO dto) throws SQLException, ClassNotFoundException {
        OrderDetailsDAO orderDetailsDAO=new OrderDetailsDAOImpl();
        return orderDetailsDAO.saveOrderDetails(dto);
    }
}
