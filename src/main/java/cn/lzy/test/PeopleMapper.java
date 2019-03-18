package cn.lzy.test;

import cn.lzy.test.People;

public interface PeopleMapper {
    int deleteByPrimaryKey(Integer id);
    int insert(People record);
    int insertSelective(People record);
    People selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(People record);
    int updateByPrimaryKey(People record);
}