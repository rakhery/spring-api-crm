package mapper;

import dto.CustomerDTO;
import model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {
    CustomerMapper INSTANCE= Mappers.getMapper(CustomerMapper.class);
    CustomerDTO CustomerToCustomerDTO(Customer customer);
}




