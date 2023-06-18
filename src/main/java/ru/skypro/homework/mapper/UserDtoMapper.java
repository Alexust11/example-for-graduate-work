package ru.skypro.homework.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.skypro.homework.dto.profile.UserDto;
import ru.skypro.homework.model.User;

import java.util.Collection;
import java.util.List;

@Mapper(componentModel = "spring")
public interface UserDtoMapper {
    @Mapping(target = "password", ignore = true)
    User toModel(UserDto dto);
    UserDto toDto(User entity);

    List<UserDto> toUserDtoList(List<User> usersList);
}
