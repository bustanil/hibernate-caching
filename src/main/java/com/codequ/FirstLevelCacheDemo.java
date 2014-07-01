package com.codequ;

import com.codequ.hibernate.model.Category;
import com.codequ.hibernate.util.HibernateUtil;
import org.hibernate.Session;

public class FirstLevelCacheDemo
{
    public static void main( String[] args ) {
        Session session = HibernateUtil.openSession();
        Category sepatu;
        for(int i = 0; i < 100; i++){
            sepatu = (Category) session.get(Category.class, 1L);
            System.out.println(sepatu.getName());
        }
        session.close();
    }
}
