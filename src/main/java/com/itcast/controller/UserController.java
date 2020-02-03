package com.itcast.controller;

import com.itcast.entry.ResultModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @作者 itcast
 * @创建日期 2020/2/3 10:01
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value="/findAll/{id}")
    @ResponseBody
    public ResultModel findAll(@RequestBody Map map,@PathVariable(value = "id")String id) throws Exception {
        System.out.println(map);
        System.out.println(id);
        if(Integer.valueOf(id)<100){
            throw new Exception("ID不能小于100");
        }
        return new ResultModel("200","success",null);
    }
}
