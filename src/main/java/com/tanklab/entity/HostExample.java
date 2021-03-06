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

        public Criteria andHostIdEqualTo(String value) {
            addCriterion("host_id =", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdNotEqualTo(String value) {
            addCriterion("host_id <>", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdGreaterThan(String value) {
            addCriterion("host_id >", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdGreaterThanOrEqualTo(String value) {
            addCriterion("host_id >=", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdLessThan(String value) {
            addCriterion("host_id <", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdLessThanOrEqualTo(String value) {
            addCriterion("host_id <=", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdLike(String value) {
            addCriterion("host_id like", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdNotLike(String value) {
            addCriterion("host_id not like", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdIn(List<String> values) {
            addCriterion("host_id in", values, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdNotIn(List<String> values) {
            addCriterion("host_id not in", values, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdBetween(String value1, String value2) {
            addCriterion("host_id between", value1, value2, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdNotBetween(String value1, String value2) {
            addCriterion("host_id not between", value1, value2, "hostId");
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

        public Criteria andTopologyIdIsNull() {
            addCriterion("topology_id is null");
            return (Criteria) this;
        }

        public Criteria andTopologyIdIsNotNull() {
            addCriterion("topology_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopologyIdEqualTo(String value) {
            addCriterion("topology_id =", value, "topologyId");
            return (Criteria) this;
        }

        public Criteria andTopologyIdNotEqualTo(String value) {
            addCriterion("topology_id <>", value, "topologyId");
            return (Criteria) this;
        }

        public Criteria andTopologyIdGreaterThan(String value) {
            addCriterion("topology_id >", value, "topologyId");
            return (Criteria) this;
        }

        public Criteria andTopologyIdGreaterThanOrEqualTo(String value) {
            addCriterion("topology_id >=", value, "topologyId");
            return (Criteria) this;
        }

        public Criteria andTopologyIdLessThan(String value) {
            addCriterion("topology_id <", value, "topologyId");
            return (Criteria) this;
        }

        public Criteria andTopologyIdLessThanOrEqualTo(String value) {
            addCriterion("topology_id <=", value, "topologyId");
            return (Criteria) this;
        }

        public Criteria andTopologyIdLike(String value) {
            addCriterion("topology_id like", value, "topologyId");
            return (Criteria) this;
        }

        public Criteria andTopologyIdNotLike(String value) {
            addCriterion("topology_id not like", value, "topologyId");
            return (Criteria) this;
        }

        public Criteria andTopologyIdIn(List<String> values) {
            addCriterion("topology_id in", values, "topologyId");
            return (Criteria) this;
        }

        public Criteria andTopologyIdNotIn(List<String> values) {
            addCriterion("topology_id not in", values, "topologyId");
            return (Criteria) this;
        }

        public Criteria andTopologyIdBetween(String value1, String value2) {
            addCriterion("topology_id between", value1, value2, "topologyId");
            return (Criteria) this;
        }

        public Criteria andTopologyIdNotBetween(String value1, String value2) {
            addCriterion("topology_id not between", value1, value2, "topologyId");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceIdIsNull() {
            addCriterion("host_tracker_service_id is null");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceIdIsNotNull() {
            addCriterion("host_tracker_service_id is not null");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceIdEqualTo(String value) {
            addCriterion("host_tracker_service_id =", value, "hostTrackerServiceId");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceIdNotEqualTo(String value) {
            addCriterion("host_tracker_service_id <>", value, "hostTrackerServiceId");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceIdGreaterThan(String value) {
            addCriterion("host_tracker_service_id >", value, "hostTrackerServiceId");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceIdGreaterThanOrEqualTo(String value) {
            addCriterion("host_tracker_service_id >=", value, "hostTrackerServiceId");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceIdLessThan(String value) {
            addCriterion("host_tracker_service_id <", value, "hostTrackerServiceId");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceIdLessThanOrEqualTo(String value) {
            addCriterion("host_tracker_service_id <=", value, "hostTrackerServiceId");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceIdLike(String value) {
            addCriterion("host_tracker_service_id like", value, "hostTrackerServiceId");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceIdNotLike(String value) {
            addCriterion("host_tracker_service_id not like", value, "hostTrackerServiceId");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceIdIn(List<String> values) {
            addCriterion("host_tracker_service_id in", values, "hostTrackerServiceId");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceIdNotIn(List<String> values) {
            addCriterion("host_tracker_service_id not in", values, "hostTrackerServiceId");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceIdBetween(String value1, String value2) {
            addCriterion("host_tracker_service_id between", value1, value2, "hostTrackerServiceId");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceIdNotBetween(String value1, String value2) {
            addCriterion("host_tracker_service_id not between", value1, value2, "hostTrackerServiceId");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceAddressesIsNull() {
            addCriterion("host_tracker_service_addresses is null");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceAddressesIsNotNull() {
            addCriterion("host_tracker_service_addresses is not null");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceAddressesEqualTo(String value) {
            addCriterion("host_tracker_service_addresses =", value, "hostTrackerServiceAddresses");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceAddressesNotEqualTo(String value) {
            addCriterion("host_tracker_service_addresses <>", value, "hostTrackerServiceAddresses");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceAddressesGreaterThan(String value) {
            addCriterion("host_tracker_service_addresses >", value, "hostTrackerServiceAddresses");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceAddressesGreaterThanOrEqualTo(String value) {
            addCriterion("host_tracker_service_addresses >=", value, "hostTrackerServiceAddresses");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceAddressesLessThan(String value) {
            addCriterion("host_tracker_service_addresses <", value, "hostTrackerServiceAddresses");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceAddressesLessThanOrEqualTo(String value) {
            addCriterion("host_tracker_service_addresses <=", value, "hostTrackerServiceAddresses");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceAddressesLike(String value) {
            addCriterion("host_tracker_service_addresses like", value, "hostTrackerServiceAddresses");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceAddressesNotLike(String value) {
            addCriterion("host_tracker_service_addresses not like", value, "hostTrackerServiceAddresses");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceAddressesIn(List<String> values) {
            addCriterion("host_tracker_service_addresses in", values, "hostTrackerServiceAddresses");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceAddressesNotIn(List<String> values) {
            addCriterion("host_tracker_service_addresses not in", values, "hostTrackerServiceAddresses");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceAddressesBetween(String value1, String value2) {
            addCriterion("host_tracker_service_addresses between", value1, value2, "hostTrackerServiceAddresses");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceAddressesNotBetween(String value1, String value2) {
            addCriterion("host_tracker_service_addresses not between", value1, value2, "hostTrackerServiceAddresses");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceAttachmentPointsIsNull() {
            addCriterion("host_tracker_service_attachment_points is null");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceAttachmentPointsIsNotNull() {
            addCriterion("host_tracker_service_attachment_points is not null");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceAttachmentPointsEqualTo(String value) {
            addCriterion("host_tracker_service_attachment_points =", value, "hostTrackerServiceAttachmentPoints");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceAttachmentPointsNotEqualTo(String value) {
            addCriterion("host_tracker_service_attachment_points <>", value, "hostTrackerServiceAttachmentPoints");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceAttachmentPointsGreaterThan(String value) {
            addCriterion("host_tracker_service_attachment_points >", value, "hostTrackerServiceAttachmentPoints");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceAttachmentPointsGreaterThanOrEqualTo(String value) {
            addCriterion("host_tracker_service_attachment_points >=", value, "hostTrackerServiceAttachmentPoints");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceAttachmentPointsLessThan(String value) {
            addCriterion("host_tracker_service_attachment_points <", value, "hostTrackerServiceAttachmentPoints");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceAttachmentPointsLessThanOrEqualTo(String value) {
            addCriterion("host_tracker_service_attachment_points <=", value, "hostTrackerServiceAttachmentPoints");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceAttachmentPointsLike(String value) {
            addCriterion("host_tracker_service_attachment_points like", value, "hostTrackerServiceAttachmentPoints");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceAttachmentPointsNotLike(String value) {
            addCriterion("host_tracker_service_attachment_points not like", value, "hostTrackerServiceAttachmentPoints");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceAttachmentPointsIn(List<String> values) {
            addCriterion("host_tracker_service_attachment_points in", values, "hostTrackerServiceAttachmentPoints");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceAttachmentPointsNotIn(List<String> values) {
            addCriterion("host_tracker_service_attachment_points not in", values, "hostTrackerServiceAttachmentPoints");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceAttachmentPointsBetween(String value1, String value2) {
            addCriterion("host_tracker_service_attachment_points between", value1, value2, "hostTrackerServiceAttachmentPoints");
            return (Criteria) this;
        }

        public Criteria andHostTrackerServiceAttachmentPointsNotBetween(String value1, String value2) {
            addCriterion("host_tracker_service_attachment_points not between", value1, value2, "hostTrackerServiceAttachmentPoints");
            return (Criteria) this;
        }

        public Criteria andTerminationPointIsNull() {
            addCriterion("termination-point is null");
            return (Criteria) this;
        }

        public Criteria andTerminationPointIsNotNull() {
            addCriterion("termination-point is not null");
            return (Criteria) this;
        }

        public Criteria andTerminationPointEqualTo(String value) {
            addCriterion("termination-point =", value, "terminationPoint");
            return (Criteria) this;
        }

        public Criteria andTerminationPointNotEqualTo(String value) {
            addCriterion("termination-point <>", value, "terminationPoint");
            return (Criteria) this;
        }

        public Criteria andTerminationPointGreaterThan(String value) {
            addCriterion("termination-point >", value, "terminationPoint");
            return (Criteria) this;
        }

        public Criteria andTerminationPointGreaterThanOrEqualTo(String value) {
            addCriterion("termination-point >=", value, "terminationPoint");
            return (Criteria) this;
        }

        public Criteria andTerminationPointLessThan(String value) {
            addCriterion("termination-point <", value, "terminationPoint");
            return (Criteria) this;
        }

        public Criteria andTerminationPointLessThanOrEqualTo(String value) {
            addCriterion("termination-point <=", value, "terminationPoint");
            return (Criteria) this;
        }

        public Criteria andTerminationPointLike(String value) {
            addCriterion("termination-point like", value, "terminationPoint");
            return (Criteria) this;
        }

        public Criteria andTerminationPointNotLike(String value) {
            addCriterion("termination-point not like", value, "terminationPoint");
            return (Criteria) this;
        }

        public Criteria andTerminationPointIn(List<String> values) {
            addCriterion("termination-point in", values, "terminationPoint");
            return (Criteria) this;
        }

        public Criteria andTerminationPointNotIn(List<String> values) {
            addCriterion("termination-point not in", values, "terminationPoint");
            return (Criteria) this;
        }

        public Criteria andTerminationPointBetween(String value1, String value2) {
            addCriterion("termination-point between", value1, value2, "terminationPoint");
            return (Criteria) this;
        }

        public Criteria andTerminationPointNotBetween(String value1, String value2) {
            addCriterion("termination-point not between", value1, value2, "terminationPoint");
            return (Criteria) this;
        }
    }

   
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
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
}