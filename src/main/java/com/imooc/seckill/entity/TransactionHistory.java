package com.imooc.seckill.entity;

public class TransactionHistory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_history_tbl.id
     *
     * @mbg.generated Sun Dec 27 10:15:03 PST 2020
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_history_tbl.good_id
     *
     * @mbg.generated Sun Dec 27 10:15:03 PST 2020
     */
    private Integer goodId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_history_tbl.amount
     *
     * @mbg.generated Sun Dec 27 10:15:03 PST 2020
     */
    private Integer amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column transaction_history_tbl.state
     *
     * @mbg.generated Sun Dec 27 10:15:03 PST 2020
     */
    private Integer state;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_history_tbl.id
     *
     * @return the value of transaction_history_tbl.id
     *
     * @mbg.generated Sun Dec 27 10:15:03 PST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_history_tbl.id
     *
     * @param id the value for transaction_history_tbl.id
     *
     * @mbg.generated Sun Dec 27 10:15:03 PST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_history_tbl.good_id
     *
     * @return the value of transaction_history_tbl.good_id
     *
     * @mbg.generated Sun Dec 27 10:15:03 PST 2020
     */
    public Integer getGoodId() {
        return goodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_history_tbl.good_id
     *
     * @param goodId the value for transaction_history_tbl.good_id
     *
     * @mbg.generated Sun Dec 27 10:15:03 PST 2020
     */
    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_history_tbl.amount
     *
     * @return the value of transaction_history_tbl.amount
     *
     * @mbg.generated Sun Dec 27 10:15:03 PST 2020
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_history_tbl.amount
     *
     * @param amount the value for transaction_history_tbl.amount
     *
     * @mbg.generated Sun Dec 27 10:15:03 PST 2020
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_history_tbl.state
     *
     * @return the value of transaction_history_tbl.state
     *
     * @mbg.generated Sun Dec 27 10:15:03 PST 2020
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_history_tbl.state
     *
     * @param state the value for transaction_history_tbl.state
     *
     * @mbg.generated Sun Dec 27 10:15:03 PST 2020
     */
    public void setState(Integer state) {
        this.state = state;
    }
}