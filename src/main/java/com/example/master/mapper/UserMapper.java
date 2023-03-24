package com.example.master.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.master.model.entiy.UserDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<UserDO> {
}
