package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.Customer;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class OrderDTO {
    private Long id;
    private String type;
    private Customer customer;
    private int numberOfsDays;
    private double unitPrice;
    private double totalExcludeVAT;
    private double totalWithVAT;
    private String status;
}
