package com.api.springboot.crud.Service;

import com.api.springboot.crud.model.Driver;
import com.api.springboot.crud.repository.DriverRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    //Create operation
    public Driver create(String firstName, String lastName, int age, String driverLicense) {
        return driverRepository.save(new Driver(firstName, lastName, age, driverLicense));
    }

    //Retrieve operation
    public List<Driver> getAll() {
        return driverRepository.findAll();
    }

    public Driver getByDriverLicense(String driverLicense) {
        return driverRepository.findByDriverLicense(driverLicense);
    }

    //Update operation
    public Driver update(String firstName, String lastName, int age, String driverLicense) {
        Driver p = driverRepository.findByDriverLicense(driverLicense);
        p.setLastName(firstName);
        p.setLastName(lastName);
        p.setAge(age);
        return driverRepository.save(p);
    }

    //Delete operation
    public void deleteAll() {
        driverRepository.deleteAll();
    }

    public void delete(String firstName) {
        Driver p = driverRepository.findByDriverLicense(firstName);
        driverRepository.delete(p);
    }
}

