package com.sample.dao;

import java.util.List;

public interface Iliquor {
    List<liquor> all();
    void insert();
    void update();
    void delete(liquor liquor);
    void search(Long id);
}
