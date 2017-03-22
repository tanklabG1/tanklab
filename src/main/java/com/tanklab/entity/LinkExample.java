package main.java.com.tanklab.entity;

import java.util.ArrayList;
import java.util.List;

public class LinkExample {
    
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;

	
	public LinkExample() {
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

		public Criteria andLinkIdIsNull() {
			addCriterion("link_id is null");
			return (Criteria) this;
		}

		public Criteria andLinkIdIsNotNull() {
			addCriterion("link_id is not null");
			return (Criteria) this;
		}

		public Criteria andLinkIdEqualTo(Integer value) {
			addCriterion("link_id =", value, "linkId");
			return (Criteria) this;
		}

		public Criteria andLinkIdNotEqualTo(Integer value) {
			addCriterion("link_id <>", value, "linkId");
			return (Criteria) this;
		}

		public Criteria andLinkIdGreaterThan(Integer value) {
			addCriterion("link_id >", value, "linkId");
			return (Criteria) this;
		}

		public Criteria andLinkIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("link_id >=", value, "linkId");
			return (Criteria) this;
		}

		public Criteria andLinkIdLessThan(Integer value) {
			addCriterion("link_id <", value, "linkId");
			return (Criteria) this;
		}

		public Criteria andLinkIdLessThanOrEqualTo(Integer value) {
			addCriterion("link_id <=", value, "linkId");
			return (Criteria) this;
		}

		public Criteria andLinkIdIn(List<Integer> values) {
			addCriterion("link_id in", values, "linkId");
			return (Criteria) this;
		}

		public Criteria andLinkIdNotIn(List<Integer> values) {
			addCriterion("link_id not in", values, "linkId");
			return (Criteria) this;
		}

		public Criteria andLinkIdBetween(Integer value1, Integer value2) {
			addCriterion("link_id between", value1, value2, "linkId");
			return (Criteria) this;
		}

		public Criteria andLinkIdNotBetween(Integer value1, Integer value2) {
			addCriterion("link_id not between", value1, value2, "linkId");
			return (Criteria) this;
		}

		public Criteria andSrcSwIdIsNull() {
			addCriterion("src_sw_id is null");
			return (Criteria) this;
		}

		public Criteria andSrcSwIdIsNotNull() {
			addCriterion("src_sw_id is not null");
			return (Criteria) this;
		}

		public Criteria andSrcSwIdEqualTo(Integer value) {
			addCriterion("src_sw_id =", value, "srcSwId");
			return (Criteria) this;
		}

		public Criteria andSrcSwIdNotEqualTo(Integer value) {
			addCriterion("src_sw_id <>", value, "srcSwId");
			return (Criteria) this;
		}

		public Criteria andSrcSwIdGreaterThan(Integer value) {
			addCriterion("src_sw_id >", value, "srcSwId");
			return (Criteria) this;
		}

