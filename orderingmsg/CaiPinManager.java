package cn.bdqn.orderingmsgggg;

import java.util.Scanner;

public class CaiPinManager {
	//��Ʒ������
	
	//���в�Ʒ������
	private static CaiPin[] caiPinArr = new CaiPin[3];
	
	/*
	 * ��ʼ�����в�Ʒ��Ϣ
	 */
	static{
		caiPinArr[0] = new CaiPin("������",28.0,5);
		caiPinArr[1] = new CaiPin("������Ϻ",50.0,2); 
		caiPinArr[2] = new CaiPin("�ع���",30.0,6); 
	}
	/*
	 * չʾ��Ʒ�б���
	 */
	public static void showCaiPinListForBuy(){
		// ��ʾ���пɹ�ѡ��Ĳ�Ʒ��
		System.out.println("���\t����\t\t����");
		for (int i = 0; i <caiPinArr.length; i++) {
			String price = caiPinArr[i].getCpPrices() + "Ԫ";
			System.out.println((i + 1) + "\t" + caiPinArr[i].getCpNames() + "\t\t" + price);
		}
	}
	/*
	 * ���ݲ�Ʒ��Ż�ȡָ����Ʒ����
	 */
	public static CaiPin getCaiPinById(int id){
		if(id>=1 &&id<=caiPinArr.length){
			return caiPinArr[id - 1];
		}else{
			return null;
		}
	}
	
	
	/*
	 * Ϊָ����Ʒ���޹���
	 */
	public static void showCaiPinListForZan(){
		// ��ʾ���пɹ�ѡ��Ĳ�Ʒ��
		System.out.println("���\t����\t\t����\t������");
		for (int i = 0; i <caiPinArr.length; i++) {
			String price = caiPinArr[i].getCpPrices() + "Ԫ";
			String zanNum = (caiPinArr[i].getCpZanNums()) > 0 ? caiPinArr[i].getCpZanNums() + "��" : "0";
			System.out.println((i + 1) + "\t" + caiPinArr[i].getCpNames() + "\t\t" + price + "\t" + zanNum);
		}
		System.out.print("������Ҫ���Ĳ�Ʒ���:");
		Scanner input = new Scanner(System.in);
		int dzNoForIndex = input.nextInt() - 1;
		if(dzNoForIndex < 0||dzNoForIndex >=caiPinArr.length){
			System.out.println("�����������!");
		}else{
			caiPinArr[dzNoForIndex].setCpZanNums(caiPinArr[dzNoForIndex].getCpZanNums()+1);
			System.out.println("���޳ɹ�!");
		}
	}
}
