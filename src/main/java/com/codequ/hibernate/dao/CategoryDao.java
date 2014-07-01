package com.codequ.hibernate.dao;


import com.codequ.hibernate.model.Category;
import com.codequ.hibernate.util.HibernateUtil;
import org.hibernate.Session;

public class CategoryDao {

    public Category read(Long id) {
        Session session = HibernateUtil.openSession();
        Category category = (Category) session.get(Category.class, id);
        session.close();
        return category;
    }

}
