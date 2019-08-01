package cn.bdqn.orderingmsgggg;

public class DingDanManager {
	
	//����������
	
	//���в�Ʒ������
	private DingDan[] dingDanArr = new DingDan[3];
	
	/*
	 * ���ʹ���λ
	 */
	public boolean cheakDingDanArr(){
		if(dingDanArr[dingDanArr.length - 1]==null){
			return true;
		}else{
			return false;
		}
	}
	
	/*
	 * ��Ӷ���
	 */
	public void addDingDan(String names,String cpName,int count,double cpPrice,int sendTime,String address){
		String dishMsg = cpName+" "+count+"��";
		double payMoney = (cpPrice*count)>=50?(cpPrice*count):(cpPrice*count)+10;
		DingDan dd = new DingDan(names, dishMsg , sendTime, address, 0, payMoney);
		//���¶�������ʹ���
		for (int i = 0; i < dingDanArr.length; i++) {
			if(null == dingDanArr[i]){
				dingDanArr[i] = dd;
				break;
			}
		}
		// ��ʾ������Ϣ
		// �����͵���Ϣ ������ �Ͳ�ʱ�� �Ͳ͵�ַ ���
		System.out.println("���ͳɹ�!");
		System.out.println("��������" + dishMsg);
		System.out.println("�Ͳ�ʱ��Ϊ:" + sendTime);
		System.out.println(
				"��Ʒ�۸�Ϊ:" + cpPrice*count + "�Ͳͷ�Ϊ:" + (payMoney-cpPrice*count) + ",�ܽ��Ϊ" + payMoney + "Ԫ");

	}
	
	/*
	 * ��ӡ�����б�()
	 */
	public void printDingDanList(){
		if(dingDanArr[0] == null){
			System.out.println("���޶�����Ϣ!");
		}else{
			System.out.println("���\t������Ʒ��Ϣ\t����������\t�Ͳ�ʱ��\t\t�Ͳ͵�ַ\t\t�ܽ��\t����״̬");
			for (int i = 0; i < dingDanArr.length; i++) {
				if(dingDanArr[i] == null){
					break;
				}
				String state = dingDanArr[i].getState() == 0 ? "��Ԥ��" : "�����";
				System.out.println((i + 1) + "\t" + dingDanArr[i].getDishMsg() + "\t" + dingDanArr[i].getNames() + "\t\t" + dingDanArr[i].getSendTime() + "\t\t"
						+ dingDanArr[i].getAddress() + "\t" + dingDanArr[i].getPayMoney() + "\t" + state);
			}
		}
	}
	
	/*
	 * ������ż�鶩���Ƿ��ǩ��,�����ɾ��
	 */
	public int checkDingDanForChange(int id){
		if(id<1||id>dingDanArr.length||dingDanArr[id-1] == null){
			return 1;
		}
		if(dingDanArr[id - 1].getState() == 1){
			return 2;//��ɾ��
		}
		return 0;//��ǩ��
	}
	
	/*
	 * ǩ�ն���ҵ��
	 */
	public void changeDingDanState(int id){
		dingDanArr[id-1].setState(1);
	}
	
	/*
	 * �������ɾ��ָ������
	 */
	public void deleteDingDanById(int id){
		for (int i = id - 1; i < dingDanArr.length -1; i++) {
			dingDanArr[i] = dingDanArr[i+1];
		}
		dingDanArr[dingDanArr.length-1] = null;
		System.out.println("ɾ���ɹ�!");
	}
}
