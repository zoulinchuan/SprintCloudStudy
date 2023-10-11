package com.zou.service;

import com.zou.mapper.DeptMapper;
import com.zou.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    DeptMapper deptMapper;

    public List<Dept> getAll() {
        return deptMapper.getAll();
    }
}
