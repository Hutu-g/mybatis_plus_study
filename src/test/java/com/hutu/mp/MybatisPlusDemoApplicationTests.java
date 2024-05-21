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
class MybatisPlusDemoApplicationTests {


    @Autowired
    private UserMapper userMapper;

    /**
     * id删除
     */
    @Test
    void deleteById() {
        int rows = userMapper.deleteById(1792808339615703042L);
        System.out.println(rows);
    }
    /**
     * 批量删除
     */
    @Test
    void deleteByBatchIds() {
        userMapper.deleteBatchIds(Arrays.asList(8,9));
    }

    /**
     * 分页查询
     */
    @Test
    void findPage() {
        //创建Page对象，两个参数：当前页 每页显示记录数
        Page<User> page = new Page<>(1,3);
        //IPage<User> pageModel = userMapper.selectPage(page,null);
        userMapper.selectPage(page,null);
        List<User> list = page.getRecords();
        System.out.println(list);
        //当前页数
        System.out.println(page.getCurrent());
        //共多少页
        System.out.println(page.getPages());
        //当前页多少条
        System.out.println(page.getSize());
        //总条数
        System.out.println(page.getTotal());
        //是否又下一个
        System.out.println(page.hasNext());
        System.out.println(page.hasPrevious());
    }
    /**
     * 修改
     */
    @Test
    void updateOne() {
        User user = userMapper.selectById(1792808339615703042L);
        System.out.println("当前数据位"+user);
        user.setName("hutu");
        int rows = userMapper.updateById(user);
        System.out.println(rows);
    }


    /**
     * 插入数据
     */
    @Test
    void insertOne() {
        User user = User.builder().name("糊涂").age(22).email("2839033900@qq.com").build();
        //返回影响行数
        int rows = userMapper.insert(user);
        System.out.println("影响行数"+rows + "添加的内容是" + user);
    }

    /**
     * 查询全部
     */
    @Test
    void findAll() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
//        Assert.isTrue(5 == userList.size(), "");
        userList.forEach(System.out::println);
    }

}
