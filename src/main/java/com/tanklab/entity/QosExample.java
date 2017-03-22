package main.java.com.tanklab.entity;

import java.util.ArrayList;
import java.util.List;

public class QosExample {
    
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;

	
	public QosExample() {
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

		public Criteria andBelongSwIdIsNull() {
			addCriterion("belong_sw_id is null");
			return (Criteria) this;
		}

		public Criteria andBelongSwIdIsNotNull() {
			addCriterion("belong_sw_id is not null");
			return (Criteria) this;
		}

		public Criteria andBelongSwIdEqualTo(Integer value) {
			addCriterion("belong_sw_id =", value, "belongSwId");
			return (Criteria) this;
		}

		public Criteria andBelongSwIdNotEqualTo(Integer value) {
			addCriterion("belong_sw_id <>", value, "belongSwId");
			return (Criteria) this;
		}

		public Criteria andBelongSwIdGreaterThan(Integer value) {
			addCriterion("belong_sw_id >", value, "belongSwId");
			return (Criteria) this;
		}

		public Criteria andBelongSwIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("belong_sw_id >=", value, "belongSwId");
			return (Criteria) this;
		}

		public Criteria andBelongSwIdLessThan(Integer value) {
			addCriterion("belong_sw_id <", value, "belongSwId");
			return (Criteria) this;
		}

		public Criteria andBelongSwIdLessThanOrEqualTo(Integer value) {
			addCriterion("belong_sw_id <=", value, "belongSwId");
			return (Criteria) this;
		}

		public Criteria andBelongSwIdIn(List<Integer> values) {
			addCriterion("belong_sw_id in", values, "belongSwId");
			return (Criteria) this;
		}

		public Criteria andBelongSwIdNotIn(List<Integer> values) {
			addCriterion("belong_sw_id not in", values, "belongSwId");
			return (Criteria) this;
		}

		public Criteria andBelongSwIdBetween(Integer value1, Integer value2) {
			addCriterion("belong_sw_id between", value1, value2, "belongSwId");
			return (Criteria) this;
		}

		public Criteria andBelongSwIdNotBetween(Integer value1, Integer value2) {
			addCriterion("belong_sw_id not between", value1, value2, "belongSwId");
			return (Criteria) this;
		}

		public Criteria andQosIdIsNull() {
			addCriterion("qos_id is null");
			return (Criteria) this;
		}

		public Criteria andQosIdIsNotNull() {
			addCriterion("qos_id is not null");
			return (Criteria) this;
		}

		public Criteria andQosIdEqualTo(Integer value) {
			addCriterion("qos_id =", value, "qosId");
			return (Criteria) this;
		}

		public Criteria andQosIdNotEqualTo(Integer value) {
			addCriterion("qos_id <>", value, "qosId");
			return (Criteria) this;
		}

		public Criteria andQosIdGreaterThan(Integer value) {
			addCriterion("qos_id >", value, "qosId");
			return (Criteria) this;
		}

