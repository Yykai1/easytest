/**
 * @class InformationMapperTest
 * @date 2022/3/18 19:51
 * @author Yinkai Yang
 * @version 1.0
 * @description //TODO
 */

package com.yinkai.dao;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.yinkai.entity.Information;
import com.yinkai.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.util.List;

public class InformationMapperTest {
    @Test
    public void test(){
        //获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //执行SQL
        InformationMapper mapper = sqlSession.getMapper(InformationMapper.class);
        List<Information> informationList = mapper.getInformation();

        for (Information information : informationList) {
            System.out.println(information);
        }

        sqlSession.close();
    }

    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //模糊查询
        InformationMapper mapper = sqlSession.getMapper(InformationMapper.class);
        List<Information> list = mapper.getInformationLike("%网%");
        for (Information i : list) {
            System.out.println(i);
        }

        sqlSession.close();

    }
}
