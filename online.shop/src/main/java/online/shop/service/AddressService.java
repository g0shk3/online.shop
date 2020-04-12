package online.shop.service;

import online.shop.model.Address;
import online.shop.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    private final AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public void createOrUpdateAddress(Address address){
        if(null== address.getId()){
            createAddress(address);
            return;
        }
        updateAddress(address);
    }
    public void createAddress(Address address){
        addressRepository.save(address);
    }
    public void updateAddress(Address address){
        addressRepository.save(address);
    }
}
