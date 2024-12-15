package com.app.user.management.dto.mapper;

import com.app.user.management.dto.model.User;
import com.app.user.management.entity.BusinessUser;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    BusinessUser toBusinessUser(User user);

    @Mapping(source = "businessUserId", target = "businessUserId")
    User toUser(BusinessUser businessUser);
}
