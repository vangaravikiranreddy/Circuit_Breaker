package com.ajcode.OrderService;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {

    List<Order> findByCategory(String category);


}
