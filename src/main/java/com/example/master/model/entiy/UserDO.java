package com.example.master.model.entiy;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 用户
 * @author 谢环环
 * @date 2023/03/25
 */
@Data
@TableName("user")
public class UserDO {

    /**
     * 主键, 自增
     */
    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    /**
     * 用户名
     */
    @TableField("username")
    private String username;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 创造人
     */
    @TableField("create_person")
    private String createPerson;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;

    /**
     * 更新人
     */
    @TableField("update_person")
    private String updatePerson;
}
