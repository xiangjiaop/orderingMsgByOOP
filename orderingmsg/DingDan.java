package cn.bdqn.orderingmsgggg;

public class DingDan {
	//������Ϣ��
	private String names;// ��������Ϣ
	
	private String dishMsg;// ������Ʒ��Ϣ
	
	private int sendTime;// �Ͳ�ʱ��
	
	private String address;// �Ͳ͵�ַ
	
	private int state;// ����״̬
	
	private double payMoney;// �ܽ��
	
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
	//��ӡ��Ϣ
	public void print(){
		
	}
	
}
