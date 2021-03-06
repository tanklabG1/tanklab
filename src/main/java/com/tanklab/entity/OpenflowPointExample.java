package main.java.com.tanklab.entity;

import java.util.ArrayList;
import java.util.List;

public class OpenflowPointExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table openflow_point
     *
     * @mbg.generated Thu Mar 23 19:18:25 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table openflow_point
     *
     * @mbg.generated Thu Mar 23 19:18:25 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table openflow_point
     *
     * @mbg.generated Thu Mar 23 19:18:25 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openflow_point
     *
     * @mbg.generated Thu Mar 23 19:18:25 CST 2017
     */
    public OpenflowPointExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openflow_point
     *
     * @mbg.generated Thu Mar 23 19:18:25 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openflow_point
     *
     * @mbg.generated Thu Mar 23 19:18:25 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openflow_point
     *
     * @mbg.generated Thu Mar 23 19:18:25 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openflow_point
     *
     * @mbg.generated Thu Mar 23 19:18:25 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openflow_point
     *
     * @mbg.generated Thu Mar 23 19:18:25 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openflow_point
     *
     * @mbg.generated Thu Mar 23 19:18:25 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openflow_point
     *
     * @mbg.generated Thu Mar 23 19:18:25 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openflow_point
     *
     * @mbg.generated Thu Mar 23 19:18:25 CST 2017
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
     * This method corresponds to the database table openflow_point
     *
     * @mbg.generated Thu Mar 23 19:18:25 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openflow_point
     *
     * @mbg.generated Thu Mar 23 19:18:25 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table openflow_point
     *
     * @mbg.generated Thu Mar 23 19:18:25 CST 2017
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

        public Criteria andTpIdIsNull() {
            addCriterion("tp_id is null");
            return (Criteria) this;
        }

        public Criteria andTpIdIsNotNull() {
            addCriterion("tp_id is not null");
            return (Criteria) this;
        }

        public Criteria andTpIdEqualTo(String value) {
            addCriterion("tp_id =", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdNotEqualTo(String value) {
            addCriterion("tp_id <>", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdGreaterThan(String value) {
            addCriterion("tp_id >", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdGreaterThanOrEqualTo(String value) {
            addCriterion("tp_id >=", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdLessThan(String value) {
            addCriterion("tp_id <", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdLessThanOrEqualTo(String value) {
            addCriterion("tp_id <=", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdLike(String value) {
            addCriterion("tp_id like", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdNotLike(String value) {
            addCriterion("tp_id not like", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdIn(List<String> values) {
            addCriterion("tp_id in", values, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdNotIn(List<String> values) {
            addCriterion("tp_id not in", values, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdBetween(String value1, String value2) {
            addCriterion("tp_id between", value1, value2, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdNotBetween(String value1, String value2) {
            addCriterion("tp_id not between", value1, value2, "tpId");
            return (Criteria) this;
        }

        public Criteria andNodeIdIsNull() {
            addCriterion("node_id is null");
            return (Criteria) this;
        }

        public Criteria andNodeIdIsNotNull() {
            addCriterion("node_id is not null");
            return (Criteria) this;
        }

        public Criteria andNodeIdEqualTo(String value) {
            addCriterion("node_id =", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotEqualTo(String value) {
            addCriterion("node_id <>", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThan(String value) {
            addCriterion("node_id >", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("node_id >=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThan(String value) {
            addCriterion("node_id <", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThanOrEqualTo(String value) {
            addCriterion("node_id <=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLike(String value) {
            addCriterion("node_id like", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotLike(String value) {
            addCriterion("node_id not like", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdIn(List<String> values) {
            addCriterion("node_id in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotIn(List<String> values) {
            addCriterion("node_id not in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdBetween(String value1, String value2) {
            addCriterion("node_id between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotBetween(String value1, String value2) {
            addCriterion("node_id not between", value1, value2, "nodeId");
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

        public Criteria andOpendaylightTopologyInventoryInventoryNodeConnectorRefIsNull() {
            addCriterion("opendaylight_topology_inventory_inventory_node_connector_ref is null");
            return (Criteria) this;
        }

        public Criteria andOpendaylightTopologyInventoryInventoryNodeConnectorRefIsNotNull() {
            addCriterion("opendaylight_topology_inventory_inventory_node_connector_ref is not null");
            return (Criteria) this;
        }

        public Criteria andOpendaylightTopologyInventoryInventoryNodeConnectorRefEqualTo(String value) {
            addCriterion("opendaylight_topology_inventory_inventory_node_connector_ref =", value, "opendaylightTopologyInventoryInventoryNodeConnectorRef");
            return (Criteria) this;
        }

        public Criteria andOpendaylightTopologyInventoryInventoryNodeConnectorRefNotEqualTo(String value) {
            addCriterion("opendaylight_topology_inventory_inventory_node_connector_ref <>", value, "opendaylightTopologyInventoryInventoryNodeConnectorRef");
            return (Criteria) this;
        }

        public Criteria andOpendaylightTopologyInventoryInventoryNodeConnectorRefGreaterThan(String value) {
            addCriterion("opendaylight_topology_inventory_inventory_node_connector_ref >", value, "opendaylightTopologyInventoryInventoryNodeConnectorRef");
            return (Criteria) this;
        }

        public Criteria andOpendaylightTopologyInventoryInventoryNodeConnectorRefGreaterThanOrEqualTo(String value) {
            addCriterion("opendaylight_topology_inventory_inventory_node_connector_ref >=", value, "opendaylightTopologyInventoryInventoryNodeConnectorRef");
            return (Criteria) this;
        }

        public Criteria andOpendaylightTopologyInventoryInventoryNodeConnectorRefLessThan(String value) {
            addCriterion("opendaylight_topology_inventory_inventory_node_connector_ref <", value, "opendaylightTopologyInventoryInventoryNodeConnectorRef");
            return (Criteria) this;
        }

        public Criteria andOpendaylightTopologyInventoryInventoryNodeConnectorRefLessThanOrEqualTo(String value) {
            addCriterion("opendaylight_topology_inventory_inventory_node_connector_ref <=", value, "opendaylightTopologyInventoryInventoryNodeConnectorRef");
            return (Criteria) this;
        }

        public Criteria andOpendaylightTopologyInventoryInventoryNodeConnectorRefLike(String value) {
            addCriterion("opendaylight_topology_inventory_inventory_node_connector_ref like", value, "opendaylightTopologyInventoryInventoryNodeConnectorRef");
            return (Criteria) this;
        }

        public Criteria andOpendaylightTopologyInventoryInventoryNodeConnectorRefNotLike(String value) {
            addCriterion("opendaylight_topology_inventory_inventory_node_connector_ref not like", value, "opendaylightTopologyInventoryInventoryNodeConnectorRef");
            return (Criteria) this;
        }

        public Criteria andOpendaylightTopologyInventoryInventoryNodeConnectorRefIn(List<String> values) {
            addCriterion("opendaylight_topology_inventory_inventory_node_connector_ref in", values, "opendaylightTopologyInventoryInventoryNodeConnectorRef");
            return (Criteria) this;
        }

        public Criteria andOpendaylightTopologyInventoryInventoryNodeConnectorRefNotIn(List<String> values) {
            addCriterion("opendaylight_topology_inventory_inventory_node_connector_ref not in", values, "opendaylightTopologyInventoryInventoryNodeConnectorRef");
            return (Criteria) this;
        }

        public Criteria andOpendaylightTopologyInventoryInventoryNodeConnectorRefBetween(String value1, String value2) {
            addCriterion("opendaylight_topology_inventory_inventory_node_connector_ref between", value1, value2, "opendaylightTopologyInventoryInventoryNodeConnectorRef");
            return (Criteria) this;
        }

        public Criteria andOpendaylightTopologyInventoryInventoryNodeConnectorRefNotBetween(String value1, String value2) {
            addCriterion("opendaylight_topology_inventory_inventory_node_connector_ref not between", value1, value2, "opendaylightTopologyInventoryInventoryNodeConnectorRef");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table openflow_point
     *
     * @mbg.generated do_not_delete_during_merge Thu Mar 23 19:18:25 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table openflow_point
     *
     * @mbg.generated Thu Mar 23 19:18:25 CST 2017
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