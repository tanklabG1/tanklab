package main.java.com.tanklab.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PointExample {
    
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;

	
	public PointExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	
	public String getOrderByClause() {
		return orderByClause;
	}

	
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	
	public boolean isDistinct() {
		return distinct;
	}

	
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	
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

		protected void addCriterionForJDBCDate(String condition, Date value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()), property);
		}

		protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property + " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

		public Criteria andPortIdIsNull() {
			addCriterion("port_id is null");
			return (Criteria) this;
		}

		public Criteria andPortIdIsNotNull() {
			addCriterion("port_id is not null");
			return (Criteria) this;
		}

		public Criteria andPortIdEqualTo(Integer value) {
			addCriterion("port_id =", value, "portId");
			return (Criteria) this;
		}

		public Criteria andPortIdNotEqualTo(Integer value) {
			addCriterion("port_id <>", value, "portId");
			return (Criteria) this;
		}

		public Criteria andPortIdGreaterThan(Integer value) {
			addCriterion("port_id >", value, "portId");
			return (Criteria) this;
		}

		public Criteria andPortIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("port_id >=", value, "portId");
			return (Criteria) this;
		}

		public Criteria andPortIdLessThan(Integer value) {
			addCriterion("port_id <", value, "portId");
			return (Criteria) this;
		}

		public Criteria andPortIdLessThanOrEqualTo(Integer value) {
			addCriterion("port_id <=", value, "portId");
			return (Criteria) this;
		}

		public Criteria andPortIdIn(List<Integer> values) {
			addCriterion("port_id in", values, "portId");
			return (Criteria) this;
		}

		public Criteria andPortIdNotIn(List<Integer> values) {
			addCriterion("port_id not in", values, "portId");
			return (Criteria) this;
		}

		public Criteria andPortIdBetween(Integer value1, Integer value2) {
			addCriterion("port_id between", value1, value2, "portId");
			return (Criteria) this;
		}

		public Criteria andPortIdNotBetween(Integer value1, Integer value2) {
			addCriterion("port_id not between", value1, value2, "portId");
			return (Criteria) this;
		}

		public Criteria andPortNameIsNull() {
			addCriterion("port_name is null");
			return (Criteria) this;
		}

		public Criteria andPortNameIsNotNull() {
			addCriterion("port_name is not null");
			return (Criteria) this;
		}

		public Criteria andPortNameEqualTo(String value) {
			addCriterion("port_name =", value, "portName");
			return (Criteria) this;
		}

		public Criteria andPortNameNotEqualTo(String value) {
			addCriterion("port_name <>", value, "portName");
			return (Criteria) this;
		}

		public Criteria andPortNameGreaterThan(String value) {
			addCriterion("port_name >", value, "portName");
			return (Criteria) this;
		}

		public Criteria andPortNameGreaterThanOrEqualTo(String value) {
			addCriterion("port_name >=", value, "portName");
			return (Criteria) this;
		}

		public Criteria andPortNameLessThan(String value) {
			addCriterion("port_name <", value, "portName");
			return (Criteria) this;
		}

		public Criteria andPortNameLessThanOrEqualTo(String value) {
			addCriterion("port_name <=", value, "portName");
			return (Criteria) this;
		}

		public Criteria andPortNameLike(String value) {
			addCriterion("port_name like", value, "portName");
			return (Criteria) this;
		}

		public Criteria andPortNameNotLike(String value) {
			addCriterion("port_name not like", value, "portName");
			return (Criteria) this;
		}

		public Criteria andPortNameIn(List<String> values) {
			addCriterion("port_name in", values, "portName");
			return (Criteria) this;
		}

		public Criteria andPortNameNotIn(List<String> values) {
			addCriterion("port_name not in", values, "portName");
			return (Criteria) this;
		}

		public Criteria andPortNameBetween(String value1, String value2) {
			addCriterion("port_name between", value1, value2, "portName");
			return (Criteria) this;
		}

		public Criteria andPortNameNotBetween(String value1, String value2) {
			addCriterion("port_name not between", value1, value2, "portName");
			return (Criteria) this;
		}

		public Criteria andMacAddrIsNull() {
			addCriterion("mac_addr is null");
			return (Criteria) this;
		}

		public Criteria andMacAddrIsNotNull() {
			addCriterion("mac_addr is not null");
			return (Criteria) this;
		}

		public Criteria andMacAddrEqualTo(String value) {
			addCriterion("mac_addr =", value, "macAddr");
			return (Criteria) this;
		}

		public Criteria andMacAddrNotEqualTo(String value) {
			addCriterion("mac_addr <>", value, "macAddr");
			return (Criteria) this;
		}

		public Criteria andMacAddrGreaterThan(String value) {
			addCriterion("mac_addr >", value, "macAddr");
			return (Criteria) this;
		}

		public Criteria andMacAddrGreaterThanOrEqualTo(String value) {
			addCriterion("mac_addr >=", value, "macAddr");
			return (Criteria) this;
		}

		public Criteria andMacAddrLessThan(String value) {
			addCriterion("mac_addr <", value, "macAddr");
			return (Criteria) this;
		}

		public Criteria andMacAddrLessThanOrEqualTo(String value) {
			addCriterion("mac_addr <=", value, "macAddr");
			return (Criteria) this;
		}

		public Criteria andMacAddrLike(String value) {
			addCriterion("mac_addr like", value, "macAddr");
			return (Criteria) this;
		}

		public Criteria andMacAddrNotLike(String value) {
			addCriterion("mac_addr not like", value, "macAddr");
			return (Criteria) this;
		}

		public Criteria andMacAddrIn(List<String> values) {
			addCriterion("mac_addr in", values, "macAddr");
			return (Criteria) this;
		}

		public Criteria andMacAddrNotIn(List<String> values) {
			addCriterion("mac_addr not in", values, "macAddr");
			return (Criteria) this;
		}

		public Criteria andMacAddrBetween(String value1, String value2) {
			addCriterion("mac_addr between", value1, value2, "macAddr");
			return (Criteria) this;
		}

		public Criteria andMacAddrNotBetween(String value1, String value2) {
			addCriterion("mac_addr not between", value1, value2, "macAddr");
			return (Criteria) this;
		}

		public Criteria andConSwIdIsNull() {
			addCriterion("con_sw_id is null");
			return (Criteria) this;
		}

		public Criteria andConSwIdIsNotNull() {
			addCriterion("con_sw_id is not null");
			return (Criteria) this;
		}

		public Criteria andConSwIdEqualTo(Integer value) {
			addCriterion("con_sw_id =", value, "conSwId");
			return (Criteria) this;
		}

		public Criteria andConSwIdNotEqualTo(Integer value) {
			addCriterion("con_sw_id <>", value, "conSwId");
			return (Criteria) this;
		}

		public Criteria andConSwIdGreaterThan(Integer value) {
			addCriterion("con_sw_id >", value, "conSwId");
			return (Criteria) this;
		}

		public Criteria andConSwIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("con_sw_id >=", value, "conSwId");
			return (Criteria) this;
		}

		public Criteria andConSwIdLessThan(Integer value) {
			addCriterion("con_sw_id <", value, "conSwId");
			return (Criteria) this;
		}

		public Criteria andConSwIdLessThanOrEqualTo(Integer value) {
			addCriterion("con_sw_id <=", value, "conSwId");
			return (Criteria) this;
		}

		public Criteria andConSwIdIn(List<Integer> values) {
			addCriterion("con_sw_id in", values, "conSwId");
			return (Criteria) this;
		}

		public Criteria andConSwIdNotIn(List<Integer> values) {
			addCriterion("con_sw_id not in", values, "conSwId");
			return (Criteria) this;
		}

		public Criteria andConSwIdBetween(Integer value1, Integer value2) {
			addCriterion("con_sw_id between", value1, value2, "conSwId");
			return (Criteria) this;
		}

		public Criteria andConSwIdNotBetween(Integer value1, Integer value2) {
			addCriterion("con_sw_id not between", value1, value2, "conSwId");
			return (Criteria) this;
		}

		public Criteria andStateIsNull() {
			addCriterion("state is null");
			return (Criteria) this;
		}

		public Criteria andStateIsNotNull() {
			addCriterion("state is not null");
			return (Criteria) this;
		}

		public Criteria andStateEqualTo(String value) {
			addCriterion("state =", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotEqualTo(String value) {
			addCriterion("state <>", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateGreaterThan(String value) {
			addCriterion("state >", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateGreaterThanOrEqualTo(String value) {
			addCriterion("state >=", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLessThan(String value) {
			addCriterion("state <", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLessThanOrEqualTo(String value) {
			addCriterion("state <=", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLike(String value) {
			addCriterion("state like", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotLike(String value) {
			addCriterion("state not like", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateIn(List<String> values) {
			addCriterion("state in", values, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotIn(List<String> values) {
			addCriterion("state not in", values, "state");
			return (Criteria) this;
		}

		public Criteria andStateBetween(String value1, String value2) {
			addCriterion("state between", value1, value2, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotBetween(String value1, String value2) {
			addCriterion("state not between", value1, value2, "state");
			return (Criteria) this;
		}

		public Criteria andMaxspeedIsNull() {
			addCriterion("maxspeed is null");
			return (Criteria) this;
		}

		public Criteria andMaxspeedIsNotNull() {
			addCriterion("maxspeed is not null");
			return (Criteria) this;
		}

		public Criteria andMaxspeedEqualTo(Integer value) {
			addCriterion("maxspeed =", value, "maxspeed");
			return (Criteria) this;
		}

		public Criteria andMaxspeedNotEqualTo(Integer value) {
			addCriterion("maxspeed <>", value, "maxspeed");
			return (Criteria) this;
		}

		public Criteria andMaxspeedGreaterThan(Integer value) {
			addCriterion("maxspeed >", value, "maxspeed");
			return (Criteria) this;
		}

		public Criteria andMaxspeedGreaterThanOrEqualTo(Integer value) {
			addCriterion("maxspeed >=", value, "maxspeed");
			return (Criteria) this;
		}

		public Criteria andMaxspeedLessThan(Integer value) {
			addCriterion("maxspeed <", value, "maxspeed");
			return (Criteria) this;
		}

		public Criteria andMaxspeedLessThanOrEqualTo(Integer value) {
			addCriterion("maxspeed <=", value, "maxspeed");
			return (Criteria) this;
		}

		public Criteria andMaxspeedIn(List<Integer> values) {
			addCriterion("maxspeed in", values, "maxspeed");
			return (Criteria) this;
		}

		public Criteria andMaxspeedNotIn(List<Integer> values) {
			addCriterion("maxspeed not in", values, "maxspeed");
			return (Criteria) this;
		}

		public Criteria andMaxspeedBetween(Integer value1, Integer value2) {
			addCriterion("maxspeed between", value1, value2, "maxspeed");
			return (Criteria) this;
		}

		public Criteria andMaxspeedNotBetween(Integer value1, Integer value2) {
			addCriterion("maxspeed not between", value1, value2, "maxspeed");
			return (Criteria) this;
		}

		public Criteria andCurrSpeedIsNull() {
			addCriterion("curr_speed is null");
			return (Criteria) this;
		}

		public Criteria andCurrSpeedIsNotNull() {
			addCriterion("curr_speed is not null");
			return (Criteria) this;
		}

		public Criteria andCurrSpeedEqualTo(Integer value) {
			addCriterion("curr_speed =", value, "currSpeed");
			return (Criteria) this;
		}

		public Criteria andCurrSpeedNotEqualTo(Integer value) {
			addCriterion("curr_speed <>", value, "currSpeed");
			return (Criteria) this;
		}

		public Criteria andCurrSpeedGreaterThan(Integer value) {
			addCriterion("curr_speed >", value, "currSpeed");
			return (Criteria) this;
		}

		public Criteria andCurrSpeedGreaterThanOrEqualTo(Integer value) {
			addCriterion("curr_speed >=", value, "currSpeed");
			return (Criteria) this;
		}

		public Criteria andCurrSpeedLessThan(Integer value) {
			addCriterion("curr_speed <", value, "currSpeed");
			return (Criteria) this;
		}

		public Criteria andCurrSpeedLessThanOrEqualTo(Integer value) {
			addCriterion("curr_speed <=", value, "currSpeed");
			return (Criteria) this;
		}

		public Criteria andCurrSpeedIn(List<Integer> values) {
			addCriterion("curr_speed in", values, "currSpeed");
			return (Criteria) this;
		}

		public Criteria andCurrSpeedNotIn(List<Integer> values) {
			addCriterion("curr_speed not in", values, "currSpeed");
			return (Criteria) this;
		}

		public Criteria andCurrSpeedBetween(Integer value1, Integer value2) {
			addCriterion("curr_speed between", value1, value2, "currSpeed");
			return (Criteria) this;
		}

		public Criteria andCurrSpeedNotBetween(Integer value1, Integer value2) {
			addCriterion("curr_speed not between", value1, value2, "currSpeed");
			return (Criteria) this;
		}

		public Criteria andCtimeIsNull() {
			addCriterion("ctime is null");
			return (Criteria) this;
		}

		public Criteria andCtimeIsNotNull() {
			addCriterion("ctime is not null");
			return (Criteria) this;
		}

		public Criteria andCtimeEqualTo(Date value) {
			addCriterionForJDBCDate("ctime =", value, "ctime");
			return (Criteria) this;
		}

		public Criteria andCtimeNotEqualTo(Date value) {
			addCriterionForJDBCDate("ctime <>", value, "ctime");
			return (Criteria) this;
		}

		public Criteria andCtimeGreaterThan(Date value) {
			addCriterionForJDBCDate("ctime >", value, "ctime");
			return (Criteria) this;
		}

		public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("ctime >=", value, "ctime");
			return (Criteria) this;
		}

		public Criteria andCtimeLessThan(Date value) {
			addCriterionForJDBCDate("ctime <", value, "ctime");
			return (Criteria) this;
		}

		public Criteria andCtimeLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("ctime <=", value, "ctime");
			return (Criteria) this;
		}

		public Criteria andCtimeIn(List<Date> values) {
			addCriterionForJDBCDate("ctime in", values, "ctime");
			return (Criteria) this;
		}

		public Criteria andCtimeNotIn(List<Date> values) {
			addCriterionForJDBCDate("ctime not in", values, "ctime");
			return (Criteria) this;
		}

		public Criteria andCtimeBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("ctime between", value1, value2, "ctime");
			return (Criteria) this;
		}

		public Criteria andCtimeNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("ctime not between", value1, value2, "ctime");
			return (Criteria) this;
		}
	}

	
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

	
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}