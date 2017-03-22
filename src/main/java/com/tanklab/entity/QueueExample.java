package main.java.com.tanklab.entity;

import java.util.ArrayList;
import java.util.List;

public class QueueExample {
    
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;

	
	public QueueExample() {
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

		public Criteria andQueueIdIsNull() {
			addCriterion("queue_id is null");
			return (Criteria) this;
		}

		public Criteria andQueueIdIsNotNull() {
			addCriterion("queue_id is not null");
			return (Criteria) this;
		}

		public Criteria andQueueIdEqualTo(Integer value) {
			addCriterion("queue_id =", value, "queueId");
			return (Criteria) this;
		}

		public Criteria andQueueIdNotEqualTo(Integer value) {
			addCriterion("queue_id <>", value, "queueId");
			return (Criteria) this;
		}

		public Criteria andQueueIdGreaterThan(Integer value) {
			addCriterion("queue_id >", value, "queueId");
			return (Criteria) this;
		}

		public Criteria andQueueIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("queue_id >=", value, "queueId");
			return (Criteria) this;
		}

		public Criteria andQueueIdLessThan(Integer value) {
			addCriterion("queue_id <", value, "queueId");
			return (Criteria) this;
		}

		public Criteria andQueueIdLessThanOrEqualTo(Integer value) {
			addCriterion("queue_id <=", value, "queueId");
			return (Criteria) this;
		}

		public Criteria andQueueIdIn(List<Integer> values) {
			addCriterion("queue_id in", values, "queueId");
			return (Criteria) this;
		}

		public Criteria andQueueIdNotIn(List<Integer> values) {
			addCriterion("queue_id not in", values, "queueId");
			return (Criteria) this;
		}

		public Criteria andQueueIdBetween(Integer value1, Integer value2) {
			addCriterion("queue_id between", value1, value2, "queueId");
			return (Criteria) this;
		}

		public Criteria andQueueIdNotBetween(Integer value1, Integer value2) {
			addCriterion("queue_id not between", value1, value2, "queueId");
			return (Criteria) this;
		}

		public Criteria andQueueUuidIsNull() {
			addCriterion("queue_uuid is null");
			return (Criteria) this;
		}

		public Criteria andQueueUuidIsNotNull() {
			addCriterion("queue_uuid is not null");
			return (Criteria) this;
		}

		public Criteria andQueueUuidEqualTo(String value) {
			addCriterion("queue_uuid =", value, "queueUuid");
			return (Criteria) this;
		}

		public Criteria andQueueUuidNotEqualTo(String value) {
			addCriterion("queue_uuid <>", value, "queueUuid");
			return (Criteria) this;
		}

		public Criteria andQueueUuidGreaterThan(String value) {
			addCriterion("queue_uuid >", value, "queueUuid");
			return (Criteria) this;
		}

		public Criteria andQueueUuidGreaterThanOrEqualTo(String value) {
			addCriterion("queue_uuid >=", value, "queueUuid");
			return (Criteria) this;
		}

		public Criteria andQueueUuidLessThan(String value) {
			addCriterion("queue_uuid <", value, "queueUuid");
			return (Criteria) this;
		}

		public Criteria andQueueUuidLessThanOrEqualTo(String value) {
			addCriterion("queue_uuid <=", value, "queueUuid");
			return (Criteria) this;
		}

		public Criteria andQueueUuidLike(String value) {
			addCriterion("queue_uuid like", value, "queueUuid");
			return (Criteria) this;
		}

		public Criteria andQueueUuidNotLike(String value) {
			addCriterion("queue_uuid not like", value, "queueUuid");
			return (Criteria) this;
		}

		public Criteria andQueueUuidIn(List<String> values) {
			addCriterion("queue_uuid in", values, "queueUuid");
			return (Criteria) this;
		}

		public Criteria andQueueUuidNotIn(List<String> values) {
			addCriterion("queue_uuid not in", values, "queueUuid");
			return (Criteria) this;
		}

