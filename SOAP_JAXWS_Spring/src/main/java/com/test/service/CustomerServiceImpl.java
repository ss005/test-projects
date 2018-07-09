package com.test.service;

import com.test.soapjaxwsspring.Customer;
import com.test.soapjaxwsspring.CustomerServicePortType;
import com.test.soapjaxwsspring.CustomerServiceRequestType;
import com.test.soapjaxwsspring.CustomerServiceResponseType;

import javax.jws.WebService;

@WebService(endpointInterface = "com.test.soapjaxwsspring.CustomerServicePortType")
public class CustomerServiceImpl implements CustomerServicePortType {

    public CustomerServiceResponseType getCustomer(
            CustomerServiceRequestType customerServiceRequest) {
        final CustomerServiceResponseType response = new CustomerServiceResponseType();
        Customer customer = new Customer();
        customer.setId(123);
        customer.setName("Ramesh");
        response.getCustomer().add(customer);
        return response;
    }

}