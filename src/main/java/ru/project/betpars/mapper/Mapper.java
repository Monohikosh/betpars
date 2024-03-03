package ru.project.betpars.mapper;

import ru.project.betpars.dto.GenericDto;
import ru.project.betpars.dto.UserDto;
import ru.project.betpars.model.GenericModel;
import ru.project.betpars.model.User;

import java.util.List;

public interface Mapper<E extends GenericModel, D extends GenericDto> {

    E toEntity(D dto);
    List<E> toEntities(List<D> dtos);

    D toDto(E entity);
    List<D> toDtos(List<E> entities);

}