package com.sample.dao;

import com.sample.model.LiquorBean;

import java.util.List;

public interface IliquorDao {
    List<LiquorBean> all();
    void insert();
    void update();
    void delete(LiquorBean liquorBean);
    void search(Long id);
}
