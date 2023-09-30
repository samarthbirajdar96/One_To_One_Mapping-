package geekster.example.one.to.one.mapping.Controller;


import geekster.example.one.to.one.mapping.Model.Emp;
import geekster.example.one.to.one.mapping.Service.ServiceEmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {

    @Autowired
    ServiceEmp serviceEmp;

    @PostMapping("emp")
    public String addemp(@RequestBody Emp emp)
    {
        return serviceEmp.addemp(emp);
    }
    @GetMapping("emp")
    public List<Emp> getemp(){
        return serviceEmp.getemp();
    }

    @GetMapping("emp/id/{id}")
    public Emp getempbyid(@PathVariable Long id){
        return serviceEmp.getempbyid(id);
    }

    @PutMapping("emp/id/{id}")
    public String updateempbyid(@PathVariable Long id,@RequestParam String lastname ){
        return serviceEmp.updateempbyid(id,lastname);
    }

    @DeleteMapping("emp/id/{id}")
    public String removeemp(@PathVariable Long id){
        return serviceEmp.removeemp(id);
    }
}
