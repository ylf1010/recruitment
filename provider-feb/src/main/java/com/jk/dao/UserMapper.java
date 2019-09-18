package com.jk.dao;

import com.jk.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select * from user where username=#{username}")
    User queryUserByname(@Param("username") String username);
}
