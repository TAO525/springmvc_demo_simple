package com.tao.demo.mapper;


import com.tao.demo.po.UserT;

import java.util.List;

public interface UserTMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated Fri Oct 27 15:37:49 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated Fri Oct 27 15:37:49 CST 2017
     */
    int insert(UserT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated Fri Oct 27 15:37:49 CST 2017
     */
    int insertSelective(UserT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated Fri Oct 27 15:37:49 CST 2017
     */
    UserT selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated Fri Oct 27 15:37:49 CST 2017
     */
    int updateByPrimaryKeySelective(UserT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbggenerated Fri Oct 27 15:37:49 CST 2017
     */
    int updateByPrimaryKey(UserT record);

    List<UserT> getList(UserT UserT);
}