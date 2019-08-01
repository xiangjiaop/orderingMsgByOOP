package cn.bdqn.orderingmsgggg;

public class DingDanManager {
	
	//订单管理类
	
	//所有菜品的数组
	private DingDan[] dingDanArr = new DingDan[3];
	
	/*
	 * 检查餐袋空位
	 */
	public boolean cheakDingDanArr(){
		if(dingDanArr[dingDanArr.length - 1]==null){
			return true;
		}else{
			return false;
		}
	}
	
	/*
	 * 添加订单
	 */
	public void addDingDan(String names,String cpName,int count,double cpPrice,int sendTime,String address){
		String dishMsg = cpName+" "+count+"份";
		double payMoney = (cpPrice*count)>=50?(cpPrice*count):(cpPrice*count)+10;
		DingDan dd = new DingDan(names, dishMsg , sendTime, address, 0, payMoney);
		//将新订单放入餐袋中
		for (int i = 0; i < dingDanArr.length; i++) {
			if(null == dingDanArr[i]){
				dingDanArr[i] = dd;
				break;
			}
		}
		// 显示订单信息
		// 所订餐的信息 订餐人 送餐时间 送餐地址 金额
		System.out.println("订餐成功!");
		System.out.println("您订的是" + dishMsg);
		System.out.println("送餐时间为:" + sendTime);
		System.out.println(
				"餐品价格为:" + cpPrice*count + "送餐费为:" + (payMoney-cpPrice*count) + ",总金额为" + payMoney + "元");

	}
	
	/*
	 * 打印订单列表()
	 */
	public void printDingDanList(){
		if(dingDanArr[0] == null){
			System.out.println("暂无订单信息!");
		}else{
			System.out.println("序号\t所订餐品信息\t订餐人姓名\t送餐时间\t\t送餐地址\t\t总金额\t订单状态");
			for (int i = 0; i < dingDanArr.length; i++) {
				if(dingDanArr[i] == null){
					break;
				}
				String state = dingDanArr[i].getState() == 0 ? "已预定" : "已完成";
				System.out.println((i + 1) + "\t" + dingDanArr[i].getDishMsg() + "\t" + dingDanArr[i].getNames() + "\t\t" + dingDanArr[i].getSendTime() + "\t\t"
						+ dingDanArr[i].getAddress() + "\t" + dingDanArr[i].getPayMoney() + "\t" + state);
			}
		}
	}
	
	/*
	 * 根据序号检查订单是否可签收,或可以删除
	 */
	public int checkDingDanForChange(int id){
		if(id<1||id>dingDanArr.length||dingDanArr[id-1] == null){
			return 1;
		}
		if(dingDanArr[id - 1].getState() == 1){
			return 2;//可删除
		}
		return 0;//可签收
	}
	
	/*
	 * 签收订单业务
	 */
	public void changeDingDanState(int id){
		dingDanArr[id-1].setState(1);
	}
	
	/*
	 * 根据序号删除指定订单
	 */
	public void deleteDingDanById(int id){
		for (int i = id - 1; i < dingDanArr.length -1; i++) {
			dingDanArr[i] = dingDanArr[i+1];
		}
		dingDanArr[dingDanArr.length-1] = null;
		System.out.println("删除成功!");
	}
}
