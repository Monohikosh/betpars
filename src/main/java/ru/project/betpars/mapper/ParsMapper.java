package ru.project.betpars.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import ru.project.betpars.dto.ParsDto;
import ru.project.betpars.model.Pars;

@Component
public class ParsMapper extends GenericMapper<Pars, ParsDto> {

    protected ParsMapper(ModelMapper mapper) {
        super(mapper, Pars.class, ParsDto.class);
    }
}