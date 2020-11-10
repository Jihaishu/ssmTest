package com.atguigu.test;

import com.atguigu.bean.Account;
import com.atguigu.dao.AccountDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author : Administrator
 * @date : 2020-11-10 17:28
 * @description ：
 */
public class TestMybatis {

    //查询所有
    @Test
    public void run1() throws IOException {
        //加载Mybatis的配置文件
        InputStream rs = Resources.getResourceAsStream("SqlMapperConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(rs);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountDao dao = sqlSession.getMapper(AccountDao.class);
        List<Account> all = dao.findAll();
        for (Account account :all) {
            System.out.println(account);
        }

        sqlSession.close();
        rs.close();

    }

    //插入值保存
    @Test
    public void run2() throws IOException {
        //加载Mybatis的配置文件
        InputStream rs = Resources.getResourceAsStream("SqlMapperConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(rs);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountDao dao = sqlSession.getMapper(AccountDao.class);
        Account account = new Account(null, "花花", 900);
        dao.saveAccount(account);

        sqlSession.commit();

        sqlSession.close();
        rs.close();

    }
}