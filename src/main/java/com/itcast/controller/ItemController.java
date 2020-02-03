package com.itcast.controller;

import com.itcast.common.MyLog;
import com.itcast.entry.ResultModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/item")
public class ItemController {

    @RequestMapping("/add")
    @MyLog("添加商品")
    public ResultModel add(){
        return new ResultModel("200","success",null);
    }

    @RequestMapping("/update")
    @MyLog("修改商品")
    public ResultModel update(){
        return new ResultModel("200","success",null);
    }

    @RequestMapping("/del")
    @MyLog("删除商品")
    public ResultModel del(){
        return new ResultModel("200","success",null);
    }
}
