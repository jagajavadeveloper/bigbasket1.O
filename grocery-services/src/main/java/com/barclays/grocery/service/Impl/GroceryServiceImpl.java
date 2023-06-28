package com.barclays.grocery.service.Impl;

import com.barclays.grocery.dao.IGroceryDao;
import com.barclays.grocery.dto.OrderRequest;
import com.barclays.grocery.dto.OrderResponse;
import com.barclays.grocery.service.IGroceryService;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author hp ON 28-06-2023
 * @Description
 **/
@Component
public class GroceryServiceImpl implements IGroceryService {
    @Autowired
    private IGroceryDao groceryDao;

    @Override
    public OrderResponse orderGrocery(OrderRequest orderRequest) {
        return null;
    }
}
