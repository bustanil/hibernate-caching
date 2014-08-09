package com.codequ;

import com.codequ.hibernate.dao.CategoryDao;
import com.codequ.hibernate.model.Category;

public class SecondLevelCacheDemo {

    public static void main(String[] args) {
        CategoryDao dao = new CategoryDao();
        for (int i = 0; i < 5; i++) {
            Category sepatu = dao.read(1L);
            System.out.println(sepatu.getName());
        }
    }


}
