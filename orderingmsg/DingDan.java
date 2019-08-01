package cn.bdqn.orderingmsgggg;

public class DingDan {
	//订单信息类
	private String names;// 订餐人信息
	
	private String dishMsg;// 所订餐品信息
	
	private int sendTime;// 送餐时间
	
	private String address;// 送餐地址
	
	private int state;// 订单状态
	
	private double payMoney;// 总金额
	
	public DingDan(){}
	
	public DingDan(String names, String dishMsg, int sendTime, String address, int state, double payMoney) {
		super();
		this.names = names;
		this.dishMsg = dishMsg;
		this.sendTime = sendTime;
		this.address = address;
		this.state = state;
		this.payMoney = payMoney;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getDishMsg() {
		return dishMsg;
	}

	public void setDishMsg(String dishMsg) {
		this.dishMsg = dishMsg;
	}

	public int getSendTime() {
		return sendTime;
	}

	public void setSendTime(int sendTime) {
		this.sendTime = sendTime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public double getPayMoney() {
		return payMoney;
	}

	public void setPayMoney(double payMoney) {
		this.payMoney = payMoney;
	}
	//打印信息
	public void print(){
		
	}
	
}
