package geekster.example.one.to.one.mapping.Controller;

import geekster.example.one.to.one.mapping.Model.Address;
import geekster.example.one.to.one.mapping.Service.ServiceAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    ServiceAddress serviceAddress;

    @PostMapping("address")
    public String addAddress(@RequestBody Address newAddress)
    {
        return serviceAddress.addAddress(newAddress);
    }
    @GetMapping("address")
        public List<Address> getaddress(){
        return serviceAddress.getaddress();
        }

    @GetMapping("address/id/{id}")
    public Address getaddressbyid(@PathVariable Long id){
        return serviceAddress.getaddressbyid(id);
    }

    @PutMapping("address/id/{id}")
    public String updateaddressbyid(@PathVariable Long id,@RequestParam String city ){
        return serviceAddress.updateaddressbyid(id,city);
    }

    @DeleteMapping("address/id/{id}")
    public String removeaddress(@PathVariable Long id){
        return serviceAddress.removeaddress(id);
    }

}
