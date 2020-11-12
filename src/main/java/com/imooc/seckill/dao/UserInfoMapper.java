package com.imooc.seckill.dao;

import com.imooc.seckill.entity.UserInfo;

public interface UserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info_tbl
     *
     * @mbg.generated Sat Sep 12 10:27:11 PDT 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info_tbl
     *
     * @mbg.generated Sat Sep 12 10:27:11 PDT 2020
     */
    int insert(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info_tbl
     *
     * @mbg.generated Sat Sep 12 10:27:11 PDT 2020
     */
    int insertSelective(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info_tbl
     *
     * @mbg.generated Sat Sep 12 10:27:11 PDT 2020
     */
    UserInfo selectByPrimaryKey(Integer id);

    UserInfo selectByPhone(String phone);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info_tbl
     *
     * @mbg.generated Sat Sep 12 10:27:11 PDT 2020
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info_tbl
     *
     * @mbg.generated Sat Sep 12 10:27:11 PDT 2020
     */
    int updateByPrimaryKey(UserInfo record);
}