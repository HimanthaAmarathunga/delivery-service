FROM java:8
EXPOSE 9095
ADD target/DeliveryService.jar DeliveryService.jar

ENTRYPOINT ["java", "-jar", "DeliveryService.jar"]