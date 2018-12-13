package com.test.service;

import com.test.entity.SysApp;

import java.util.List;

public interface AppService {

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
