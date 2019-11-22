package org.competition.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.competition.bean.Role;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
public interface RolesMapper {

    int addRoles(@Param("roles") String[] roles, @Param("uid") Long uid);

    List<Role> getRolesByUid(Long uid);
}
