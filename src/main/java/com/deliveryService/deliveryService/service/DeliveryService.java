package com.deliveryService.deliveryService.service;

import com.deliveryService.deliveryService.entity.Delivery;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeliveryService {

    Delivery addDelivery(Delivery delivery);
    List<Delivery> getAllDeliveries();
}
