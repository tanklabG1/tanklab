package main.java.com.tanklab.entity;

import java.util.ArrayList;
import java.util.List;

public class FlowentityExample {
    
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;

	
	public FlowentityExample() {
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

		public Criteria andFlowidIsNull() {
			addCriterion("flowId is null");
			return (Criteria) this;
		}

		public Criteria andFlowidIsNotNull() {
			addCriterion("flowId is not null");
			return (Criteria) this;
		}

		public Criteria andFlowidEqualTo(Integer value) {
			addCriterion("flowId =", value, "flowid");
			return (Criteria) this;
		}

		public Criteria andFlowidNotEqualTo(Integer value) {
			addCriterion("flowId <>", value, "flowid");
			return (Criteria) this;
		}

		public Criteria andFlowidGreaterThan(Integer value) {
			addCriterion("flowId >", value, "flowid");
			return (Criteria) this;
		}

		public Criteria andFlowidGreaterThanOrEqualTo(Integer value) {
			addCriterion("flowId >=", value, "flowid");
			return (Criteria) this;
		}

		public Criteria andFlowidLessThan(Integer value) {
			addCriterion("flowId <", value, "flowid");
			return (Criteria) this;
		}

		public Criteria andFlowidLessThanOrEqualTo(Integer value) {
			addCriterion("flowId <=", value, "flowid");
			return (Criteria) this;
		}

		public Criteria andFlowidIn(List<Integer> values) {
			addCriterion("flowId in", values, "flowid");
			return (Criteria) this;
		}

		public Criteria andFlowidNotIn(List<Integer> values) {
			addCriterion("flowId not in", values, "flowid");
			return (Criteria) this;
		}

		public Criteria andFlowidBetween(Integer value1, Integer value2) {
			addCriterion("flowId between", value1, value2, "flowid");
			return (Criteria) this;
		}

		public Criteria andFlowidNotBetween(Integer value1, Integer value2) {
			addCriterion("flowId not between", value1, value2, "flowid");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andPriorityIsNull() {
			addCriterion("priority is null");
			return (Criteria) this;
		}

		public Criteria andPriorityIsNotNull() {
			addCriterion("priority is not null");
			return (Criteria) this;
		}

		public Criteria andPriorityEqualTo(Integer value) {
			addCriterion("priority =", value, "priority");
			return (Criteria) this;
		}

		public Criteria andPriorityNotEqualTo(Integer value) {
			addCriterion("priority <>", value, "priority");
			return (Criteria) this;
		}

		public Criteria andPriorityGreaterThan(Integer value) {
			addCriterion("priority >", value, "priority");
			return (Criteria) this;
		}

		public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
			addCriterion("priority >=", value, "priority");
			return (Criteria) this;
		}

		public Criteria andPriorityLessThan(Integer value) {
			addCriterion("priority <", value, "priority");
			return (Criteria) this;
		}

		public Criteria andPriorityLessThanOrEqualTo(Integer value) {
			addCriterion("priority <=", value, "priority");
			return (Criteria) this;
		}

		public Criteria andPriorityIn(List<Integer> values) {
			addCriterion("priority in", values, "priority");
			return (Criteria) this;
		}

		public Criteria andPriorityNotIn(List<Integer> values) {
			addCriterion("priority not in", values, "priority");
			return (Criteria) this;
		}

		public Criteria andPriorityBetween(Integer value1, Integer value2) {
			addCriterion("priority between", value1, value2, "priority");
			return (Criteria) this;
		}

		public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
			addCriterion("priority not between", value1, value2, "priority");
			return (Criteria) this;
		}

		public Criteria andProtocolIsNull() {
			addCriterion("protocol is null");
			return (Criteria) this;
		}

		public Criteria andProtocolIsNotNull() {
			addCriterion("protocol is not null");
			return (Criteria) this;
		}

		public Criteria andProtocolEqualTo(Integer value) {
			addCriterion("protocol =", value, "protocol");
			return (Criteria) this;
		}

		public Criteria andProtocolNotEqualTo(Integer value) {
			addCriterion("protocol <>", value, "protocol");
			return (Criteria) this;
		}

		public Criteria andProtocolGreaterThan(Integer value) {
			addCriterion("protocol >", value, "protocol");
			return (Criteria) this;
		}

		public Criteria andProtocolGreaterThanOrEqualTo(Integer value) {
			addCriterion("protocol >=", value, "protocol");
			return (Criteria) this;
		}

		public Criteria andProtocolLessThan(Integer value) {
			addCriterion("protocol <", value, "protocol");
			return (Criteria) this;
		}

		public Criteria andProtocolLessThanOrEqualTo(Integer value) {
			addCriterion("protocol <=", value, "protocol");
			return (Criteria) this;
		}

