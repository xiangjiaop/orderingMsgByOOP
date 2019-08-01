package cn.bdqn.orderingmsgggg;

import java.util.Scanner;
import java.util.Arrays;

public class OrderingMsg {
	public static void main(String[] args) {
		// ��������
		DingDanManager ddm = new DingDanManager(); 

		// ���в�Ʒ

		boolean flag = true;
		boolean isAdd = false;
		Scanner input = new Scanner(System.in);
		// ������
		do {
			// ��ӡ����˵�
			System.out.println("��ӭ�����Ի����˶���ϵͳ");
			System.out.println("********************************");
			System.out.println("1.��Ҫ����");
			System.out.println("2.�鿴�ʹ�");
			System.out.println("3.ǩ�ն���");
			System.out.println("4.ɾ������");
			System.out.println("5.��Ҫ����");
			System.out.println("6.�˳�ϵͳ");
			// ��ʾ�û�������Ӧ��Ž��빦��
			System.out.print("������Ҫѡ��Ĺ���:");
			int choose = input.nextInt();
			boolean hasNull = ddm.cheakDingDanArr();
			switch (choose) {
			case 1:
				System.out.println("****��Ҫ����****");
				if (!hasNull) {
					System.out.println("�ʹ�����,�޷�����!");
				} else {

					System.out.print("�����붩��������:");
					String name = input.next();

					// ��ʾ���пɹ�ѡ��Ĳ�Ʒ��
					CaiPinManager.showCaiPinListForBuy();
					// ��ʾ�û�����Ҫ���Ĳ�Ʒ���

					System.out.print("������Ҫ���Ĳ�Ʒ���:");
					int id = input.nextInt();
					CaiPin cp = CaiPinManager.getCaiPinById(id);
					if (null == cp) {
						System.out.println("�����Ʒ�������");
						break;
					}
					System.out.print("������Ҫ�����ķ���:");
					int number = input.nextInt();
					System.out.print("������Ҫ�ʹ��ʱ��(10��-20��֮��������Ͳ�)");
					int dcTime = input.nextInt();
					while (dcTime < 10 || dcTime > 20) {
						System.out.print("�������ʱ������,����������:");
						dcTime = input.nextInt();
					}
					System.out.print("�������Ͳ͵�ַ:");
					String address = input.next();
				
					// ��������Ϣ¼������
					ddm.addDingDan(name, cp.getCpNames(), number, cp.getCpPrices(), dcTime, address);
					}
				break;
			case 2:
				System.out.println("****�鿴�ʹ�****");
				ddm.printDingDanList();
				break;
			case 3:
				System.out.println("****ǩ�ն���****");
				System.out.print("������һ��Ҫǩ�յĶ������:");
				int id = input.nextInt();
				int checkState = ddm.checkDingDanForChange(id);
				switch(checkState){
				case 0:
					ddm.changeDingDanState(id);
					break;
				case 1:
					System.out.println("����������!");
					break;
				case 2:
					System.out.println("�ö����Ѿ�ǩ��!");
				}
				break;
			case 4:
				System.out.println("****ɾ������****");
				System.out.print("������һ��Ҫɾ���Ķ������:");
				int delId = input.nextInt();
				int delState = ddm.checkDingDanForChange(delId);
				switch(delState){
				case 0:
					System.out.println("�ö���δǩ��,����ɾ��!");
					break;
				case 1:
					System.out.println("����������!");
					break;
				case 2:
					ddm.deleteDingDanById(delId);
				}
				break;
			case 5:
				System.out.println("****��Ҫ����****");

				// ��ʾ���пɹ�ѡ��Ĳ�Ʒ��
				CaiPinManager.showCaiPinListForZan();
				break;
			default:
				flag = false;
				break;
			}
			if (flag) {
				System.out.print("����0����:");
				choose = input.nextInt();
				if (choose != 0) {
					flag = false;
				}
			}

		} while (flag);
		System.out.println("ллʹ��,��ӭ�´�����");
	}
}
