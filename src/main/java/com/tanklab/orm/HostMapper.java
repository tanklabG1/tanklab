package main.java.com.tanklab.orm;

import java.util.List;
import main.java.com.tanklab.orm.Host;
import main.java.com.tanklab.orm.HostExample;
import org.apache.ibatis.annotations.Param;

public interface HostMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table host
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	long countByExample(HostExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table host
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	int deleteByExample(HostExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table host
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table host
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	int insert(Host record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table host
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	int insertSelective(Host record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table host
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	List<Host> selectByExample(HostExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table host
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	Host selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table host
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	int updateByExampleSelective(@Param("record") Host record, @Param("example") HostExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table host
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	int updateByExample(@Param("record") Host record, @Param("example") HostExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table host
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	int updateByPrimaryKeySelective(Host record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table host
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	int updateByPrimaryKey(Host record);
}