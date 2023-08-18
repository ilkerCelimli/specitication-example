package com.portifolyo.speciticationexample.mapper;

import com.portifolyo.speciticationexample.dto.TodoDto;
import com.portifolyo.speciticationexample.entity.Todo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TodoMapper {
    @Mappings({
            @Mapping(source = "title",target = "title"),
            @Mapping(source = "todo",target = "todo"),
            @Mapping(source = "userDto.password", target = "user.password"),
            @Mapping(source = "userDto.username",target = "user.username")
    })
    Todo toEntity(TodoDto todoDto);


}
