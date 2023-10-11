package com.zou.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/*
    链式写法： new Dept().setDeptno(XX).setDeptname(XX).setDb_source(XX)
 */
@Data
@Accessors(chain = true) //支持链式写法
@AllArgsConstructor
@NoArgsConstructor
public class Dept implements Serializable {
    private Long deptno;
    private String deptname;
    private String db_source;//来自哪个数据库

    public Dept(String deptname) {
        this.deptname = deptname;
    }
}
