package com.example.mybatis.admin;

import lombok.Data;
import lombok.NoArgsConstructor;

// 提供get和set
@Data
 // 无参构造
@NoArgsConstructor
//全参构造

public class User {
    // 用户id
    private String id;
    //    姓名
    private String userName;
    //    手机号
    private String userPhone;
    //    创建时间
    private String createTime;
    //性别
    private String sex;
    //部门
    private String deptId;
//    不用lombok情况下
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getUser_name() {
//        return user_name;
//    }
//
//    public void setUser_name(String user_name) {
//        this.user_name = user_name;
//    }
//
//    public String getUser_phone() {
//        return user_phone;
//    }
//
//    public void setUser_phone(String user_phone) {
//        this.user_phone = user_phone;
//    }
//
//    public String getCreate_time() {
//        return create_time;
//    }
//
//    public void setCreate_time(String create_time) {
//        this.create_time = create_time;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id='" + id + '\'' +
//                ", user_name='" + user_name + '\'' +
//                ", user_phone='" + user_phone + '\'' +
//                ", create_time='" + create_time + '\'' +
//                '}';
//    }
}
