package service;

import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CustomerRepo;

import java.util.List;


    @Service
    public class CustomerService implements ICustomerService {

        private final CustomerRepo repo;

        @Autowired
        public CustomerService(CustomerRepo repo) {
            this.repo = repo;
        }

        @Override
        public List<Customer> findAll() {
            return repo.findAll();
        }

    }