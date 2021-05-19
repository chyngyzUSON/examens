package com.book.task1.entity;

import com.book.task1.enums.BusinessType;

public class Company {
    private final BusinessFactory businessFactory;

    public Company(BusinessFactory businessFactory){
        this.businessFactory = businessFactory;
    }

    public Business order(BusinessType businessType){
        Business business = businessFactory.createBusiness(businessType);
        business.receivingOrders();
        business.serviceOrders();
        business.receivingPayments();

        return business;
    }
}
