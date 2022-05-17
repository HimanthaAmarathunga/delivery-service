package com.deliveryService.deliveryService.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = "delivery")
public class Delivery {

    private int deliveryId;
    private String driverName;
    private String vehicleNumber;
    private Date date;
}
