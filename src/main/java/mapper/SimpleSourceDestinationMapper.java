package mapper;

import dto.CustomerDTO;
import model.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SimpleSourceDestinationMapper {

    CustomerDTO sourceToDestination(Customer customer);

    Customer destinationToSource(CustomerDTO CustomerDTO);
}
