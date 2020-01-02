package org.competition.service;

import org.competition.dao.IdAndName;
import org.competition.domain.Customer;
import org.competition.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Component
@RestController
@RequestMapping("/gov/customer")
@CrossOrigin(allowCredentials = "true", allowedHeaders = "*")
public class CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    @GetMapping(value = "/selectIdAndName")
    public List<IdAndName> selectIdAndName(){
        List<IdAndName> result = new ArrayList<>();
        List<Customer> customers = customerMapper.selectByExample(null);

        for(Customer customer:customers){
            IdAndName idAndName = new IdAndName(customer.getId(),customer.getName());
            result.add(idAndName);
        }
        return result;
    }

}
