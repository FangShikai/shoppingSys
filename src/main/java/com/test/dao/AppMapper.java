package com.test.dao;

import com.test.entity.SysApp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AppMapper {
    //增
    int add(SysApp app);
    //查
    List<SysApp> list();
    //判断id是否存在
    int selectId(int id2);
    //删
    void delete(int id);
    //修改
    int update(SysApp app);
}
