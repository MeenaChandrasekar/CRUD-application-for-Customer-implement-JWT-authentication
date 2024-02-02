package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import com.SunbaseData.demo.Sunbase.model.Customer;
import com.SunbaseData.demo.Sunbase.service.CustomerService;

@RestController
@RequestMapping("/api/customer-sync")
public class CustomerSyncController {

    @Autowired
    private CustomerService customerSyncService;

    @GetMapping
    public List<Customer> getAllCustomerSync() {
        return customerSyncService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Optional<Customer> getCustomerSyncById(@PathVariable Long id) {
        return customerSyncService.getCustomerById(id);
    }

    @PostMapping
    public Customer createCustomerSync(@RequestBody CustomerSyncController customerSync) {
        return customerSyncService.createCustomer(customerSync);
    }

    @PutMapping("/{id}")
    public Customer updateCustomerSync(@PathVariable Long id, @RequestBody CustomerSyncController customerSync) {
        return customerSyncService.updateCustomer(id, customerSync);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomerSync(@PathVariable Long id) {
        customerSyncService.deleteCustomer(id);
    }
}
