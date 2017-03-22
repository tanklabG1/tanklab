package main.java.com.tanklab.entity;

import java.util.ArrayList;
import java.util.List;

public class HostExample {
    
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;

	
	public HostExample() {
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

		public Criteria andTypeIsNull() {
			addCriterion("type is null");
			return (Criteria) this;
		}

		public Criteria andTypeIsNotNull() {
			addCriterion("type is not null");
			return (Criteria) this;
		}

		public Criteria andTypeEqualTo(String value) {
			addCriterion("type =", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotEqualTo(String value) {
			addCriterion("type <>", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThan(String value) {
			addCriterion("type >", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThanOrEqualTo(String value) {
			addCriterion("type >=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThan(String value) {
			addCriterion("type <", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThanOrEqualTo(String value) {
			addCriterion("type <=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLike(String value) {
			addCriterion("type like", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotLike(String value) {
			addCriterion("type not like", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeIn(List<String> values) {
			addCriterion("type in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotIn(List<String> values) {
			addCriterion("type not in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeBetween(String value1, String value2) {
			addCriterion("type between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotBetween(String value1, String value2) {
			addCriterion("type not between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andHostIdIsNull() {
			addCriterion("host_id is null");
			return (Criteria) this;
		}

		public Criteria andHostIdIsNotNull() {
			addCriterion("host_id is not null");
			return (Criteria) this;
		}

		public Criteria andHostIdEqualTo(Integer value) {
			addCriterion("host_id =", value, "hostId");
			return (Criteria) this;
		}

		public Criteria andHostIdNotEqualTo(Integer value) {
			addCriterion("host_id <>", value, "hostId");
			return (Criteria) this;
		}

		public Criteria andHostIdGreaterThan(Integer value) {
			addCriterion("host_id >", value, "hostId");
			return (Criteria) this;
		}

		public Criteria andHostIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("host_id >=", value, "hostId");
			return (Criteria) this;
		}

		public Criteria andHostIdLessThan(Integer value) {
			addCriterion("host_id <", value, "hostId");
			return (Criteria) this;
		}

		public Criteria andHostIdLessThanOrEqualTo(Integer value) {
			addCriterion("host_id <=", value, "hostId");
			return (Criteria) this;
		}

		public Criteria andHostIdIn(List<Integer> values) {
			addCriterion("host_id in", values, "hostId");
			return (Criteria) this;
		}

		public Criteria andHostIdNotIn(List<Integer> values) {
			addCriterion("host_id not in", values, "hostId");
			return (Criteria) this;
		}

		public Criteria andHostIdBetween(Integer value1, Integer value2) {
			addCriterion("host_id between", value1, value2, "hostId");
			return (Criteria) this;
		}

		public Criteria andHostIdNotBetween(Integer value1, Integer value2) {
			addCriterion("host_id not between", value1, value2, "hostId");
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

		public Criteria andIpv4AddrIsNull() {
			addCriterion("ipv4_addr is null");
			return (Criteria) this;
		}

		public Criteria andIpv4AddrIsNotNull() {
			addCriterion("ipv4_addr is not null");
			return (Criteria) this;
		}

		public Criteria andIpv4AddrEqualTo(String value) {
			addCriterion("ipv4_addr =", value, "ipv4Addr");
			return (Criteria) this;
		}

		public Criteria andIpv4AddrNotEqualTo(String value) {
			addCriterion("ipv4_addr <>", value, "ipv4Addr");
			return (Criteria) this;
		}

		public Criteria andIpv4AddrGreaterThan(String value) {
			addCriterion("ipv4_addr >", value, "ipv4Addr");
			return (Criteria) this;
		}

		public Criteria andIpv4AddrGreaterThanOrEqualTo(String value) {
			addCriterion("ipv4_addr >=", value, "ipv4Addr");
			return (Criteria) this;
		}

		public Criteria andIpv4AddrLessThan(String value) {
			addCriterion("ipv4_addr <", value, "ipv4Addr");
			return (Criteria) this;
		}

		public Criteria andIpv4AddrLessThanOrEqualTo(String value) {
			addCriterion("ipv4_addr <=", value, "ipv4Addr");
			return (Criteria) this;
		}

		public Criteria andIpv4AddrLike(String value) {
			addCriterion("ipv4_addr like", value, "ipv4Addr");
			return (Criteria) this;
		}

		public Criteria andIpv4AddrNotLike(String value) {
			addCriterion("ipv4_addr not like", value, "ipv4Addr");
			return (Criteria) this;
		}

		public Criteria andIpv4AddrIn(List<String> values) {
			addCriterion("ipv4_addr in", values, "ipv4Addr");
			return (Criteria) this;
		}

		public Criteria andIpv4AddrNotIn(List<String> values) {
			addCriterion("ipv4_addr not in", values, "ipv4Addr");
			return (Criteria) this;
		}

		public Criteria andIpv4AddrBetween(String value1, String value2) {
			addCriterion("ipv4_addr between", value1, value2, "ipv4Addr");
			return (Criteria) this;
		}

		public Criteria andIpv4AddrNotBetween(String value1, String value2) {
			addCriterion("ipv4_addr not between", value1, value2, "ipv4Addr");
			return (Criteria) this;
		}

		public Criteria andConSwPortIdIsNull() {
			addCriterion("con_sw_port_id is null");
			return (Criteria) this;
		}

		public Criteria andConSwPortIdIsNotNull() {
			addCriterion("con_sw_port_id is not null");
			return (Criteria) this;
		}

		public Criteria andConSwPortIdEqualTo(Integer value) {
			addCriterion("con_sw_port_id =", value, "conSwPortId");
			return (Criteria) this;
		}

		public Criteria andConSwPortIdNotEqualTo(Integer value) {
			addCriterion("con_sw_port_id <>", value, "conSwPortId");
			return (Criteria) this;
		}

		public Criteria andConSwPortIdGreaterThan(Integer value) {
			addCriterion("con_sw_port_id >", value, "conSwPortId");
			return (Criteria) this;
		}

		public Criteria andConSwPortIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("con_sw_port_id >=", value, "conSwPortId");
			return (Criteria) this;
		}

		public Criteria andConSwPortIdLessThan(Integer value) {
			addCriterion("con_sw_port_id <", value, "conSwPortId");
			return (Criteria) this;
		}

		public Criteria andConSwPortIdLessThanOrEqualTo(Integer value) {
			addCriterion("con_sw_port_id <=", value, "conSwPortId");
			return (Criteria) this;
		}

		public Criteria andConSwPortIdIn(List<Integer> values) {
			addCriterion("con_sw_port_id in", values, "conSwPortId");
			return (Criteria) this;
		}

		public Criteria andConSwPortIdNotIn(List<Integer> values) {
			addCriterion("con_sw_port_id not in", values, "conSwPortId");
			return (Criteria) this;
		}

		public Criteria andConSwPortIdBetween(Integer value1, Integer value2) {
			addCriterion("con_sw_port_id between", value1, value2, "conSwPortId");
			return (Criteria) this;
		}

		public Criteria andConSwPortIdNotBetween(Integer value1, Integer value2) {
			addCriterion("con_sw_port_id not between", value1, value2, "conSwPortId");
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