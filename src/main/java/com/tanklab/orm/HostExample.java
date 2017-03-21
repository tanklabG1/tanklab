package main.java.com.tanklab.orm;

import java.util.ArrayList;
import java.util.List;

public class HostExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table host
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table host
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table host
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table host
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	public HostExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table host
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table host
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table host
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table host
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table host
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table host
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table host
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table host
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table host
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table host
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table host
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIpv4SrcIsNull() {
			addCriterion("ipv4_src is null");
			return (Criteria) this;
		}

		public Criteria andIpv4SrcIsNotNull() {
			addCriterion("ipv4_src is not null");
			return (Criteria) this;
		}

		public Criteria andIpv4SrcEqualTo(String value) {
			addCriterion("ipv4_src =", value, "ipv4Src");
			return (Criteria) this;
		}

		public Criteria andIpv4SrcNotEqualTo(String value) {
			addCriterion("ipv4_src <>", value, "ipv4Src");
			return (Criteria) this;
		}

		public Criteria andIpv4SrcGreaterThan(String value) {
			addCriterion("ipv4_src >", value, "ipv4Src");
			return (Criteria) this;
		}

		public Criteria andIpv4SrcGreaterThanOrEqualTo(String value) {
			addCriterion("ipv4_src >=", value, "ipv4Src");
			return (Criteria) this;
		}

		public Criteria andIpv4SrcLessThan(String value) {
			addCriterion("ipv4_src <", value, "ipv4Src");
			return (Criteria) this;
		}

		public Criteria andIpv4SrcLessThanOrEqualTo(String value) {
			addCriterion("ipv4_src <=", value, "ipv4Src");
			return (Criteria) this;
		}

		public Criteria andIpv4SrcLike(String value) {
			addCriterion("ipv4_src like", value, "ipv4Src");
			return (Criteria) this;
		}

		public Criteria andIpv4SrcNotLike(String value) {
			addCriterion("ipv4_src not like", value, "ipv4Src");
			return (Criteria) this;
		}

		public Criteria andIpv4SrcIn(List<String> values) {
			addCriterion("ipv4_src in", values, "ipv4Src");
			return (Criteria) this;
		}

		public Criteria andIpv4SrcNotIn(List<String> values) {
			addCriterion("ipv4_src not in", values, "ipv4Src");
			return (Criteria) this;
		}

		public Criteria andIpv4SrcBetween(String value1, String value2) {
			addCriterion("ipv4_src between", value1, value2, "ipv4Src");
			return (Criteria) this;
		}

		public Criteria andIpv4SrcNotBetween(String value1, String value2) {
			addCriterion("ipv4_src not between", value1, value2, "ipv4Src");
			return (Criteria) this;
		}

		public Criteria andMacIsNull() {
			addCriterion("mac is null");
			return (Criteria) this;
		}

		public Criteria andMacIsNotNull() {
			addCriterion("mac is not null");
			return (Criteria) this;
		}

		public Criteria andMacEqualTo(String value) {
			addCriterion("mac =", value, "mac");
			return (Criteria) this;
		}

		public Criteria andMacNotEqualTo(String value) {
			addCriterion("mac <>", value, "mac");
			return (Criteria) this;
		}

		public Criteria andMacGreaterThan(String value) {
			addCriterion("mac >", value, "mac");
			return (Criteria) this;
		}

		public Criteria andMacGreaterThanOrEqualTo(String value) {
			addCriterion("mac >=", value, "mac");
			return (Criteria) this;
		}

		public Criteria andMacLessThan(String value) {
			addCriterion("mac <", value, "mac");
			return (Criteria) this;
		}

		public Criteria andMacLessThanOrEqualTo(String value) {
			addCriterion("mac <=", value, "mac");
			return (Criteria) this;
		}

		public Criteria andMacLike(String value) {
			addCriterion("mac like", value, "mac");
			return (Criteria) this;
		}

		public Criteria andMacNotLike(String value) {
			addCriterion("mac not like", value, "mac");
			return (Criteria) this;
		}

		public Criteria andMacIn(List<String> values) {
			addCriterion("mac in", values, "mac");
			return (Criteria) this;
		}

		public Criteria andMacNotIn(List<String> values) {
			addCriterion("mac not in", values, "mac");
			return (Criteria) this;
		}

		public Criteria andMacBetween(String value1, String value2) {
			addCriterion("mac between", value1, value2, "mac");
			return (Criteria) this;
		}

		public Criteria andMacNotBetween(String value1, String value2) {
			addCriterion("mac not between", value1, value2, "mac");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table host
	 * @mbg.generated  Tue Mar 21 20:13:32 CST 2017
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table host
     *
     * @mbg.generated do_not_delete_during_merge Tue Mar 21 19:43:42 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}