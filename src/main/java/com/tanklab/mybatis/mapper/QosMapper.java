package main.java.com.tanklab.mybatis.mapper;

import java.util.List;
import main.java.com.tanklab.entity.Qos;
import main.java.com.tanklab.entity.QosExample;
import org.apache.ibatis.annotations.Param;

public interface QosMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qos
     *
     * @mbg.generated Thu Mar 23 19:18:25 CST 2017
     */
    long countByExample(QosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qos
     *
     * @mbg.generated Thu Mar 23 19:18:25 CST 2017
     */
    int deleteByExample(QosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qos
     *
     * @mbg.generated Thu Mar 23 19:18:25 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qos
     *
     * @mbg.generated Thu Mar 23 19:18:25 CST 2017
     */
    int insert(Qos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qos
     *
     * @mbg.generated Thu Mar 23 19:18:25 CST 2017
     */
    int insertSelective(Qos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qos
     *
     * @mbg.generated Thu Mar 23 19:18:25 CST 2017
     */
    List<Qos> selectByExample(QosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qos
     *
     * @mbg.generated Thu Mar 23 19:18:25 CST 2017
     */
    Qos selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qos
     *
     * @mbg.generated Thu Mar 23 19:18:25 CST 2017
     */
    int updateByExampleSelective(@Param("record") Qos record, @Param("example") QosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qos
     *
     * @mbg.generated Thu Mar 23 19:18:25 CST 2017
     */
    int updateByExample(@Param("record") Qos record, @Param("example") QosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qos
     *
     * @mbg.generated Thu Mar 23 19:18:25 CST 2017
     */
    int updateByPrimaryKeySelective(Qos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qos
     *
     * @mbg.generated Thu Mar 23 19:18:25 CST 2017
     */
    int updateByPrimaryKey(Qos record);
}