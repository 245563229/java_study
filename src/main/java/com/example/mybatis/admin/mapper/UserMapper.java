package com.example.mybatis.admin.mapper;

import com.example.mybatis.admin.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper //在运行时，会自动生成实现类对象（代理对象），并将该对象IOC容器管理
public interface UserMapper {

    //查询全部用户信息
    @Select("SELECT * FROM `user`")
    List<User> list();

    //删除用户信息
//    #｛｝会预编译将输入框内容作为一个整体放入
    @Delete("delete from user where id = #{id}")
//    使用$会产生预编译的问题，比如在密码框中输入' ' or '1'='1'此时就会出发1=1一直为true
//    @Delete("delete from user where id = ${id}")

    public void delete(String id);
//    public int delete(String id);

}

