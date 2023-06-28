package com.barclays.grocery.controller;

import com.barclays.grocery.dto.OrderResponse;
import com.barclays.grocery.exception.RequestInvalidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author hp ON 28-06-2023
 * @Description
 **/
@ControllerAdvice
public class GroceryControllerAdvise {

    @ExceptionHandler(RequestInvalidException.class)
    public OrderResponse handleInvalidException(RequestInvalidException exception){
        OrderResponse orderResponse = buildOrderResponse(exception.getErrorCode(),exception.getErrorMessage());
        return orderResponse;

    }

    private OrderResponse buildOrderResponse(String errorCode, String errorMessage) {
        OrderResponse orderResponse = new OrderResponse();
        return orderResponse;
    }
}
