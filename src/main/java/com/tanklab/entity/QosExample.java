package main.java.com.tanklab.entity;

import java.util.ArrayList;
import java.util.List;

public class QosExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table qos
     *
     * @mbg.generated Fri Mar 24 14:53:55 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table qos
     *
     * @mbg.generated Fri Mar 24 14:53:55 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table qos
     *
     * @mbg.generated Fri Mar 24 14:53:55 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qos
     *
     * @mbg.generated Fri Mar 24 14:53:55 CST 2017
     */
    public QosExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qos
     *
     * @mbg.generated Fri Mar 24 14:53:55 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qos
     *
     * @mbg.generated Fri Mar 24 14:53:55 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qos
     *
     * @mbg.generated Fri Mar 24 14:53:55 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qos
     *
     * @mbg.generated Fri Mar 24 14:53:55 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qos
     *
     * @mbg.generated Fri Mar 24 14:53:55 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qos
     *
     * @mbg.generated Fri Mar 24 14:53:55 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qos
     *
     * @mbg.generated Fri Mar 24 14:53:55 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qos
     *
     * @mbg.generated Fri Mar 24 14:53:55 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qos
     *
     * @mbg.generated Fri Mar 24 14:53:55 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qos
     *
     * @mbg.generated Fri Mar 24 14:53:55 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table qos
     *
     * @mbg.generated Fri Mar 24 14:53:55 CST 2017
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

        public Criteria andBelongSwIdIsNull() {
            addCriterion("belong_sw_id is null");
            return (Criteria) this;
        }

        public Criteria andBelongSwIdIsNotNull() {
            addCriterion("belong_sw_id is not null");
            return (Criteria) this;
        }

        public Criteria andBelongSwIdEqualTo(String value) {
            addCriterion("belong_sw_id =", value, "belongSwId");
            return (Criteria) this;
        }

        public Criteria andBelongSwIdNotEqualTo(String value) {
            addCriterion("belong_sw_id <>", value, "belongSwId");
            return (Criteria) this;
        }

        public Criteria andBelongSwIdGreaterThan(String value) {
            addCriterion("belong_sw_id >", value, "belongSwId");
            return (Criteria) this;
        }

        public Criteria andBelongSwIdGreaterThanOrEqualTo(String value) {
            addCriterion("belong_sw_id >=", value, "belongSwId");
            return (Criteria) this;
        }

        public Criteria andBelongSwIdLessThan(String value) {
            addCriterion("belong_sw_id <", value, "belongSwId");
            return (Criteria) this;
        }

        public Criteria andBelongSwIdLessThanOrEqualTo(String value) {
            addCriterion("belong_sw_id <=", value, "belongSwId");
            return (Criteria) this;
        }

        public Criteria andBelongSwIdLike(String value) {
            addCriterion("belong_sw_id like", value, "belongSwId");
            return (Criteria) this;
        }

        public Criteria andBelongSwIdNotLike(String value) {
            addCriterion("belong_sw_id not like", value, "belongSwId");
            return (Criteria) this;
        }

        public Criteria andBelongSwIdIn(List<String> values) {
            addCriterion("belong_sw_id in", values, "belongSwId");
            return (Criteria) this;
        }

        public Criteria andBelongSwIdNotIn(List<String> values) {
            addCriterion("belong_sw_id not in", values, "belongSwId");
            return (Criteria) this;
        }

        public Criteria andBelongSwIdBetween(String value1, String value2) {
            addCriterion("belong_sw_id between", value1, value2, "belongSwId");
            return (Criteria) this;
        }

        public Criteria andBelongSwIdNotBetween(String value1, String value2) {
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

        public Criteria andQosIdEqualTo(String value) {
            addCriterion("qos_id =", value, "qosId");
            return (Criteria) this;
        }

        public Criteria andQosIdNotEqualTo(String value) {
            addCriterion("qos_id <>", value, "qosId");
            return (Criteria) this;
        }

        public Criteria andQosIdGreaterThan(String value) {
            addCriterion("qos_id >", value, "qosId");
            return (Criteria) this;
        }

        public Criteria andQosIdGreaterThanOrEqualTo(String value) {
            addCriterion("qos_id >=", value, "qosId");
            return (Criteria) this;
        }

        public Criteria andQosIdLessThan(String value) {
            addCriterion("qos_id <", value, "qosId");
            return (Criteria) this;
        }

        public Criteria andQosIdLessThanOrEqualTo(String value) {
            addCriterion("qos_id <=", value, "qosId");
            return (Criteria) this;
        }

        public Criteria andQosIdLike(String value) {
            addCriterion("qos_id like", value, "qosId");
            return (Criteria) this;
        }

        public Criteria andQosIdNotLike(String value) {
            addCriterion("qos_id not like", value, "qosId");
            return (Criteria) this;
        }

        public Criteria andQosIdIn(List<String> values) {
            addCriterion("qos_id in", values, "qosId");
            return (Criteria) this;
        }

        public Criteria andQosIdNotIn(List<String> values) {
            addCriterion("qos_id not in", values, "qosId");
            return (Criteria) this;
        }

        public Criteria andQosIdBetween(String value1, String value2) {
            addCriterion("qos_id between", value1, value2, "qosId");
            return (Criteria) this;
        }

        public Criteria andQosIdNotBetween(String value1, String value2) {
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

        public Criteria andMaxRateIsNull() {
            addCriterion("max_rate is null");
            return (Criteria) this;
        }

        public Criteria andMaxRateIsNotNull() {
            addCriterion("max_rate is not null");
            return (Criteria) this;
        }

        public Criteria andMaxRateEqualTo(String value) {
            addCriterion("max_rate =", value, "maxRate");
            return (Criteria) this;
        }

        public Criteria andMaxRateNotEqualTo(String value) {
            addCriterion("max_rate <>", value, "maxRate");
            return (Criteria) this;
        }

        public Criteria andMaxRateGreaterThan(String value) {
            addCriterion("max_rate >", value, "maxRate");
            return (Criteria) this;
        }

        public Criteria andMaxRateGreaterThanOrEqualTo(String value) {
            addCriterion("max_rate >=", value, "maxRate");
            return (Criteria) this;
        }

        public Criteria andMaxRateLessThan(String value) {
            addCriterion("max_rate <", value, "maxRate");
            return (Criteria) this;
        }

        public Criteria andMaxRateLessThanOrEqualTo(String value) {
            addCriterion("max_rate <=", value, "maxRate");
            return (Criteria) this;
        }

        public Criteria andMaxRateLike(String value) {
            addCriterion("max_rate like", value, "maxRate");
            return (Criteria) this;
        }

        public Criteria andMaxRateNotLike(String value) {
            addCriterion("max_rate not like", value, "maxRate");
            return (Criteria) this;
        }

        public Criteria andMaxRateIn(List<String> values) {
            addCriterion("max_rate in", values, "maxRate");
            return (Criteria) this;
        }

        public Criteria andMaxRateNotIn(List<String> values) {
            addCriterion("max_rate not in", values, "maxRate");
            return (Criteria) this;
        }

        public Criteria andMaxRateBetween(String value1, String value2) {
            addCriterion("max_rate between", value1, value2, "maxRate");
            return (Criteria) this;
        }

        public Criteria andMaxRateNotBetween(String value1, String value2) {
            addCriterion("max_rate not between", value1, value2, "maxRate");
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

        public Criteria andExternalIdKeyIsNull() {
            addCriterion("external_id_key is null");
            return (Criteria) this;
        }

        public Criteria andExternalIdKeyIsNotNull() {
            addCriterion("external_id_key is not null");
            return (Criteria) this;
        }

        public Criteria andExternalIdKeyEqualTo(String value) {
            addCriterion("external_id_key =", value, "externalIdKey");
            return (Criteria) this;
        }

        public Criteria andExternalIdKeyNotEqualTo(String value) {
            addCriterion("external_id_key <>", value, "externalIdKey");
            return (Criteria) this;
        }

        public Criteria andExternalIdKeyGreaterThan(String value) {
            addCriterion("external_id_key >", value, "externalIdKey");
            return (Criteria) this;
        }

        public Criteria andExternalIdKeyGreaterThanOrEqualTo(String value) {
            addCriterion("external_id_key >=", value, "externalIdKey");
            return (Criteria) this;
        }

        public Criteria andExternalIdKeyLessThan(String value) {
            addCriterion("external_id_key <", value, "externalIdKey");
            return (Criteria) this;
        }

        public Criteria andExternalIdKeyLessThanOrEqualTo(String value) {
            addCriterion("external_id_key <=", value, "externalIdKey");
            return (Criteria) this;
        }

        public Criteria andExternalIdKeyLike(String value) {
            addCriterion("external_id_key like", value, "externalIdKey");
            return (Criteria) this;
        }

        public Criteria andExternalIdKeyNotLike(String value) {
            addCriterion("external_id_key not like", value, "externalIdKey");
            return (Criteria) this;
        }

        public Criteria andExternalIdKeyIn(List<String> values) {
            addCriterion("external_id_key in", values, "externalIdKey");
            return (Criteria) this;
        }

        public Criteria andExternalIdKeyNotIn(List<String> values) {
            addCriterion("external_id_key not in", values, "externalIdKey");
            return (Criteria) this;
        }

        public Criteria andExternalIdKeyBetween(String value1, String value2) {
            addCriterion("external_id_key between", value1, value2, "externalIdKey");
            return (Criteria) this;
        }

        public Criteria andExternalIdKeyNotBetween(String value1, String value2) {
            addCriterion("external_id_key not between", value1, value2, "externalIdKey");
            return (Criteria) this;
        }

        public Criteria andExternalIdValueIsNull() {
            addCriterion("external_id_value is null");
            return (Criteria) this;
        }

        public Criteria andExternalIdValueIsNotNull() {
            addCriterion("external_id_value is not null");
            return (Criteria) this;
        }

        public Criteria andExternalIdValueEqualTo(String value) {
            addCriterion("external_id_value =", value, "externalIdValue");
            return (Criteria) this;
        }

        public Criteria andExternalIdValueNotEqualTo(String value) {
            addCriterion("external_id_value <>", value, "externalIdValue");
            return (Criteria) this;
        }

        public Criteria andExternalIdValueGreaterThan(String value) {
            addCriterion("external_id_value >", value, "externalIdValue");
            return (Criteria) this;
        }

        public Criteria andExternalIdValueGreaterThanOrEqualTo(String value) {
            addCriterion("external_id_value >=", value, "externalIdValue");
            return (Criteria) this;
        }

        public Criteria andExternalIdValueLessThan(String value) {
            addCriterion("external_id_value <", value, "externalIdValue");
            return (Criteria) this;
        }

        public Criteria andExternalIdValueLessThanOrEqualTo(String value) {
            addCriterion("external_id_value <=", value, "externalIdValue");
            return (Criteria) this;
        }

        public Criteria andExternalIdValueLike(String value) {
            addCriterion("external_id_value like", value, "externalIdValue");
            return (Criteria) this;
        }

        public Criteria andExternalIdValueNotLike(String value) {
            addCriterion("external_id_value not like", value, "externalIdValue");
            return (Criteria) this;
        }

        public Criteria andExternalIdValueIn(List<String> values) {
            addCriterion("external_id_value in", values, "externalIdValue");
            return (Criteria) this;
        }

        public Criteria andExternalIdValueNotIn(List<String> values) {
            addCriterion("external_id_value not in", values, "externalIdValue");
            return (Criteria) this;
        }

        public Criteria andExternalIdValueBetween(String value1, String value2) {
            addCriterion("external_id_value between", value1, value2, "externalIdValue");
            return (Criteria) this;
        }

        public Criteria andExternalIdValueNotBetween(String value1, String value2) {
            addCriterion("external_id_value not between", value1, value2, "externalIdValue");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table qos
     *
     * @mbg.generated do_not_delete_during_merge Fri Mar 24 14:53:55 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table qos
     *
     * @mbg.generated Fri Mar 24 14:53:55 CST 2017
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
}