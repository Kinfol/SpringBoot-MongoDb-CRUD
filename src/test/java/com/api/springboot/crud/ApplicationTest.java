//package com.api.springboot.crud;
//
//import com.api.springboot.crud.Service.DriverService;
//import com.api.springboot.crud.model.Driver;
//import com.api.springboot.crud.repository.DriverRepository;
//import org.junit.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.web.servlet.MockMvc;
//
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import static org.hamcrest.core.Is.is;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertThat;
//import static org.mockito.Mockito.when;
//
//@ExtendWith(SpringExtension.class)
//@SpringBootTest
//public class ApplicationTest {
//
//    private DriverService service;
//
//
////    @Test
////    public void getUserByDrivingLicense() {
////        String driverLicense="phone";
////        Driver mytestDriver = repository.findByDriverLicense(driverLicense);
////
////
////        Driver expectedDriver = new Driver("nial", "jon", 12, "coffee");
////
////        assertEquals(1, "cofee");
////    }
//    @MockBean
//    private DriverRepository repository;
//
////    @Autowired
////    private DriverService driverService;
//
//    @Test
//    public void createDriver(){
//        Driver expected = new Driver("jordon", "fam", 24, "green");
//
//        DriverService driverService = new DriverService();
//
//
//        Driver returned = driverService.create("jordon", "fam", 24, "green");
//
////        assertThat(expected, is(returned));
//
////        repository.save(expected);
//
//    }
//}
