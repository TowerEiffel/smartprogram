package com.smart.program.response.order;

import java.util.List;

public class OrderResponseList {

    private List<OrderResponse> unPayResponses;

    private List<OrderResponse> payResponses;

    private List<OrderResponse> cancelResponses;

    public OrderResponseList() {
    }

    public List<OrderResponse> getUnPayResponses() {
        return unPayResponses;
    }

    public void setUnPayResponses(List<OrderResponse> unPayResponses) {
        this.unPayResponses = unPayResponses;
    }

    public List<OrderResponse> getPayResponses() {
        return payResponses;
    }

    public void setPayResponses(List<OrderResponse> payResponses) {
        this.payResponses = payResponses;
    }

    public List<OrderResponse> getCancelResponses() {
        return cancelResponses;
    }

    public void setCancelResponses(List<OrderResponse> cancelResponses) {
        this.cancelResponses = cancelResponses;
    }
}
