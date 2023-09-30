package geekster.example.one.to.one.mapping.Repo;

import geekster.example.one.to.one.mapping.Model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EmpRepo extends JpaRepository<Emp,Long> {
}
