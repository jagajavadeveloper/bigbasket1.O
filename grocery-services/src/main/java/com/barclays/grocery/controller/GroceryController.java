package com.barclays.grocery.controller;
import com.barclays.grocery.dto.OrderRequest;
import com.barclays.grocery.dto.OrderResponse;
import com.barclays.grocery.service.IGroceryService;
import com.barclays.grocery.validator.RequestValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hp ON 28-06-2023
 * @Description
 **/
@Component
@RequestMapping("/v1/groceries")
public class GroceryController {
    @Autowired
    private IGroceryService groceryService;
    @Autowired
    private RequestValidator requestValidator;

    @PostMapping("/order")
    public OrderResponse orderGrocery(@RequestBody OrderRequest orderRequest){
        requestValidator.validateRequest(orderRequest);

        OrderResponse orderResponse = groceryService.orderGrocery(orderRequest);
        return orderResponse;
    }
}
