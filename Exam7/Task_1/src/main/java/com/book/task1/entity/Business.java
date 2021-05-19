package com.book.task1.entity;

import lombok.Builder;
import lombok.Data;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Builder
public class Business {
    public void receivingOrders(){
        // Получаем заказы
    }
    public void serviceOrders(){
        // Обслуживаем заказы
    }
    public void receivingPayments(){
        // Получаем оплаты
    }

//    private final Factory factory;
//
//    private CustomerService(Factory factory){
//        this.factory = factory;
//    }
//
//    public CustomerService
//    private static CustomerService instance;
//    public static CustomerService getInstance(){
//        if (instance == null)
//            instance = new CustomerService();
//        return instance;
//    }

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "code", nullable = false)
//    private String code;
//
//    @Column(name = "request_time")
//    private LocalDateTime requestTime;

}
