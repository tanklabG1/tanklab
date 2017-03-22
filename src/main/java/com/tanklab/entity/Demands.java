package main.java.com.tanklab.entity;

import java.util.Date;

public class Demands {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demands.id
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demands.customer_nm
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    private String customerNm;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demands.ip_src
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    private String ipSrc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demands.ip_dst
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    private String ipDst;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demands.starttime
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    private Date starttime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demands.endtime
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    private Date endtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demands.bandwidth
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    private Integer bandwidth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demands.latency
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    private Integer latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demands.loss
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    private Integer loss;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demands.statisfy
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    private String statisfy;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demands.id
     *
     * @return the value of demands.id
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demands.id
     *
     * @param id the value for demands.id
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demands.customer_nm
     *
     * @return the value of demands.customer_nm
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    public String getCustomerNm() {
        return customerNm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demands.customer_nm
     *
     * @param customerNm the value for demands.customer_nm
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    public void setCustomerNm(String customerNm) {
        this.customerNm = customerNm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demands.ip_src
     *
     * @return the value of demands.ip_src
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    public String getIpSrc() {
        return ipSrc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demands.ip_src
     *
     * @param ipSrc the value for demands.ip_src
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    public void setIpSrc(String ipSrc) {
        this.ipSrc = ipSrc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demands.ip_dst
     *
     * @return the value of demands.ip_dst
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    public String getIpDst() {
        return ipDst;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demands.ip_dst
     *
     * @param ipDst the value for demands.ip_dst
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    public void setIpDst(String ipDst) {
        this.ipDst = ipDst;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demands.starttime
     *
     * @return the value of demands.starttime
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demands.starttime
     *
     * @param starttime the value for demands.starttime
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demands.endtime
     *
     * @return the value of demands.endtime
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demands.endtime
     *
     * @param endtime the value for demands.endtime
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demands.bandwidth
     *
     * @return the value of demands.bandwidth
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demands.bandwidth
     *
     * @param bandwidth the value for demands.bandwidth
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demands.latency
     *
     * @return the value of demands.latency
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    public Integer getLatency() {
        return latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demands.latency
     *
     * @param latency the value for demands.latency
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    public void setLatency(Integer latency) {
        this.latency = latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demands.loss
     *
     * @return the value of demands.loss
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    public Integer getLoss() {
        return loss;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demands.loss
     *
     * @param loss the value for demands.loss
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    public void setLoss(Integer loss) {
        this.loss = loss;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demands.statisfy
     *
     * @return the value of demands.statisfy
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    public String getStatisfy() {
        return statisfy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demands.statisfy
     *
     * @param statisfy the value for demands.statisfy
     *
     * @mbg.generated Wed Mar 22 20:50:33 CST 2017
     */
    public void setStatisfy(String statisfy) {
        this.statisfy = statisfy;
    }
}