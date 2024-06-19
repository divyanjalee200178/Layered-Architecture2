package com.example.layeredarchitecture.dao;


import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.SQLException;

public interface OrderDAO extends CrudDAO<OrderDAO>{
    public String generateOID() throws SQLException, ClassNotFoundException;
    public boolean save(OrderDTO dto) throws SQLException, ClassNotFoundException;
    public boolean saveOrder(OrderDTO dto) throws SQLException, ClassNotFoundException;
    public boolean existOrder(String orderId) throws SQLException, ClassNotFoundException ;
}
