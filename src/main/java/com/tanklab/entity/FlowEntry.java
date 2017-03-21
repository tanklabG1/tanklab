package main.java.com.tanklab.entity;

import java.util.List;

import org.json.JSONObject;

import com.google.gson.Gson;

/**
 * 
 * @author CaiHe
 * @describe this module is a entity class to denote the flow-entry 
 * @since 2017-2-23
 */
public class FlowEntry {
    private String tpSrc;
    private String protocol;
    private String vlanId;
    private String vlanPriority;
    private String idleTimeout;
    private String priority;
    private String ingressPort;
    private String tosBits;
    /**
     * ���·��������� ������
     * */
    private String name;
    private String flowId ;

    public String getFlowId() {
		return flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}
	private String hardTimeout;

    private String dlDst;
    private String installInHw;
	/**
     * �������Ϣ
     * */
   private String etherType = "2048";

    private String cookie;

    private String dlSrc;

    private String nwSrc;

    private String nwDst;

    private String tpDst;

    private List<String> actions;

    /**
     * �����Ҫ���޸�
     * */
 

    public String getTpSrc() {
		return tpSrc;
	}

	public void setTpSrc(String tpSrc) {
		this.tpSrc = tpSrc;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getVlanId() {
		return vlanId;
	}

	public void setVlanId(String vlanId) {
		this.vlanId = vlanId;
	}

	public String getVlanPriority() {
		return vlanPriority;
	}

	public void setVlanPriority(String vlanPriority) {
		this.vlanPriority = vlanPriority;
	}

	public String getIdleTimeout() {
		return idleTimeout;
	}

	public void setIdleTimeout(String idleTimeout) {
		this.idleTimeout = idleTimeout;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getIngressPort() {
		return ingressPort;
	}

	public void setIngressPort(String ingressPort) {
		this.ingressPort = ingressPort;
	}

	public String getTosBits() {
		return tosBits;
	}

	public void setTosBits(String tosBits) {
		this.tosBits = tosBits;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHardTimeout() {
		return hardTimeout;
	}

	public void setHardTimeout(String hardTimeout) {
		this.hardTimeout = hardTimeout;
	}
	public String getEtherType() {
		return etherType;
	}

	public void setEtherType(String etherType) {
		this.etherType = etherType;
	}
	public String getDlDst() {
		return dlDst;
	}

	public void setDlDst(String dlDst) {
		this.dlDst = dlDst;
	}

	public String getInstallInHw() {
		return installInHw;
	}

	public void setInstallInHw(String installInHw) {
		this.installInHw = installInHw;
	}




	public String getCookie() {
		return cookie;
	}

	public void setCookie(String cookie) {
		this.cookie = cookie;
	}

	public String getDlSrc() {
		return dlSrc;
	}

	public void setDlSrc(String dlSrc) {
		this.dlSrc = dlSrc;
	}

	public String getNwSrc() {
		return nwSrc;
	}

	public void setNwSrc(String nwSrc) {
		this.nwSrc = nwSrc;
	}

	public String getNwDst() {
		return nwDst;
	}

	public void setNwDst(String nwDst) {
		this.nwDst = nwDst;
	}

	public String getTpDst() {
		return tpDst;
	}

	public void setTpDst(String tpDst) {
		this.tpDst = tpDst;
	}
	public List<String> getActions() {
		return actions;
	}

	public void setActions(List<String> actions) {
		this.actions = actions;
	}
	
	@Override
	public String toString(){
		StringBuffer sb = new StringBuffer();
        //add actions 
         sb.append("{\"flow\":[{\"id\":\""+flowId+"\",\"match\":{\"ethernet-match\":{\"ethernet-type\":{\"type\":\"2048\"}},\"ipv4-source-address-no-mask\":\""+nwSrc+"\",\"ipv4-destination-address-no-mask\":\""+nwDst+"\"},\"instructions\":{\"instruction\":[{\"apply-actions\":{\"action\":[");
         
         for(int i= 0; i < this.actions.size() ;++i){
        	 sb.append(this.actions.get(i));
        	 if(i != this.actions.size()  -1 ){
        		sb.append(",");
        	 }
         }
         sb.append("]},\"order\":\"0\"}]},\"installHw\":\"true\",\"barrier\":\"true\",\"strict\":\"true\",\"priority\":\"200\",\"idle-timeout\":\"0\",\"hard-timeout\":\"0\",\"table_id\":\"0\"}]}");
		return sb.toString();
	}
	
	public String toJson(){
		return this.toString();
	}
	public static void main(String [] arg){
		
		FlowEntry fe = new FlowEntry();
		fe.setProtocol("0x06");
		String json = new Gson().toJson(fe);
		System.out.println(json);
		
	}
	
}	