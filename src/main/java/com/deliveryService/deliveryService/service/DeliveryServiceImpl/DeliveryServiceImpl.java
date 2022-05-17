package com.deliveryService.deliveryService.service.DeliveryServiceImpl;

import com.deliveryService.deliveryService.entity.Delivery;
import com.deliveryService.deliveryService.repository.DeliveryRepository;
import com.deliveryService.deliveryService.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryServiceImpl implements DeliveryService {

    @Autowired
    DeliveryRepository deliveryRepository;


    @Override
    public Delivery addDelivery(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }

    @Override
    public List<Delivery> getAllDeliveries() {
        return (List<Delivery>) deliveryRepository.findAll();
    }
}
