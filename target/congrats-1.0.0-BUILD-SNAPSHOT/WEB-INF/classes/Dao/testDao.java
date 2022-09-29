package com.jsk.congrats.api.Dao;

import com.jsk.congrats.api.vo.testVo;

import java.util.List;

public class testDao extends BaseDao {

    public List<testVo> getList() {
        return (List<testVo>) this.list("getList");
    }

}