		public Criteria andQosIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("qos_id >=", value, "qosId");
			return (Criteria) this;
		}

		public Criteria andQosIdLessThan(Integer value) {
			addCriterion("qos_id <", value, "qosId");
			return (Criteria) this;
		}

		public Criteria andQosIdLessThanOrEqualTo(Integer value) {
			addCriterion("qos_id <=", value, "qosId");
			return (Criteria) this;
		}

		public Criteria andQosIdIn(List<Integer> values) {
			addCriterion("qos_id in", values, "qosId");
			return (Criteria) this;
		}

		public Criteria andQosIdNotIn(List<Integer> values) {
			addCriterion("qos_id not in", values, "qosId");
			return (Criteria) this;
		}

		public Criteria andQosIdBetween(Integer value1, Integer value2) {
			addCriterion("qos_id between", value1, value2, "qosId");
			return (Criteria) this;
		}

		public Criteria andQosIdNotBetween(Integer value1, Integer value2) {
			addCriterion("qos_id not between", value1, value2, "qosId");
			return (Criteria) this;
		}

		public Criteria andQosUuidIsNull() {
			addCriterion("qos_uuid is null");
			return (Criteria) this;
		}

		public Criteria andQosUuidIsNotNull() {
			addCriterion("qos_uuid is not null");
			return (Criteria) this;
		}

		public Criteria andQosUuidEqualTo(String value) {
			addCriterion("qos_uuid =", value, "qosUuid");
			return (Criteria) this;
		}

		public Criteria andQosUuidNotEqualTo(String value) {
			addCriterion("qos_uuid <>", value, "qosUuid");
			return (Criteria) this;
		}

		public Criteria andQosUuidGreaterThan(String value) {
			addCriterion("qos_uuid >", value, "qosUuid");
			return (Criteria) this;
		}

		public Criteria andQosUuidGreaterThanOrEqualTo(String value) {
			addCriterion("qos_uuid >=", value, "qosUuid");
			return (Criteria) this;
		}

		public Criteria andQosUuidLessThan(String value) {
			addCriterion("qos_uuid <", value, "qosUuid");
			return (Criteria) this;
		}

		public Criteria andQosUuidLessThanOrEqualTo(String value) {
			addCriterion("qos_uuid <=", value, "qosUuid");
			return (Criteria) this;
		}

		public Criteria andQosUuidLike(String value) {
			addCriterion("qos_uuid like", value, "qosUuid");
			return (Criteria) this;
		}

		public Criteria andQosUuidNotLike(String value) {
			addCriterion("qos_uuid not like", value, "qosUuid");
			return (Criteria) this;
		}

		public Criteria andQosUuidIn(List<String> values) {
			addCriterion("qos_uuid in", values, "qosUuid");
			return (Criteria) this;
		}

		public Criteria andQosUuidNotIn(List<String> values) {
			addCriterion("qos_uuid not in", values, "qosUuid");
			return (Criteria) this;
		}

		public Criteria andQosUuidBetween(String value1, String value2) {
			addCriterion("qos_uuid between", value1, value2, "qosUuid");
			return (Criteria) this;
		}

		public Criteria andQosUuidNotBetween(String value1, String value2) {
			addCriterion("qos_uuid not between", value1, value2, "qosUuid");
			return (Criteria) this;
		}

		public Criteria andQosbandIsNull() {
			addCriterion("qosBand is null");
			return (Criteria) this;
		}

		public Criteria andQosbandIsNotNull() {
			addCriterion("qosBand is not null");
			return (Criteria) this;
		}

		public Criteria andQosbandEqualTo(String value) {
			addCriterion("qosBand =", value, "qosband");
			return (Criteria) this;
		}

		public Criteria andQosbandNotEqualTo(String value) {
			addCriterion("qosBand <>", value, "qosband");
			return (Criteria) this;
		}

		public Criteria andQosbandGreaterThan(String value) {
			addCriterion("qosBand >", value, "qosband");
			return (Criteria) this;
		}

		public Criteria andQosbandGreaterThanOrEqualTo(String value) {
			addCriterion("qosBand >=", value, "qosband");
			return (Criteria) this;
		}

		public Criteria andQosbandLessThan(String value) {
			addCriterion("qosBand <", value, "qosband");
			return (Criteria) this;
		}

		public Criteria andQosbandLessThanOrEqualTo(String value) {
			addCriterion("qosBand <=", value, "qosband");
			return (Criteria) this;
		}

		public Criteria andQosbandLike(String value) {
			addCriterion("qosBand like", value, "qosband");
			return (Criteria) this;
		}

		public Criteria andQosbandNotLike(String value) {
			addCriterion("qosBand not like", value, "qosband");
			return (Criteria) this;
		}

		public Criteria andQosbandIn(List<String> values) {
			addCriterion("qosBand in", values, "qosband");
			return (Criteria) this;
		}

		public Criteria andQosbandNotIn(List<String> values) {
			addCriterion("qosBand not in", values, "qosband");
			return (Criteria) this;
		}

		public Criteria andQosbandBetween(String value1, String value2) {
			addCriterion("qosBand between", value1, value2, "qosband");
			return (Criteria) this;
		}

		public Criteria andQosbandNotBetween(String value1, String value2) {
			addCriterion("qosBand not between", value1, value2, "qosband");
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