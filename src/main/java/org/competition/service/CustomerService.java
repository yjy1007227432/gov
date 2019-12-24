package org.competition.service;

import org.competition.bean.IdAndName;
import org.competition.domain.Customer;
import org.competition.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    public List<IdAndName> selectIdAndName(){
        List<IdAndName> result = new ArrayList<>();
        List<Customer>  customers= new ArrayList<>();
        customers = customerMapper.selectByExample(null);

        for(Customer customer:customers){
            IdAndName idAndName = new IdAndName(customer.getId(),customer.getName());
            result.add(idAndName);
        }
        return result;
    }

}
