package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="lastname")
    private String lastname;

    @Column(name="firstname")
    private String firstname;

    @Column(name="company")
    private String company;

    @Column(name="mail")
    private String mail;

    @Column(name="phone")
    private String phone;

    @Column(name="address")
    private String address;

    @Column(name="zipCode")
    private String zipCode;

    @Column(name="city")
    private String city;

    @Column(name="country")
    private String country;

    @Column(name="state",columnDefinition = "TINYINT(1) DEFAULT 1")
    private Boolean state;

  /*  @Column(name="orders")
    @OneToMany
    private List<Order> orders;*/

}