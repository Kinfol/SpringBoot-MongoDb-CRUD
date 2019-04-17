package com.api.springboot.crud.repository;

import com.api.springboot.crud.model.Driver;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverRepository extends MongoRepository<Driver, String> {
    public Driver findByDriverLicense(String driverLicense);
//    public List<Driver> findByAge(int age);
}
