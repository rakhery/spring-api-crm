package mapper;
import dto.CustomerDTO;
import model.Customer;
import org.mapstruct.Mapper;

//@Mapper
public interface CustomerToCustomerDTOMapper {
    CustomerDTO sourceToDestination(Customer customer);
    Customer destinationToSource(CustomerDTO customerDTO);
}