		public Criteria andProtocolIn(List<Integer> values) {
			addCriterion("protocol in", values, "protocol");
			return (Criteria) this;
		}

		public Criteria andProtocolNotIn(List<Integer> values) {
			addCriterion("protocol not in", values, "protocol");
			return (Criteria) this;
		}

		public Criteria andProtocolBetween(Integer value1, Integer value2) {
			addCriterion("protocol between", value1, value2, "protocol");
			return (Criteria) this;
		}

		public Criteria andProtocolNotBetween(Integer value1, Integer value2) {
			addCriterion("protocol not between", value1, value2, "protocol");
			return (Criteria) this;
		}

		public Criteria andEthertypeIsNull() {
			addCriterion("etherType is null");
			return (Criteria) this;
		}

		public Criteria andEthertypeIsNotNull() {
			addCriterion("etherType is not null");
			return (Criteria) this;
		}

		public Criteria andEthertypeEqualTo(Integer value) {
			addCriterion("etherType =", value, "ethertype");
			return (Criteria) this;
		}

		public Criteria andEthertypeNotEqualTo(Integer value) {
			addCriterion("etherType <>", value, "ethertype");
			return (Criteria) this;
		}

		public Criteria andEthertypeGreaterThan(Integer value) {
			addCriterion("etherType >", value, "ethertype");
			return (Criteria) this;
		}

