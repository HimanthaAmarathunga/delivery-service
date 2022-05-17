package com.deliveryService.deliveryService.repository;

import com.deliveryService.deliveryService.entity.Delivery;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeliveryRepository extends MongoRepository<Delivery, Integer> {
}
