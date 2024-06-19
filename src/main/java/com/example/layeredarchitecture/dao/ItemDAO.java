package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemDAO extends CrudDAO<ItemDTO> {


    public boolean save(ItemDTO dto) throws SQLException, ClassNotFoundException;

}
