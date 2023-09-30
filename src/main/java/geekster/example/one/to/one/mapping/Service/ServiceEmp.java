package geekster.example.one.to.one.mapping.Service;


import geekster.example.one.to.one.mapping.Model.Emp;
import geekster.example.one.to.one.mapping.Repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceEmp {

    @Autowired
    EmpRepo empRepo;


    public String addemp(Emp emp) {
        empRepo.save(emp);
        return "added";
    }


    public List<Emp> getemp() {
        return empRepo.findAll();
    }

    public Emp getempbyid(Long id) {
        return empRepo.findById(id).orElseThrow();
    }

    public String updateempbyid(Long id, String lastname) {
        Emp emp = empRepo.findById(id).orElseThrow();
        emp.setLastName(lastname);
        empRepo.save(emp);
        return "updated";

    }

    public String removeemp(Long id) {
        empRepo.deleteById(id);
        return "deleted";
    }
}
