package com.test.service.imp;

import com.test.dao.AppMapper;
import com.test.entity.SysApp;
import com.test.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppServiceImp implements AppService {

    @Autowired
    private AppMapper appMapper;

    @Override
    public int add(SysApp app) {
        return appMapper.add(app);
    }

    @Override
    public List<SysApp> list() {
        return appMapper.list();
    }

    @Override
    public int selectId(int id2) {
        return appMapper.selectId(id2);
    }

    @Override
    public void delete(int id) {
         appMapper.delete(id);
    }

    @Override
    public int update(SysApp app) {
        return appMapper.update(app);
    }
}
