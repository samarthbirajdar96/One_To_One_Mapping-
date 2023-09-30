package geekster.example.one.to.one.mapping.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Emp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long empId;

    private String firstName;

    private  String lastName;

    private  String empAddress;

    @OneToOne
    @JoinColumn(name="fk_addressId")
    Address address;

}
