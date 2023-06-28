package com.barclays.grocery.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Component;

/**
 * @author hp ON 28-06-2023
 * @Description
 **/
@Component
public class GroceryDaoImpl extends StoredProcedure implements IGroceryDao{

    @Autowired
    private GroceryDaoImpl(JdbcTemplate jdbcTemplate){

    }
}
