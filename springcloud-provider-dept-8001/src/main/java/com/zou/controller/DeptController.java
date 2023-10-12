package com.zou.controller;

import com.zou.pojo.Dept;
import com.zou.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    DeptService deptService;

    @ResponseBody
    @RequestMapping("/getall")
    public List<Dept> getAll(){
        List<Dept> list = deptService.getAll();
        return list;
    }
}
