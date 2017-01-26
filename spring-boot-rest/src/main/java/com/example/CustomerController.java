package com.example;

import jdk.nashorn.internal.ir.debug.JSONWriter;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ravikirannukala on 25/01/2017.
 */
@RestController
public class CustomerController {
    private CustomerRepository customerRespository;
    @Autowired
    CustomerController(CustomerRepository customerRepository){
        this.customerRespository = customerRepository;
    }
    @RequestMapping(value = "/getString", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Customer index(){
        //return this.customerRespository.findByLastName("Bauer");
        return new Customer("123","213");
    }
}
