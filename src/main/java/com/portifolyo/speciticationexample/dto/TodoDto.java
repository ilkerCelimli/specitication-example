package com.portifolyo.speciticationexample.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TodoDto {

    private String title;
    private String todo;
    private boolean isDone;
    private UserDto userDto;


}
