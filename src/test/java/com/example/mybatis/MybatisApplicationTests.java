package com.example.mybatis;

import com.example.mybatis.admin.User;
import com.example.mybatis.admin.mapper.UserMapper;
import org.apache.ibatis.annotations.Update;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
class MybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;
//获取列表
    @Test
    public void contextLoads() {
        List<User> userList = userMapper.list();
        userList.stream().forEach(user -> {
            System.out.println(user);
        });
    }
//删除员工
    @Test
    public void testDelete() {
//        int delete = userMapper.delete("106");
//        System.out.println(delete);
        userMapper.delete("106");
    }

    // 添加员工
    @Test
    public void addPerson(){
          User user = new User();
          user.setUserName("赵八");
          user.setSex("1");
          user.setUserPhone("15846");
          user.setDeptId("101");

          userMapper.insert(user);
          System.out.println(user.getId());
    }

    // 更新员工
    @Test
    public void updatePerson(){
        User user = new User();
        user.setId(108);
        user.setUserName("赵八1");
        user.setSex("2");
        user.setUserPhone("11111");
        user.setDeptId("");

        userMapper.update(user);
        System.out.println(user.getId());
    }

    //获取员工
    @Test
    public void getUserById(){
        User user = userMapper.getById(108);
        System.out.println(user);
    }

    // 根据条件查询员工
    @Test
    public void getUserByParams(){
        List<User> userList = userMapper.getUserlist("李", String.valueOf(2), LocalDate.of(2020,01,01),LocalDate.of(2024,12,30));
          System.out.println(userList);
    }
}
