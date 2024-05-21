package com.hutu.mp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hutu.mp.mapper.UserMapper;
import com.hutu.mp.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class QueryWapperTests {


    @Autowired
    private UserMapper userMapper;
    /**
     * queryWrapper使用
     * ge、gt、le、lt
     */
    @Test
    void queryWrapper1() {
        QueryWrapper<User> wrapper =  new QueryWrapper<>();
        wrapper.ge("age",20);
        List<User> users = userMapper.selectList(wrapper);
        System.out.println(users);
    }

    /**
     * queryWrapper使用
     * eq、ne
     */
    @Test
    void queryWrapper2() {
        QueryWrapper<User> wrapper =  new QueryWrapper<>();
        wrapper.ne("age",20);
        List<User> users = userMapper.selectList(wrapper);
        System.out.println(users);
    }
    /**
     * queryWrapper使用
     * like、likeLeft、likeRight
     */
    @Test
    void queryWrapper3() {
        QueryWrapper<User> wrapper =  new QueryWrapper<>();
        wrapper.likeRight("name","B");
        List<User> users = userMapper.selectList(wrapper);
        System.out.println(users);
    }
    /**
     * queryWrapper使用
     * orderByAsc、orderByDesc
     */
    @Test
    void queryWrapper4() {
        QueryWrapper<User> wrapper =  new QueryWrapper<>();
        wrapper.orderByDesc("id");
        wrapper.likeRight("name","B");
        List<User> users = userMapper.selectList(wrapper);
        System.out.println(users);
    }

}
