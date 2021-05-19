package com.book.task1.entity;

import com.book.task1.enums.BusinessType;

public class BusinessFactory {
    public Business createBusiness(BusinessType businessType){
        Business business = null;

        switch (businessType){
            case  RESTAURANT:
            business = new Restaurant();
            break;

            case CINEMA:
            business = new Cinema();
            break;

            case TICKET:
            business = new Ticket();
            break;

//            default:
//                throw new IllegalArgumentException("не найдено");
        }
        return business;
    }
}