		public Criteria andQueueUuidBetween(String value1, String value2) {
			addCriterion("queue_uuid between", value1, value2, "queueUuid");
			return (Criteria) this;
		}

		public Criteria andQueueUuidNotBetween(String value1, String value2) {
			addCriterion("queue_uuid not between", value1, value2, "queueUuid");
			return (Criteria) this;
		}

		public Criteria andMaxRateIsNull() {
			addCriterion("max_rate is null");
			return (Criteria) this;
		}

		public Criteria andMaxRateIsNotNull() {
			addCriterion("max_rate is not null");
			return (Criteria) this;
		}

		public Criteria andMaxRateEqualTo(Integer value) {
			addCriterion("max_rate =", value, "maxRate");
			return (Criteria) this;
		}

		public Criteria andMaxRateNotEqualTo(Integer value) {
			addCriterion("max_rate <>", value, "maxRate");
			return (Criteria) this;
		}

		public Criteria andMaxRateGreaterThan(Integer value) {
			addCriterion("max_rate >", value, "maxRate");
			return (Criteria) this;
		}

		public Criteria andMaxRateGreaterThanOrEqualTo(Integer value) {
			addCriterion("max_rate >=", value, "maxRate");
			return (Criteria) this;
		}

		public Criteria andMaxRateLessThan(Integer value) {
			addCriterion("max_rate <", value, "maxRate");
			return (Criteria) this;
		}

		public Criteria andMaxRateLessThanOrEqualTo(Integer value) {
			addCriterion("max_rate <=", value, "maxRate");
			return (Criteria) this;
		}

		public Criteria andMaxRateIn(List<Integer> values) {
			addCriterion("max_rate in", values, "maxRate");
			return (Criteria) this;
		}

		public Criteria andMaxRateNotIn(List<Integer> values) {
			addCriterion("max_rate not in", values, "maxRate");
			return (Criteria) this;
		}

		public Criteria andMaxRateBetween(Integer value1, Integer value2) {
			addCriterion("max_rate between", value1, value2, "maxRate");
			return (Criteria) this;
		}

		public Criteria andMaxRateNotBetween(Integer value1, Integer value2) {
			addCriterion("max_rate not between", value1, value2, "maxRate");
			return (Criteria) this;
		}

		public Criteria andMinRateIsNull() {
			addCriterion("min_rate is null");
			return (Criteria) this;
		}

		public Criteria andMinRateIsNotNull() {
			addCriterion("min_rate is not null");
			return (Criteria) this;
		}

		public Criteria andMinRateEqualTo(Integer value) {
			addCriterion("min_rate =", value, "minRate");
			return (Criteria) this;
		}

		public Criteria andMinRateNotEqualTo(Integer value) {
			addCriterion("min_rate <>", value, "minRate");
			return (Criteria) this;
		}

		public Criteria andMinRateGreaterThan(Integer value) {
			addCriterion("min_rate >", value, "minRate");
			return (Criteria) this;
		}

		public Criteria andMinRateGreaterThanOrEqualTo(Integer value) {
			addCriterion("min_rate >=", value, "minRate");
			return (Criteria) this;
		}

		public Criteria andMinRateLessThan(Integer value) {
			addCriterion("min_rate <", value, "minRate");
			return (Criteria) this;
		}

		public Criteria andMinRateLessThanOrEqualTo(Integer value) {
			addCriterion("min_rate <=", value, "minRate");
			return (Criteria) this;
		}

		public Criteria andMinRateIn(List<Integer> values) {
			addCriterion("min_rate in", values, "minRate");
			return (Criteria) this;
		}

		public Criteria andMinRateNotIn(List<Integer> values) {
			addCriterion("min_rate not in", values, "minRate");
			return (Criteria) this;
		}

		public Criteria andMinRateBetween(Integer value1, Integer value2) {
			addCriterion("min_rate between", value1, value2, "minRate");
			return (Criteria) this;
		}

		public Criteria andMinRateNotBetween(Integer value1, Integer value2) {
			addCriterion("min_rate not between", value1, value2, "minRate");
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