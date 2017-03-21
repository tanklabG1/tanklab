package main.java.com.tanklab.entity;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * 
 * @author CaiHe
 * @describe queue to implement qos
 */
public class Queue {
	private static Logger logger = Logger.getLogger(Queue.class);
	public static final String MAX_RATE = "max-rate";
	public static final String MIN_RATE = "min-rate";
	public static final String QUEUE_PREFIX ="QUEUE-";
	private static int QUEUE_NUMBER = 1;
	public List<String> uuid =  new ArrayList<String>();
	public String queueId = null;
	public String queueNumber = null;
	public long max_rate = -1;
	public long min_rate = -1;

	public Queue(long max_rate,long min_rate){
		this.max_rate = max_rate;
		this.min_rate = min_rate;
		this.queueNumber = Queue.getQueueNumber()+"";
		this.queueId = QUEUE_PREFIX + this.queueNumber;
		logger.info("create a Queue Obj"+this.toString());
	}
	public long getMax_rate() {
		return max_rate;
	}

	public void setMax_rate(long max_rate) {
		this.max_rate = max_rate;
	}

	public long getMin_rate() {
		return min_rate;
	}

	public void setMin_rate(long min_rate) {
		this.min_rate = min_rate;
	}

	
	
	@Override
	public String toString(){
		return this.toJson() + "queueNumber: "+this.queueNumber;
	}

	public Queue(){
		
		this.queueNumber = Queue.getQueueNumber()+"";
		logger.info("create a Queue Obj"+this.toString());
	}
	public String getQueueId() {
		return queueId;
	}

	public void setQueueId(String queueId) {
		this.queueId = queueId;
	}

	public String toJson(){
		
		StringBuffer sb = new StringBuffer();
		sb.append("{\"ovsdb:queues\": [{\"queue-id\":\"");
		sb.append(this.queueId+"\",\"queues-other-config\": [");
		if(max_rate != -1){
			sb.append("{\"queue-other-config-key\":\"max-rate\",\"queue-other-config-value\": \""+max_rate+"\"}");
		}
		if(min_rate != -1){
			sb.append(",{\"queue-other-config-key\":\"min-rate\",\"queue-other-config-value\": \""+min_rate+"\"}");
		}
		
		sb.append( "]}]}");
		return sb.toString();
		
	}
	

	
	public List<String> getUuid() {
		return uuid;
	}
	public void setUuid(List<String> uuid) {
		this.uuid = uuid;
	}
	@Override
	public boolean equals(Object obj){
		
		Queue q = (Queue)obj;
		return obj.toString().equals(this.toString());
	}
	
	/**
	 * get the queue numbe
	 * @return
	 */
	public static int getQueueNumber(){
		return Queue.QUEUE_NUMBER++;
	}
}
