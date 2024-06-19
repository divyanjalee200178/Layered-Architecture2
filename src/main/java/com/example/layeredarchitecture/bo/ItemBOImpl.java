package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.*;
import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ItemBOImpl {
    public ArrayList<ItemDTO> getAll() throws SQLException, ClassNotFoundException {
        ItemDAO itemDAO=new ItemDAOImpl();
        return itemDAO.getAll();
    }


    public boolean add(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    public boolean delete(String code) throws SQLException, ClassNotFoundException {
        ItemDAO itemDAO=new ItemDAOImpl();
        return itemDAO.delete(code);
    }

    public boolean save(ItemDTO dto) throws SQLException, ClassNotFoundException {
        ItemDAO itemDAO=new ItemDAOImpl();
        return itemDAO.save(dto);
    }

    public boolean update(ItemDTO dto) throws SQLException, ClassNotFoundException {
        ItemDAO itemDAO=new ItemDAOImpl();
        return itemDAO.update(dto);
    }

    public boolean exist(String code) throws SQLException, ClassNotFoundException {
        ItemDAO itemDAO=new ItemDAOImpl();
        return itemDAO.exist(code);
    }

    public String generateNew() throws SQLException, ClassNotFoundException {
        ItemDAO itemDAO=new ItemDAOImpl();
        return itemDAO.generateNew();
    }

    public ItemDTO search(String code) throws SQLException, ClassNotFoundException {
        ItemDAO itemDAO=new ItemDAOImpl();
        return itemDAO.search(code);

    }




}
