package mapper;

import dto.CustomerDTO;
import model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public class CustomerMapper {
    public static CustomerDTO buildCustomerDTO(Customer customer){
        return null;
    }
    public static Customer buildCustomer(CustomerDTO customerDTO){
        return null;
    }
    public static void copy(Customer customer,Customer content){

    }



}
