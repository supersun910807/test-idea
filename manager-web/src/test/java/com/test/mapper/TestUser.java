package com.test.mapper;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Auther: wcy
 * @Date: 2019/11/3
 * @Project manager
 * @Package com.test.mapper
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class TestUser {
    @Autowired
    UsersMapper usersMapper;
    @Test
    public void testUser(){
//        List<Users> users = usersMapper.selectAll();
//        for (Users user: users) {
//            System.out.println(user);
//        }
        int result = usersMapper.insertUser(new Users("李思思", 18));
        System.out.println(result);
    }

}
