package main.java.com.tanklab.mybatis.mapper;

import java.util.List;
import main.java.com.tanklab.entity.Table;
import main.java.com.tanklab.entity.TableExample;
import org.apache.ibatis.annotations.Param;

public interface TableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table
     *
     * @mbg.generated Wed Mar 22 17:40:06 CST 2017
     */
    long countByExample(TableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table
     *
     * @mbg.generated Wed Mar 22 17:40:06 CST 2017
     */
    int deleteByExample(TableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table
     *
     * @mbg.generated Wed Mar 22 17:40:06 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table
     *
     * @mbg.generated Wed Mar 22 17:40:06 CST 2017
     */
    int insert(Table record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table
     *
     * @mbg.generated Wed Mar 22 17:40:06 CST 2017
     */
    int insertSelective(Table record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table
     *
     * @mbg.generated Wed Mar 22 17:40:06 CST 2017
     */
    List<Table> selectByExample(TableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table
     *
     * @mbg.generated Wed Mar 22 17:40:06 CST 2017
     */
    Table selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table
     *
     * @mbg.generated Wed Mar 22 17:40:06 CST 2017
     */
    int updateByExampleSelective(@Param("record") Table record, @Param("example") TableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table
     *
     * @mbg.generated Wed Mar 22 17:40:06 CST 2017
     */
    int updateByExample(@Param("record") Table record, @Param("example") TableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table
     *
     * @mbg.generated Wed Mar 22 17:40:06 CST 2017
     */
    int updateByPrimaryKeySelective(Table record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table
     *
     * @mbg.generated Wed Mar 22 17:40:06 CST 2017
     */
    int updateByPrimaryKey(Table record);
}