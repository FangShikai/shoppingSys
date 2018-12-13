package com.test.controller;


import com.test.entity.SysApp;
import com.test.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import java.util.List;


@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private AppService appService;

    //增
    @PutMapping("/add")
    public Object add(@RequestBody SysApp sysApp) {
        return appService.add(sysApp);
    }

    //查
    @GetMapping("/list")
    public Object list() {
        return appService.list();
    }

    //删
    @DeleteMapping("delete")
    public Object delete(@RequestParam(value = "id") int id,@RequestParam(value = "id") int id2){
        int a=appService.selectId(id2);
            if (a==0)
            {
                return "没有这个ID!";
            }
            else {
                appService.delete(id);
                return "删除成功!";
            }

    }
    //修改
    @PostMapping("update")
    public Object update(@RequestBody SysApp sysApp){
        return appService.update(sysApp);

    }
}
