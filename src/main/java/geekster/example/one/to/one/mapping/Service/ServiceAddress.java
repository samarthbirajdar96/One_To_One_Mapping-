package geekster.example.one.to.one.mapping.Service;

import geekster.example.one.to.one.mapping.Model.Address;
import geekster.example.one.to.one.mapping.Repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceAddress {

    @Autowired
    AddressRepo addressRepo;

    public String addAddress(Address newAddress) {
        addressRepo.save(newAddress);
        return "added";
    }

    public List<Address> getaddress() {
        return addressRepo.findAll();
    }

    public Address getaddressbyid(Long id) {
        return addressRepo.findById(id).orElseThrow();
    }

    public String updateaddressbyid(Long id, String city) {
        Address myaddress = addressRepo.findById(id).orElseThrow();
        myaddress.setCity(city);
        addressRepo.save(myaddress);
        return "updated";

    }

    public String removeaddress(Long id) {
        addressRepo.deleteById(id);
        return "deleted";
    }
}
