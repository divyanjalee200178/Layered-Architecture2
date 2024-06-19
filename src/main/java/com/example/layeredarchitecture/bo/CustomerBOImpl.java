package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.CustomerDAO;
import com.example.layeredarchitecture.dao.CustomerDAOImpl;
import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CustomerBOImpl {
    public ArrayList<CustomerDTO> getAll() throws SQLException, ClassNotFoundException {
        CustomerDAO customerDAO=new CustomerDAOImpl();
        return customerDAO.getAll();
    }



    public boolean add(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        CustomerDAO customerDAO=new CustomerDAOImpl();
        return customerDAO.add(dto);

    }

    public boolean update(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        CustomerDAO customerDAO=new CustomerDAOImpl();
        return customerDAO.update(dto);
    }

    public boolean exist(String id) throws SQLException, ClassNotFoundException {
        CustomerDAO customerDAO=new CustomerDAOImpl();
        return customerDAO.exist(id);
    }

    public String generateNew() throws SQLException, ClassNotFoundException {
        CustomerDAO customerDAO=new CustomerDAOImpl();
        return customerDAO.generateNew();
    }


    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        CustomerDAO customerDAO=new CustomerDAOImpl();
        return customerDAO.delete(id);

    }


    public CustomerDTO search(String id) throws SQLException, ClassNotFoundException {
        CustomerDAO customerDAO=new CustomerDAOImpl();
        return customerDAO.search(id);
    }


    public boolean save(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        CustomerDAO customerDAO=new CustomerDAOImpl();
        return customerDAO.save(dto);
    }

}
