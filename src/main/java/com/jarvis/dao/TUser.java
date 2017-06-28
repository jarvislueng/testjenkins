package com.jarvis.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by jarvis on 2017/6/20.
 */@Repository("user")
public interface TUser {
    @Select("select user_name from t_user where id =1")
    public String username();
}
