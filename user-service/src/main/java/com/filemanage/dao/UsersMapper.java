package com.filemanage.dao;

import com.filemanage.entity.Users;

public interface UsersMapper {
    /**
     *
     * @mbggenerated 2020-06-08
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2020-06-08
     */
    int insert(Users record);

    /**
     *
     * @mbggenerated 2020-06-08
     */
    int insertSelective(Users record);

    /**
     *
     * @mbggenerated 2020-06-08
     */
    Users selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2020-06-08
     */
    int updateByPrimaryKeySelective(Users record);

    /**
     *
     * @mbggenerated 2020-06-08
     */
    int updateByPrimaryKey(Users record);
}
