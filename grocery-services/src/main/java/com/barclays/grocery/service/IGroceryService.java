package com.barclays.grocery.service;

import com.barclays.grocery.dto.OrderRequest;
import com.barclays.grocery.dto.OrderResponse;

/**
 * @author hp ON 28-06-2023
 * @Description
 **/
public interface IGroceryService {
    OrderResponse orderGrocery(OrderRequest orderRequest);
}
