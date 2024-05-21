package com.hutu.mp.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Builder;
import lombok.Data;

/**
 * @Author: hutu
 * @Date: 2024/5/21 14:31
 */
@Data
@Builder
public class User {
    //默认@TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private Integer deleted;
}