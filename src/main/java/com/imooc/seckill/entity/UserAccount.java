package com.imooc.seckill.entity;

public class UserAccount {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account_tbl.id
     *
     * @mbg.generated Sat Sep 12 10:27:11 PDT 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account_tbl.encrypt_password
     *
     * @mbg.generated Sat Sep 12 10:27:11 PDT 2020
     */
    private String encryptPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account_tbl.user_id
     *
     * @mbg.generated Sat Sep 12 10:27:11 PDT 2020
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account_tbl.id
     *
     * @return the value of user_account_tbl.id
     *
     * @mbg.generated Sat Sep 12 10:27:11 PDT 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account_tbl.id
     *
     * @param id the value for user_account_tbl.id
     *
     * @mbg.generated Sat Sep 12 10:27:11 PDT 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account_tbl.encrypt_password
     *
     * @return the value of user_account_tbl.encrypt_password
     *
     * @mbg.generated Sat Sep 12 10:27:11 PDT 2020
     */
    public String getEncryptPassword() {
        return encryptPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account_tbl.encrypt_password
     *
     * @param encryptPassword the value for user_account_tbl.encrypt_password
     *
     * @mbg.generated Sat Sep 12 10:27:11 PDT 2020
     */
    public void setEncryptPassword(String encryptPassword) {
        this.encryptPassword = encryptPassword == null ? null : encryptPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account_tbl.user_id
     *
     * @return the value of user_account_tbl.user_id
     *
     * @mbg.generated Sat Sep 12 10:27:11 PDT 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account_tbl.user_id
     *
     * @param userId the value for user_account_tbl.user_id
     *
     * @mbg.generated Sat Sep 12 10:27:11 PDT 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}