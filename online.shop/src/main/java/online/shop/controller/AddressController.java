package online.shop.controller;

import online.shop.model.Address;
import online.shop.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {

    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;

    }
    @PostMapping
    public void createOrUpdateAddress(@RequestBody Address address){
        addressService.createOrUpdateAddress(address);
    }
}
