package com.imooc.seckill.entity;

public class Stock {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_tbl.id
     *
     * @mbg.generated Sun Sep 27 16:12:26 PDT 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_tbl.stock
     *
     * @mbg.generated Sun Sep 27 16:12:26 PDT 2020
     */
    private Integer stock;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_tbl.good_id
     *
     * @mbg.generated Sun Sep 27 16:12:26 PDT 2020
     */
    private Integer goodId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_tbl.id
     *
     * @return the value of stock_tbl.id
     *
     * @mbg.generated Sun Sep 27 16:12:26 PDT 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_tbl.id
     *
     * @param id the value for stock_tbl.id
     *
     * @mbg.generated Sun Sep 27 16:12:26 PDT 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_tbl.stock
     *
     * @return the value of stock_tbl.stock
     *
     * @mbg.generated Sun Sep 27 16:12:26 PDT 2020
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_tbl.stock
     *
     * @param stock the value for stock_tbl.stock
     *
     * @mbg.generated Sun Sep 27 16:12:26 PDT 2020
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_tbl.good_id
     *
     * @return the value of stock_tbl.good_id
     *
     * @mbg.generated Sun Sep 27 16:12:26 PDT 2020
     */
    public Integer getGoodId() {
        return goodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_tbl.good_id
     *
     * @param goodId the value for stock_tbl.good_id
     *
     * @mbg.generated Sun Sep 27 16:12:26 PDT 2020
     */
    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }
}