package mapper;

import dto.CustomerDTO;
import model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import service.SimpleService;
@Mapper(componentModel = "spring")
public abstract class SimpleDestinationMapperUsingInjectedService {
    @Autowired
    protected SimpleService simpleService;
    @Mapping(target = "name", expression = "java(simpleService.enrichName(source.getName()))")
    public abstract CustomerDTO sourceToDestination(Customer source);
    public abstract Customer destinationToSource(CustomerDTO customerDTO);
}
