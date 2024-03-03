package ru.project.betpars.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import ru.project.betpars.dto.UserDto;
import ru.project.betpars.model.User;

@Component
public class UserMapper extends GenericMapper<User, UserDto> {

    protected UserMapper(ModelMapper mapper) {
        super(mapper, User.class, UserDto.class);
    }
}
