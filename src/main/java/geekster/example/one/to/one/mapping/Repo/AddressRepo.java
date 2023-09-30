package geekster.example.one.to.one.mapping.Repo;

import geekster.example.one.to.one.mapping.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Long> {
}
