package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CustomerDTO {
    private Long id;
    private String lastname;
    private String firstname;
    private String company;
    private String mail;
    private String phone;
    private String address;
    private String zipCode;
    private String city;
    private String country;
    private String state;
}
