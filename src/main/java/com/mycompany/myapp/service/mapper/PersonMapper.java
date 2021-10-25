package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.Person;
import com.mycompany.myapp.service.dto.PersonDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Person} and its DTO {@link PersonDTO}.
 */
@Mapper(componentModel = "spring", uses = { LanguageMapper.class })
public interface PersonMapper extends EntityMapper<PersonDTO, Person> {
    @Mapping(target = "language", source = "language", qualifiedByName = "id")
    PersonDTO toDto(Person s);

    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    PersonDTO toDtoId(Person person);
}
