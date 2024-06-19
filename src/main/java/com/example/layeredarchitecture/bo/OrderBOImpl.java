package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.*;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderBOImpl {
    public String generateOID() throws SQLException, ClassNotFoundException {
        OrderDAO orderDAO=new OrderDAOImpl();
        return orderDAO.generateOID();
    }


    public boolean save(OrderDTO dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    public boolean existOrder(String orderId) throws SQLException, ClassNotFoundException {
        OrderDAO orderDAO=new OrderDAOImpl();
        return orderDAO.existOrder(orderId);
    }

    public boolean saveOrder(OrderDTO dto) throws SQLException, ClassNotFoundException {
        OrderDAO orderDAO=new OrderDAOImpl();
        return orderDAO.saveOrder(dto);
    }



    public ArrayList<OrderDAO> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }


    public boolean add(OrderDAO dto) throws SQLException, ClassNotFoundException {
        return false;
    }


    public boolean update(OrderDAO dto) throws SQLException, ClassNotFoundException {
        return false;
    }


    public boolean exist(String id) throws SQLException, ClassNotFoundException {
        return false;
    }


    public String generateNew() throws SQLException, ClassNotFoundException {
        return "";
    }


    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return false;
    }


    public OrderDAO search(String id) throws SQLException, ClassNotFoundException {
        return null;
    }


    public boolean save(OrderDAO dto) throws SQLException, ClassNotFoundException {
        return false;
    }

}
