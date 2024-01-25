package com.example.mybatis.admin.mapper;

import com.example.mybatis.admin.User;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.List;

import static java.time.chrono.JapaneseEra.values;


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

    //新增员工
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into user(user_name,user_phone, dept_id, sex) " +
            "values (#{userName},#{userPhone},#{deptId},#{sex})")

//    '陆七','152412','101','1'
    public void insert(User user);

    // 更新员工

    @Update("update user set user_name=#{userName},user_phone=#{userPhone}, " +
            "dept_id=#{deptId}, sex=#{sex} where id = 108")
    public void update(User user);

    // 根据id查询员工
    @Select("select * from user where id=#{id}")
    public User getById(Integer id);

    // 根据条件查询员工
    @Select("select * from user where " +
            // 在‘’中无法使用#{},'%#{userName}%',$有被注入脚本的风险，所以用concat
            "user_name like concat('%',#{userName},'%') and " +
            "sex = #{sex} and " +
            "create_time between #{startTime} and #{endTime} " +
            "order by create_time")
    // 单独使用mybatis时，映射会出问题，userName等会变成var1 var2，
    // 所以使用@Param映射到对应才行
    public List<User> getUserlist(@Param("userName") String userName,
                                  @Param("sex") String sex,
                                  @Param("startTime") LocalDate startTime,
                                  @Param("endTime") LocalDate endTime);
}

