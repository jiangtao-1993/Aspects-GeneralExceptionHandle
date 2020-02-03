package com.itcast.controller;

import com.itcast.common.MyLog;
import com.itcast.entry.ResultModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;


@RestController
@RequestMapping("/account")
public class AccountController {

    @RequestMapping("/add")
    @MyLog("添加账户")
    public ResultModel add(HttpServletRequest request){
        return new ResultModel("200","success",null);
    }

    @RequestMapping("/update")
    @MyLog("修改账户")
    public ResultModel update(){
        return new ResultModel("200","success",null);
    }

    @RequestMapping("/del")
    @MyLog("删除账户")
    public ResultModel del(){
        return new ResultModel("200","success",null);
    }
}
