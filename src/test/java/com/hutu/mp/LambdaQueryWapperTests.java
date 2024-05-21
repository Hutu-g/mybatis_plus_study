package com.hutu.mp;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hutu.mp.mapper.UserMapper;
import com.hutu.mp.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class LambdaQueryWapperTests {


    @Autowired
    private UserMapper userMapper;
    /**
     * queryWrapper使用
     * ge、gt、le、lt
     */
    @Test
    void queryWrapper1() {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.ge(User::getAge,20);
        List<User> users = userMapper.selectList(wrapper);
        System.out.println(users);
    }

    /**
     * queryWrapper使用
     * eq、ne
     */
    @Test
    void queryWrapper2() {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.ne(User::getAge,20);
        List<User> users = userMapper.selectList(wrapper);
        System.out.println(users);
    }
    /**
     * queryWrapper使用
     * like、likeLeft、likeRight
     */
    @Test
    void queryWrapper3() {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.likeRight(User::getName,"B");
        List<User> users = userMapper.selectList(wrapper);
        System.out.println(users);
    }
    /**
     * queryWrapper使用
     * orderByAsc、orderByDesc
     */
    @Test
    void queryWrapper4() {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.orderByDesc(User::getId);
        wrapper.likeRight(User::getName,"B");
        List<User> users = userMapper.selectList(wrapper);
        System.out.println(users);
    }

}
