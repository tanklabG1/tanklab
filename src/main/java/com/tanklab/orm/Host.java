package main.java.com.tanklab.orm;

public class Host {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column host.id
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column host.ipv4_src
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	private String ipv4Src;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column host.mac
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	private String mac;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column host.id
	 * @return  the value of host.id
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column host.id
	 * @param id  the value for host.id
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column host.ipv4_src
	 * @return  the value of host.ipv4_src
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	public String getIpv4Src() {
		return ipv4Src;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column host.ipv4_src
	 * @param ipv4Src  the value for host.ipv4_src
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	public void setIpv4Src(String ipv4Src) {
		this.ipv4Src = ipv4Src;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column host.mac
	 * @return  the value of host.mac
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	public String getMac() {
		return mac;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column host.mac
	 * @param mac  the value for host.mac
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	public void setMac(String mac) {
		this.mac = mac;
	}
}