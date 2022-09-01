package mapper;

import dto.CustomerDTO;
import model.Customer;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;

class CustomerToCustomerDTOMapperTest {
    private CustomerToCustomerDTOMapper mapper
            = Mappers.getMapper(CustomerToCustomerDTOMapper.class);
    @Test
    public void givenSourceToDestination_whenMaps_thenCorrect() {
        Customer customer = new Customer();
        customer.setMail("john@gmail.com");
        CustomerDTO customerDTO = mapper.sourceToDestination(customer);
        assertEquals(customer.getMail(), customerDTO.getMail());

    }
}