package com.hutu.mp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hutu.mp.mapper.UserMapper;
import com.hutu.mp.model.entity.User;
import com.hutu.mp.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author: hutu
 * @Date: 2024/5/21 23:14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