		public Criteria andEthertypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("etherType >=", value, "ethertype");
			return (Criteria) this;
		}

		public Criteria andEthertypeLessThan(Integer value) {
			addCriterion("etherType <", value, "ethertype");
			return (Criteria) this;
		}

		public Criteria andEthertypeLessThanOrEqualTo(Integer value) {
			addCriterion("etherType <=", value, "ethertype");
			return (Criteria) this;
		}

		public Criteria andEthertypeIn(List<Integer> values) {
			addCriterion("etherType in", values, "ethertype");
			return (Criteria) this;
		}

		public Criteria andEthertypeNotIn(List<Integer> values) {
			addCriterion("etherType not in", values, "ethertype");
			return (Criteria) this;
		}

		public Criteria andEthertypeBetween(Integer value1, Integer value2) {
			addCriterion("etherType between", value1, value2, "ethertype");
			return (Criteria) this;
		}

		public Criteria andEthertypeNotBetween(Integer value1, Integer value2) {
			addCriterion("etherType not between", value1, value2, "ethertype");
			return (Criteria) this;
		}

		public Criteria andCookieIsNull() {
			addCriterion("cookie is null");
			return (Criteria) this;
		}

		public Criteria andCookieIsNotNull() {
			addCriterion("cookie is not null");
			return (Criteria) this;
		}

		public Criteria andCookieEqualTo(String value) {
			addCriterion("cookie =", value, "cookie");
			return (Criteria) this;
		}

		public Criteria andCookieNotEqualTo(String value) {
			addCriterion("cookie <>", value, "cookie");
			return (Criteria) this;
		}

		public Criteria andCookieGreaterThan(String value) {
			addCriterion("cookie >", value, "cookie");
			return (Criteria) this;
		}

		public Criteria andCookieGreaterThanOrEqualTo(String value) {
			addCriterion("cookie >=", value, "cookie");
			return (Criteria) this;
		}

		public Criteria andCookieLessThan(String value) {
			addCriterion("cookie <", value, "cookie");
			return (Criteria) this;
		}

		public Criteria andCookieLessThanOrEqualTo(String value) {
			addCriterion("cookie <=", value, "cookie");
			return (Criteria) this;
		}

		public Criteria andCookieLike(String value) {
			addCriterion("cookie like", value, "cookie");
			return (Criteria) this;
		}

		public Criteria andCookieNotLike(String value) {
			addCriterion("cookie not like", value, "cookie");
			return (Criteria) this;
		}

		public Criteria andCookieIn(List<String> values) {
			addCriterion("cookie in", values, "cookie");
			return (Criteria) this;
		}

		public Criteria andCookieNotIn(List<String> values) {
			addCriterion("cookie not in", values, "cookie");
			return (Criteria) this;
		}

		public Criteria andCookieBetween(String value1, String value2) {
			addCriterion("cookie between", value1, value2, "cookie");
			return (Criteria) this;
		}

		public Criteria andCookieNotBetween(String value1, String value2) {
			addCriterion("cookie not between", value1, value2, "cookie");
			return (Criteria) this;
		}

		public Criteria andDlsrcIsNull() {
			addCriterion("dlSrc is null");
			return (Criteria) this;
		}

		public Criteria andDlsrcIsNotNull() {
			addCriterion("dlSrc is not null");
			return (Criteria) this;
		}

		public Criteria andDlsrcEqualTo(String value) {
			addCriterion("dlSrc =", value, "dlsrc");
			return (Criteria) this;
		}

		public Criteria andDlsrcNotEqualTo(String value) {
			addCriterion("dlSrc <>", value, "dlsrc");
			return (Criteria) this;
		}

		public Criteria andDlsrcGreaterThan(String value) {
			addCriterion("dlSrc >", value, "dlsrc");
			return (Criteria) this;
		}

		public Criteria andDlsrcGreaterThanOrEqualTo(String value) {
			addCriterion("dlSrc >=", value, "dlsrc");
			return (Criteria) this;
		}

		public Criteria andDlsrcLessThan(String value) {
			addCriterion("dlSrc <", value, "dlsrc");
			return (Criteria) this;
		}

		public Criteria andDlsrcLessThanOrEqualTo(String value) {
			addCriterion("dlSrc <=", value, "dlsrc");
			return (Criteria) this;
		}

		public Criteria andDlsrcLike(String value) {
			addCriterion("dlSrc like", value, "dlsrc");
			return (Criteria) this;
		}

		public Criteria andDlsrcNotLike(String value) {
			addCriterion("dlSrc not like", value, "dlsrc");
			return (Criteria) this;
		}

		public Criteria andDlsrcIn(List<String> values) {
			addCriterion("dlSrc in", values, "dlsrc");
			return (Criteria) this;
		}

		public Criteria andDlsrcNotIn(List<String> values) {
			addCriterion("dlSrc not in", values, "dlsrc");
			return (Criteria) this;
		}

		public Criteria andDlsrcBetween(String value1, String value2) {
			addCriterion("dlSrc between", value1, value2, "dlsrc");
			return (Criteria) this;
		}

		public Criteria andDlsrcNotBetween(String value1, String value2) {
			addCriterion("dlSrc not between", value1, value2, "dlsrc");
			return (Criteria) this;
		}

		public Criteria andDldstIsNull() {
			addCriterion("dlDst is null");
			return (Criteria) this;
		}

		public Criteria andDldstIsNotNull() {
			addCriterion("dlDst is not null");
			return (Criteria) this;
		}

		public Criteria andDldstEqualTo(String value) {
			addCriterion("dlDst =", value, "dldst");
			return (Criteria) this;
		}

		public Criteria andDldstNotEqualTo(String value) {
			addCriterion("dlDst <>", value, "dldst");
			return (Criteria) this;
		}

		public Criteria andDldstGreaterThan(String value) {
			addCriterion("dlDst >", value, "dldst");
			return (Criteria) this;
		}

		public Criteria andDldstGreaterThanOrEqualTo(String value) {
			addCriterion("dlDst >=", value, "dldst");
			return (Criteria) this;
		}

		public Criteria andDldstLessThan(String value) {
			addCriterion("dlDst <", value, "dldst");
			return (Criteria) this;
		}

		public Criteria andDldstLessThanOrEqualTo(String value) {
			addCriterion("dlDst <=", value, "dldst");
			return (Criteria) this;
		}

		public Criteria andDldstLike(String value) {
			addCriterion("dlDst like", value, "dldst");
			return (Criteria) this;
		}

		public Criteria andDldstNotLike(String value) {
			addCriterion("dlDst not like", value, "dldst");
			return (Criteria) this;
		}

		public Criteria andDldstIn(List<String> values) {
			addCriterion("dlDst in", values, "dldst");
			return (Criteria) this;
		}

		public Criteria andDldstNotIn(List<String> values) {
			addCriterion("dlDst not in", values, "dldst");
			return (Criteria) this;
		}

		public Criteria andDldstBetween(String value1, String value2) {
			addCriterion("dlDst between", value1, value2, "dldst");
			return (Criteria) this;
		}

		public Criteria andDldstNotBetween(String value1, String value2) {
			addCriterion("dlDst not between", value1, value2, "dldst");
			return (Criteria) this;
		}

		public Criteria andVlanidIsNull() {
			addCriterion("vlanId is null");
			return (Criteria) this;
		}

		public Criteria andVlanidIsNotNull() {
			addCriterion("vlanId is not null");
			return (Criteria) this;
		}

		public Criteria andVlanidEqualTo(Integer value) {
			addCriterion("vlanId =", value, "vlanid");
			return (Criteria) this;
		}

		public Criteria andVlanidNotEqualTo(Integer value) {
			addCriterion("vlanId <>", value, "vlanid");
			return (Criteria) this;
		}

		public Criteria andVlanidGreaterThan(Integer value) {
			addCriterion("vlanId >", value, "vlanid");
			return (Criteria) this;
		}

		public Criteria andVlanidGreaterThanOrEqualTo(Integer value) {
			addCriterion("vlanId >=", value, "vlanid");
			return (Criteria) this;
		}

		public Criteria andVlanidLessThan(Integer value) {
			addCriterion("vlanId <", value, "vlanid");
			return (Criteria) this;
		}

		public Criteria andVlanidLessThanOrEqualTo(Integer value) {
			addCriterion("vlanId <=", value, "vlanid");
			return (Criteria) this;
		}

		public Criteria andVlanidIn(List<Integer> values) {
			addCriterion("vlanId in", values, "vlanid");
			return (Criteria) this;
		}

		public Criteria andVlanidNotIn(List<Integer> values) {
			addCriterion("vlanId not in", values, "vlanid");
			return (Criteria) this;
		}

		public Criteria andVlanidBetween(Integer value1, Integer value2) {
			addCriterion("vlanId between", value1, value2, "vlanid");
			return (Criteria) this;
		}

		public Criteria andVlanidNotBetween(Integer value1, Integer value2) {
			addCriterion("vlanId not between", value1, value2, "vlanid");
			return (Criteria) this;
		}

		public Criteria andVlanpriorityIsNull() {
			addCriterion("vlanPriority is null");
			return (Criteria) this;
		}

		public Criteria andVlanpriorityIsNotNull() {
			addCriterion("vlanPriority is not null");
			return (Criteria) this;
		}

		public Criteria andVlanpriorityEqualTo(Integer value) {
			addCriterion("vlanPriority =", value, "vlanpriority");
			return (Criteria) this;
		}

		public Criteria andVlanpriorityNotEqualTo(Integer value) {
			addCriterion("vlanPriority <>", value, "vlanpriority");
			return (Criteria) this;
		}

		public Criteria andVlanpriorityGreaterThan(Integer value) {
			addCriterion("vlanPriority >", value, "vlanpriority");
			return (Criteria) this;
		}

		public Criteria andVlanpriorityGreaterThanOrEqualTo(Integer value) {
			addCriterion("vlanPriority >=", value, "vlanpriority");
			return (Criteria) this;
		}

		public Criteria andVlanpriorityLessThan(Integer value) {
			addCriterion("vlanPriority <", value, "vlanpriority");
			return (Criteria) this;
		}

		public Criteria andVlanpriorityLessThanOrEqualTo(Integer value) {
			addCriterion("vlanPriority <=", value, "vlanpriority");
			return (Criteria) this;
		}

		public Criteria andVlanpriorityIn(List<Integer> values) {
			addCriterion("vlanPriority in", values, "vlanpriority");
			return (Criteria) this;
		}

		public Criteria andVlanpriorityNotIn(List<Integer> values) {
			addCriterion("vlanPriority not in", values, "vlanpriority");
			return (Criteria) this;
		}

		public Criteria andVlanpriorityBetween(Integer value1, Integer value2) {
			addCriterion("vlanPriority between", value1, value2, "vlanpriority");
			return (Criteria) this;
		}

		public Criteria andVlanpriorityNotBetween(Integer value1, Integer value2) {
			addCriterion("vlanPriority not between", value1, value2, "vlanpriority");
			return (Criteria) this;
		}

		public Criteria andTpsrcIsNull() {
			addCriterion("tpSrc is null");
			return (Criteria) this;
		}

		public Criteria andTpsrcIsNotNull() {
			addCriterion("tpSrc is not null");
			return (Criteria) this;
		}

		public Criteria andTpsrcEqualTo(Integer value) {
			addCriterion("tpSrc =", value, "tpsrc");
			return (Criteria) this;
		}

		public Criteria andTpsrcNotEqualTo(Integer value) {
			addCriterion("tpSrc <>", value, "tpsrc");
			return (Criteria) this;
		}

		public Criteria andTpsrcGreaterThan(Integer value) {
			addCriterion("tpSrc >", value, "tpsrc");
			return (Criteria) this;
		}

		public Criteria andTpsrcGreaterThanOrEqualTo(Integer value) {
			addCriterion("tpSrc >=", value, "tpsrc");
			return (Criteria) this;
		}

		public Criteria andTpsrcLessThan(Integer value) {
			addCriterion("tpSrc <", value, "tpsrc");
			return (Criteria) this;
		}

		public Criteria andTpsrcLessThanOrEqualTo(Integer value) {
			addCriterion("tpSrc <=", value, "tpsrc");
			return (Criteria) this;
		}

		public Criteria andTpsrcIn(List<Integer> values) {
			addCriterion("tpSrc in", values, "tpsrc");
			return (Criteria) this;
		}

		public Criteria andTpsrcNotIn(List<Integer> values) {
			addCriterion("tpSrc not in", values, "tpsrc");
			return (Criteria) this;
		}

		public Criteria andTpsrcBetween(Integer value1, Integer value2) {
			addCriterion("tpSrc between", value1, value2, "tpsrc");
			return (Criteria) this;
		}

		public Criteria andTpsrcNotBetween(Integer value1, Integer value2) {
			addCriterion("tpSrc not between", value1, value2, "tpsrc");
			return (Criteria) this;
		}

		public Criteria andTpdstIsNull() {
			addCriterion("tpDst is null");
			return (Criteria) this;
		}

		public Criteria andTpdstIsNotNull() {
			addCriterion("tpDst is not null");
			return (Criteria) this;
		}

		public Criteria andTpdstEqualTo(Integer value) {
			addCriterion("tpDst =", value, "tpdst");
			return (Criteria) this;
		}

		public Criteria andTpdstNotEqualTo(Integer value) {
			addCriterion("tpDst <>", value, "tpdst");
			return (Criteria) this;
		}

		public Criteria andTpdstGreaterThan(Integer value) {
			addCriterion("tpDst >", value, "tpdst");
			return (Criteria) this;
		}

		public Criteria andTpdstGreaterThanOrEqualTo(Integer value) {
			addCriterion("tpDst >=", value, "tpdst");
			return (Criteria) this;
		}

		public Criteria andTpdstLessThan(Integer value) {
			addCriterion("tpDst <", value, "tpdst");
			return (Criteria) this;
		}

		public Criteria andTpdstLessThanOrEqualTo(Integer value) {
			addCriterion("tpDst <=", value, "tpdst");
			return (Criteria) this;
		}

		public Criteria andTpdstIn(List<Integer> values) {
			addCriterion("tpDst in", values, "tpdst");
			return (Criteria) this;
		}

		public Criteria andTpdstNotIn(List<Integer> values) {
			addCriterion("tpDst not in", values, "tpdst");
			return (Criteria) this;
		}

		public Criteria andTpdstBetween(Integer value1, Integer value2) {
			addCriterion("tpDst between", value1, value2, "tpdst");
			return (Criteria) this;
		}

		public Criteria andTpdstNotBetween(Integer value1, Integer value2) {
			addCriterion("tpDst not between", value1, value2, "tpdst");
			return (Criteria) this;
		}

		public Criteria andNwsrcIsNull() {
			addCriterion("nwSrc is null");
			return (Criteria) this;
		}

		public Criteria andNwsrcIsNotNull() {
			addCriterion("nwSrc is not null");
			return (Criteria) this;
		}

		public Criteria andNwsrcEqualTo(String value) {
			addCriterion("nwSrc =", value, "nwsrc");
			return (Criteria) this;
		}

		public Criteria andNwsrcNotEqualTo(String value) {
			addCriterion("nwSrc <>", value, "nwsrc");
			return (Criteria) this;
		}

		public Criteria andNwsrcGreaterThan(String value) {
			addCriterion("nwSrc >", value, "nwsrc");
			return (Criteria) this;
		}

		public Criteria andNwsrcGreaterThanOrEqualTo(String value) {
			addCriterion("nwSrc >=", value, "nwsrc");
			return (Criteria) this;
		}

		public Criteria andNwsrcLessThan(String value) {
			addCriterion("nwSrc <", value, "nwsrc");
			return (Criteria) this;
		}

		public Criteria andNwsrcLessThanOrEqualTo(String value) {
			addCriterion("nwSrc <=", value, "nwsrc");
			return (Criteria) this;
		}

		public Criteria andNwsrcLike(String value) {
			addCriterion("nwSrc like", value, "nwsrc");
			return (Criteria) this;
		}

		public Criteria andNwsrcNotLike(String value) {
			addCriterion("nwSrc not like", value, "nwsrc");
			return (Criteria) this;
		}

		public Criteria andNwsrcIn(List<String> values) {
			addCriterion("nwSrc in", values, "nwsrc");
			return (Criteria) this;
		}

		public Criteria andNwsrcNotIn(List<String> values) {
			addCriterion("nwSrc not in", values, "nwsrc");
			return (Criteria) this;
		}

		public Criteria andNwsrcBetween(String value1, String value2) {
			addCriterion("nwSrc between", value1, value2, "nwsrc");
			return (Criteria) this;
		}

		public Criteria andNwsrcNotBetween(String value1, String value2) {
			addCriterion("nwSrc not between", value1, value2, "nwsrc");
			return (Criteria) this;
		}

		public Criteria andNwdstIsNull() {
			addCriterion("nwDst is null");
			return (Criteria) this;
		}

		public Criteria andNwdstIsNotNull() {
			addCriterion("nwDst is not null");
			return (Criteria) this;
		}

		public Criteria andNwdstEqualTo(String value) {
			addCriterion("nwDst =", value, "nwdst");
			return (Criteria) this;
		}

		public Criteria andNwdstNotEqualTo(String value) {
			addCriterion("nwDst <>", value, "nwdst");
			return (Criteria) this;
		}

		public Criteria andNwdstGreaterThan(String value) {
			addCriterion("nwDst >", value, "nwdst");
			return (Criteria) this;
		}

		public Criteria andNwdstGreaterThanOrEqualTo(String value) {
			addCriterion("nwDst >=", value, "nwdst");
			return (Criteria) this;
		}

		public Criteria andNwdstLessThan(String value) {
			addCriterion("nwDst <", value, "nwdst");
			return (Criteria) this;
		}

		public Criteria andNwdstLessThanOrEqualTo(String value) {
			addCriterion("nwDst <=", value, "nwdst");
			return (Criteria) this;
		}

		public Criteria andNwdstLike(String value) {
			addCriterion("nwDst like", value, "nwdst");
			return (Criteria) this;
		}

		public Criteria andNwdstNotLike(String value) {
			addCriterion("nwDst not like", value, "nwdst");
			return (Criteria) this;
		}

		public Criteria andNwdstIn(List<String> values) {
			addCriterion("nwDst in", values, "nwdst");
			return (Criteria) this;
		}

		public Criteria andNwdstNotIn(List<String> values) {
			addCriterion("nwDst not in", values, "nwdst");
			return (Criteria) this;
		}

		public Criteria andNwdstBetween(String value1, String value2) {
			addCriterion("nwDst between", value1, value2, "nwdst");
			return (Criteria) this;
		}

		public Criteria andNwdstNotBetween(String value1, String value2) {
			addCriterion("nwDst not between", value1, value2, "nwdst");
			return (Criteria) this;
		}

		public Criteria andTosbitsIsNull() {
			addCriterion("tosBits is null");
			return (Criteria) this;
		}

		public Criteria andTosbitsIsNotNull() {
			addCriterion("tosBits is not null");
			return (Criteria) this;
		}

		public Criteria andTosbitsEqualTo(Integer value) {
			addCriterion("tosBits =", value, "tosbits");
			return (Criteria) this;
		}

		public Criteria andTosbitsNotEqualTo(Integer value) {
			addCriterion("tosBits <>", value, "tosbits");
			return (Criteria) this;
		}

		public Criteria andTosbitsGreaterThan(Integer value) {
			addCriterion("tosBits >", value, "tosbits");
			return (Criteria) this;
		}

		public Criteria andTosbitsGreaterThanOrEqualTo(Integer value) {
			addCriterion("tosBits >=", value, "tosbits");
			return (Criteria) this;
		}

		public Criteria andTosbitsLessThan(Integer value) {
			addCriterion("tosBits <", value, "tosbits");
			return (Criteria) this;
		}

		public Criteria andTosbitsLessThanOrEqualTo(Integer value) {
			addCriterion("tosBits <=", value, "tosbits");
			return (Criteria) this;
		}

		public Criteria andTosbitsIn(List<Integer> values) {
			addCriterion("tosBits in", values, "tosbits");
			return (Criteria) this;
		}

		public Criteria andTosbitsNotIn(List<Integer> values) {
			addCriterion("tosBits not in", values, "tosbits");
			return (Criteria) this;
		}

		public Criteria andTosbitsBetween(Integer value1, Integer value2) {
			addCriterion("tosBits between", value1, value2, "tosbits");
			return (Criteria) this;
		}

		public Criteria andTosbitsNotBetween(Integer value1, Integer value2) {
			addCriterion("tosBits not between", value1, value2, "tosbits");
			return (Criteria) this;
		}

		public Criteria andInstallinhwIsNull() {
			addCriterion("installInHw is null");
			return (Criteria) this;
		}

		public Criteria andInstallinhwIsNotNull() {
			addCriterion("installInHw is not null");
			return (Criteria) this;
		}

		public Criteria andInstallinhwEqualTo(Integer value) {
			addCriterion("installInHw =", value, "installinhw");
			return (Criteria) this;
		}

		public Criteria andInstallinhwNotEqualTo(Integer value) {
			addCriterion("installInHw <>", value, "installinhw");
			return (Criteria) this;
		}

		public Criteria andInstallinhwGreaterThan(Integer value) {
			addCriterion("installInHw >", value, "installinhw");
			return (Criteria) this;
		}

		public Criteria andInstallinhwGreaterThanOrEqualTo(Integer value) {
			addCriterion("installInHw >=", value, "installinhw");
			return (Criteria) this;
		}

		public Criteria andInstallinhwLessThan(Integer value) {
			addCriterion("installInHw <", value, "installinhw");
			return (Criteria) this;
		}

		public Criteria andInstallinhwLessThanOrEqualTo(Integer value) {
			addCriterion("installInHw <=", value, "installinhw");
			return (Criteria) this;
		}

		public Criteria andInstallinhwIn(List<Integer> values) {
			addCriterion("installInHw in", values, "installinhw");
			return (Criteria) this;
		}

		public Criteria andInstallinhwNotIn(List<Integer> values) {
			addCriterion("installInHw not in", values, "installinhw");
			return (Criteria) this;
		}

		public Criteria andInstallinhwBetween(Integer value1, Integer value2) {
			addCriterion("installInHw between", value1, value2, "installinhw");
			return (Criteria) this;
		}

		public Criteria andInstallinhwNotBetween(Integer value1, Integer value2) {
			addCriterion("installInHw not between", value1, value2, "installinhw");
			return (Criteria) this;
		}

		public Criteria andIngressportIsNull() {
			addCriterion("ingressPort is null");
			return (Criteria) this;
		}

		public Criteria andIngressportIsNotNull() {
			addCriterion("ingressPort is not null");
			return (Criteria) this;
		}

		public Criteria andIngressportEqualTo(Integer value) {
			addCriterion("ingressPort =", value, "ingressport");
			return (Criteria) this;
		}

		public Criteria andIngressportNotEqualTo(Integer value) {
			addCriterion("ingressPort <>", value, "ingressport");
			return (Criteria) this;
		}

		public Criteria andIngressportGreaterThan(Integer value) {
			addCriterion("ingressPort >", value, "ingressport");
			return (Criteria) this;
		}

		public Criteria andIngressportGreaterThanOrEqualTo(Integer value) {
			addCriterion("ingressPort >=", value, "ingressport");
			return (Criteria) this;
		}

		public Criteria andIngressportLessThan(Integer value) {
			addCriterion("ingressPort <", value, "ingressport");
			return (Criteria) this;
		}

		public Criteria andIngressportLessThanOrEqualTo(Integer value) {
			addCriterion("ingressPort <=", value, "ingressport");
			return (Criteria) this;
		}

		public Criteria andIngressportIn(List<Integer> values) {
			addCriterion("ingressPort in", values, "ingressport");
			return (Criteria) this;
		}

		public Criteria andIngressportNotIn(List<Integer> values) {
			addCriterion("ingressPort not in", values, "ingressport");
			return (Criteria) this;
		}

		public Criteria andIngressportBetween(Integer value1, Integer value2) {
			addCriterion("ingressPort between", value1, value2, "ingressport");
			return (Criteria) this;
		}

		public Criteria andIngressportNotBetween(Integer value1, Integer value2) {
			addCriterion("ingressPort not between", value1, value2, "ingressport");
			return (Criteria) this;
		}

		public Criteria andIdletimeoutIsNull() {
			addCriterion("idleTimeout is null");
			return (Criteria) this;
		}

		public Criteria andIdletimeoutIsNotNull() {
			addCriterion("idleTimeout is not null");
			return (Criteria) this;
		}

		public Criteria andIdletimeoutEqualTo(String value) {
			addCriterion("idleTimeout =", value, "idletimeout");
			return (Criteria) this;
		}

		public Criteria andIdletimeoutNotEqualTo(String value) {
			addCriterion("idleTimeout <>", value, "idletimeout");
			return (Criteria) this;
		}

		public Criteria andIdletimeoutGreaterThan(String value) {
			addCriterion("idleTimeout >", value, "idletimeout");
			return (Criteria) this;
		}

		public Criteria andIdletimeoutGreaterThanOrEqualTo(String value) {
			addCriterion("idleTimeout >=", value, "idletimeout");
			return (Criteria) this;
		}

		public Criteria andIdletimeoutLessThan(String value) {
			addCriterion("idleTimeout <", value, "idletimeout");
			return (Criteria) this;
		}

		public Criteria andIdletimeoutLessThanOrEqualTo(String value) {
			addCriterion("idleTimeout <=", value, "idletimeout");
			return (Criteria) this;
		}

		public Criteria andIdletimeoutLike(String value) {
			addCriterion("idleTimeout like", value, "idletimeout");
			return (Criteria) this;
		}

		public Criteria andIdletimeoutNotLike(String value) {
			addCriterion("idleTimeout not like", value, "idletimeout");
			return (Criteria) this;
		}

		public Criteria andIdletimeoutIn(List<String> values) {
			addCriterion("idleTimeout in", values, "idletimeout");
			return (Criteria) this;
		}

		public Criteria andIdletimeoutNotIn(List<String> values) {
			addCriterion("idleTimeout not in", values, "idletimeout");
			return (Criteria) this;
		}

		public Criteria andIdletimeoutBetween(String value1, String value2) {
			addCriterion("idleTimeout between", value1, value2, "idletimeout");
			return (Criteria) this;
		}

		public Criteria andIdletimeoutNotBetween(String value1, String value2) {
			addCriterion("idleTimeout not between", value1, value2, "idletimeout");
			return (Criteria) this;
		}

		public Criteria andHardtimeoutIsNull() {
			addCriterion("hardTimeout is null");
			return (Criteria) this;
		}

		public Criteria andHardtimeoutIsNotNull() {
			addCriterion("hardTimeout is not null");
			return (Criteria) this;
		}

		public Criteria andHardtimeoutEqualTo(String value) {
			addCriterion("hardTimeout =", value, "hardtimeout");
			return (Criteria) this;
		}

		public Criteria andHardtimeoutNotEqualTo(String value) {
			addCriterion("hardTimeout <>", value, "hardtimeout");
			return (Criteria) this;
		}

		public Criteria andHardtimeoutGreaterThan(String value) {
			addCriterion("hardTimeout >", value, "hardtimeout");
			return (Criteria) this;
		}

		public Criteria andHardtimeoutGreaterThanOrEqualTo(String value) {
			addCriterion("hardTimeout >=", value, "hardtimeout");
			return (Criteria) this;
		}

		public Criteria andHardtimeoutLessThan(String value) {
			addCriterion("hardTimeout <", value, "hardtimeout");
			return (Criteria) this;
		}

		public Criteria andHardtimeoutLessThanOrEqualTo(String value) {
			addCriterion("hardTimeout <=", value, "hardtimeout");
			return (Criteria) this;
		}

		public Criteria andHardtimeoutLike(String value) {
			addCriterion("hardTimeout like", value, "hardtimeout");
			return (Criteria) this;
		}

		public Criteria andHardtimeoutNotLike(String value) {
			addCriterion("hardTimeout not like", value, "hardtimeout");
			return (Criteria) this;
		}

		public Criteria andHardtimeoutIn(List<String> values) {
			addCriterion("hardTimeout in", values, "hardtimeout");
			return (Criteria) this;
		}

		public Criteria andHardtimeoutNotIn(List<String> values) {
			addCriterion("hardTimeout not in", values, "hardtimeout");
			return (Criteria) this;
		}

		public Criteria andHardtimeoutBetween(String value1, String value2) {
			addCriterion("hardTimeout between", value1, value2, "hardtimeout");
			return (Criteria) this;
		}

		public Criteria andHardtimeoutNotBetween(String value1, String value2) {
			addCriterion("hardTimeout not between", value1, value2, "hardtimeout");
			return (Criteria) this;
		}

		public Criteria andActionsIsNull() {
			addCriterion("actions is null");
			return (Criteria) this;
		}

		public Criteria andActionsIsNotNull() {
			addCriterion("actions is not null");
			return (Criteria) this;
		}

		public Criteria andActionsEqualTo(String value) {
			addCriterion("actions =", value, "actions");
			return (Criteria) this;
		}

		public Criteria andActionsNotEqualTo(String value) {
			addCriterion("actions <>", value, "actions");
			return (Criteria) this;
		}

		public Criteria andActionsGreaterThan(String value) {
			addCriterion("actions >", value, "actions");
			return (Criteria) this;
		}

		public Criteria andActionsGreaterThanOrEqualTo(String value) {
			addCriterion("actions >=", value, "actions");
			return (Criteria) this;
		}

		public Criteria andActionsLessThan(String value) {
			addCriterion("actions <", value, "actions");
			return (Criteria) this;
		}

		public Criteria andActionsLessThanOrEqualTo(String value) {
			addCriterion("actions <=", value, "actions");
			return (Criteria) this;
		}

		public Criteria andActionsLike(String value) {
			addCriterion("actions like", value, "actions");
			return (Criteria) this;
		}

		public Criteria andActionsNotLike(String value) {
			addCriterion("actions not like", value, "actions");
			return (Criteria) this;
		}

		public Criteria andActionsIn(List<String> values) {
			addCriterion("actions in", values, "actions");
			return (Criteria) this;
		}

		public Criteria andActionsNotIn(List<String> values) {
			addCriterion("actions not in", values, "actions");
			return (Criteria) this;
		}

		public Criteria andActionsBetween(String value1, String value2) {
			addCriterion("actions between", value1, value2, "actions");
			return (Criteria) this;
		}

		public Criteria andActionsNotBetween(String value1, String value2) {
			addCriterion("actions not between", value1, value2, "actions");
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