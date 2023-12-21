package com.example.mybatis;

import com.example.mybatis.admin.User;
import com.example.mybatis.admin.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        List<User> userList = userMapper.list();
        userList.stream().forEach(user -> {
            System.out.println(user);
        });
    }

    @Test
    public void testDelete() {
//        int delete = userMapper.delete("106");
//        System.out.println(delete);
        userMapper.delete("106");
    }

}