		public Criteria andSrcSwIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("src_sw_id >=", value, "srcSwId");
			return (Criteria) this;
		}

		public Criteria andSrcSwIdLessThan(Integer value) {
			addCriterion("src_sw_id <", value, "srcSwId");
			return (Criteria) this;
		}

		public Criteria andSrcSwIdLessThanOrEqualTo(Integer value) {
			addCriterion("src_sw_id <=", value, "srcSwId");
			return (Criteria) this;
		}

		public Criteria andSrcSwIdIn(List<Integer> values) {
			addCriterion("src_sw_id in", values, "srcSwId");
			return (Criteria) this;
		}

		public Criteria andSrcSwIdNotIn(List<Integer> values) {
			addCriterion("src_sw_id not in", values, "srcSwId");
			return (Criteria) this;
		}

		public Criteria andSrcSwIdBetween(Integer value1, Integer value2) {
			addCriterion("src_sw_id between", value1, value2, "srcSwId");
			return (Criteria) this;
		}

		public Criteria andSrcSwIdNotBetween(Integer value1, Integer value2) {
			addCriterion("src_sw_id not between", value1, value2, "srcSwId");
			return (Criteria) this;
		}

		public Criteria andDstSwIdIsNull() {
			addCriterion("dst_sw_id is null");
			return (Criteria) this;
		}

		public Criteria andDstSwIdIsNotNull() {
			addCriterion("dst_sw_id is not null");
			return (Criteria) this;
		}

		public Criteria andDstSwIdEqualTo(Integer value) {
			addCriterion("dst_sw_id =", value, "dstSwId");
			return (Criteria) this;
		}

		public Criteria andDstSwIdNotEqualTo(Integer value) {
			addCriterion("dst_sw_id <>", value, "dstSwId");
			return (Criteria) this;
		}

		public Criteria andDstSwIdGreaterThan(Integer value) {
			addCriterion("dst_sw_id >", value, "dstSwId");
			return (Criteria) this;
		}

		public Criteria andDstSwIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("dst_sw_id >=", value, "dstSwId");
			return (Criteria) this;
		}

		public Criteria andDstSwIdLessThan(Integer value) {
			addCriterion("dst_sw_id <", value, "dstSwId");
			return (Criteria) this;
		}

		public Criteria andDstSwIdLessThanOrEqualTo(Integer value) {
			addCriterion("dst_sw_id <=", value, "dstSwId");
			return (Criteria) this;
		}

		public Criteria andDstSwIdIn(List<Integer> values) {
			addCriterion("dst_sw_id in", values, "dstSwId");
			return (Criteria) this;
		}

		public Criteria andDstSwIdNotIn(List<Integer> values) {
			addCriterion("dst_sw_id not in", values, "dstSwId");
			return (Criteria) this;
		}

		public Criteria andDstSwIdBetween(Integer value1, Integer value2) {
			addCriterion("dst_sw_id between", value1, value2, "dstSwId");
			return (Criteria) this;
		}

		public Criteria andDstSwIdNotBetween(Integer value1, Integer value2) {
			addCriterion("dst_sw_id not between", value1, value2, "dstSwId");
			return (Criteria) this;
		}

		public Criteria andSrcPortIdIsNull() {
			addCriterion("src_port_id is null");
			return (Criteria) this;
		}

		public Criteria andSrcPortIdIsNotNull() {
			addCriterion("src_port_id is not null");
			return (Criteria) this;
		}

		public Criteria andSrcPortIdEqualTo(Integer value) {
			addCriterion("src_port_id =", value, "srcPortId");
			return (Criteria) this;
		}

		public Criteria andSrcPortIdNotEqualTo(Integer value) {
			addCriterion("src_port_id <>", value, "srcPortId");
			return (Criteria) this;
		}

		public Criteria andSrcPortIdGreaterThan(Integer value) {
			addCriterion("src_port_id >", value, "srcPortId");
			return (Criteria) this;
		}

		public Criteria andSrcPortIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("src_port_id >=", value, "srcPortId");
			return (Criteria) this;
		}

		public Criteria andSrcPortIdLessThan(Integer value) {
			addCriterion("src_port_id <", value, "srcPortId");
			return (Criteria) this;
		}

		public Criteria andSrcPortIdLessThanOrEqualTo(Integer value) {
			addCriterion("src_port_id <=", value, "srcPortId");
			return (Criteria) this;
		}

		public Criteria andSrcPortIdIn(List<Integer> values) {
			addCriterion("src_port_id in", values, "srcPortId");
			return (Criteria) this;
		}

		public Criteria andSrcPortIdNotIn(List<Integer> values) {
			addCriterion("src_port_id not in", values, "srcPortId");
			return (Criteria) this;
		}

		public Criteria andSrcPortIdBetween(Integer value1, Integer value2) {
			addCriterion("src_port_id between", value1, value2, "srcPortId");
			return (Criteria) this;
		}

		public Criteria andSrcPortIdNotBetween(Integer value1, Integer value2) {
			addCriterion("src_port_id not between", value1, value2, "srcPortId");
			return (Criteria) this;
		}

		public Criteria andDstPortIdIsNull() {
			addCriterion("dst_port_id is null");
			return (Criteria) this;
		}

		public Criteria andDstPortIdIsNotNull() {
			addCriterion("dst_port_id is not null");
			return (Criteria) this;
		}

		public Criteria andDstPortIdEqualTo(Integer value) {
			addCriterion("dst_port_id =", value, "dstPortId");
			return (Criteria) this;
		}

		public Criteria andDstPortIdNotEqualTo(Integer value) {
			addCriterion("dst_port_id <>", value, "dstPortId");
			return (Criteria) this;
		}

		public Criteria andDstPortIdGreaterThan(Integer value) {
			addCriterion("dst_port_id >", value, "dstPortId");
			return (Criteria) this;
		}

		public Criteria andDstPortIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("dst_port_id >=", value, "dstPortId");
			return (Criteria) this;
		}

		public Criteria andDstPortIdLessThan(Integer value) {
			addCriterion("dst_port_id <", value, "dstPortId");
			return (Criteria) this;
		}

		public Criteria andDstPortIdLessThanOrEqualTo(Integer value) {
			addCriterion("dst_port_id <=", value, "dstPortId");
			return (Criteria) this;
		}

		public Criteria andDstPortIdIn(List<Integer> values) {
			addCriterion("dst_port_id in", values, "dstPortId");
			return (Criteria) this;
		}

		public Criteria andDstPortIdNotIn(List<Integer> values) {
			addCriterion("dst_port_id not in", values, "dstPortId");
			return (Criteria) this;
		}

		public Criteria andDstPortIdBetween(Integer value1, Integer value2) {
			addCriterion("dst_port_id between", value1, value2, "dstPortId");
			return (Criteria) this;
		}

		public Criteria andDstPortIdNotBetween(Integer value1, Integer value2) {
			addCriterion("dst_port_id not between", value1, value2, "dstPortId");
			return (Criteria) this;
		}

		public Criteria andBandwithIsNull() {
			addCriterion("bandwith is null");
			return (Criteria) this;
		}

		public Criteria andBandwithIsNotNull() {
			addCriterion("bandwith is not null");
			return (Criteria) this;
		}

		public Criteria andBandwithEqualTo(Integer value) {
			addCriterion("bandwith =", value, "bandwith");
			return (Criteria) this;
		}

		public Criteria andBandwithNotEqualTo(Integer value) {
			addCriterion("bandwith <>", value, "bandwith");
			return (Criteria) this;
		}

		public Criteria andBandwithGreaterThan(Integer value) {
			addCriterion("bandwith >", value, "bandwith");
			return (Criteria) this;
		}

		public Criteria andBandwithGreaterThanOrEqualTo(Integer value) {
			addCriterion("bandwith >=", value, "bandwith");
			return (Criteria) this;
		}

		public Criteria andBandwithLessThan(Integer value) {
			addCriterion("bandwith <", value, "bandwith");
			return (Criteria) this;
		}

		public Criteria andBandwithLessThanOrEqualTo(Integer value) {
			addCriterion("bandwith <=", value, "bandwith");
			return (Criteria) this;
		}

		public Criteria andBandwithIn(List<Integer> values) {
			addCriterion("bandwith in", values, "bandwith");
			return (Criteria) this;
		}

		public Criteria andBandwithNotIn(List<Integer> values) {
			addCriterion("bandwith not in", values, "bandwith");
			return (Criteria) this;
		}

		public Criteria andBandwithBetween(Integer value1, Integer value2) {
			addCriterion("bandwith between", value1, value2, "bandwith");
			return (Criteria) this;
		}

		public Criteria andBandwithNotBetween(Integer value1, Integer value2) {
			addCriterion("bandwith not between", value1, value2, "bandwith");
			return (Criteria) this;
		}

		public Criteria andLatencyIsNull() {
			addCriterion("latency is null");
			return (Criteria) this;
		}

		public Criteria andLatencyIsNotNull() {
			addCriterion("latency is not null");
			return (Criteria) this;
		}

		public Criteria andLatencyEqualTo(Integer value) {
			addCriterion("latency =", value, "latency");
			return (Criteria) this;
		}

		public Criteria andLatencyNotEqualTo(Integer value) {
			addCriterion("latency <>", value, "latency");
			return (Criteria) this;
		}

		public Criteria andLatencyGreaterThan(Integer value) {
			addCriterion("latency >", value, "latency");
			return (Criteria) this;
		}

		public Criteria andLatencyGreaterThanOrEqualTo(Integer value) {
			addCriterion("latency >=", value, "latency");
			return (Criteria) this;
		}

		public Criteria andLatencyLessThan(Integer value) {
			addCriterion("latency <", value, "latency");
			return (Criteria) this;
		}

		public Criteria andLatencyLessThanOrEqualTo(Integer value) {
			addCriterion("latency <=", value, "latency");
			return (Criteria) this;
		}

		public Criteria andLatencyIn(List<Integer> values) {
			addCriterion("latency in", values, "latency");
			return (Criteria) this;
		}

		public Criteria andLatencyNotIn(List<Integer> values) {
			addCriterion("latency not in", values, "latency");
			return (Criteria) this;
		}

		public Criteria andLatencyBetween(Integer value1, Integer value2) {
			addCriterion("latency between", value1, value2, "latency");
			return (Criteria) this;
		}

		public Criteria andLatencyNotBetween(Integer value1, Integer value2) {
			addCriterion("latency not between", value1, value2, "latency");
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