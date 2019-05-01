package com.api.springboot.crud.controller;

import com.api.springboot.crud.Service.DriverService;
import com.api.springboot.crud.model.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DriverController {

    @Autowired
    private DriverService driverService;

    @RequestMapping("/create")
    public String create(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int age, @RequestParam String driverLicense) {
        Driver p = driverService.create(firstName, lastName, age, driverLicense);
        return p.toString();
    }

    @RequestMapping("/get")
    public Driver getDriver(@RequestParam String driverLicense) {
        return driverService.getByDriverLicense(driverLicense);
    }

    @RequestMapping("/getAll")
    public List<Driver> getAll() {
        return driverService.getAll();
    }

    @RequestMapping("/update")
    public String update(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int age, @RequestParam String driverLicense) {
        Driver p = driverService.update(firstName, lastName, age, driverLicense);
        return p.toString();
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam String driverLicense) {
        driverService.delete(driverLicense);
        return "Deleted " + driverLicense;
    }

    @RequestMapping("/deleteAll")
    public String deleteAll() {
        driverService.deleteAll();
        return "Deleted all records";
    }
}
