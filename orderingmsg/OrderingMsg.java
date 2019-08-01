package cn.bdqn.orderingmsgggg;

import java.util.Scanner;
import java.util.Arrays;

public class OrderingMsg {
	public static void main(String[] args) {
		// 分析主体
		DingDanManager ddm = new DingDanManager(); 

		// 所有菜品

		boolean flag = true;
		boolean isAdd = false;
		Scanner input = new Scanner(System.in);
		// 整体框架
		do {
			// 打印主体菜单
			System.out.println("欢迎来到吃货联盟订餐系统");
			System.out.println("********************************");
			System.out.println("1.我要订餐");
			System.out.println("2.查看餐袋");
			System.out.println("3.签收订单");
			System.out.println("4.删除订单");
			System.out.println("5.我要点赞");
			System.out.println("6.退出系统");
			// 提示用户输入相应序号进入功能
			System.out.print("请输入要选择的功能:");
			int choose = input.nextInt();
			boolean hasNull = ddm.cheakDingDanArr();
			switch (choose) {
			case 1:
				System.out.println("****我要订餐****");
				if (!hasNull) {
					System.out.println("餐袋已满,无法订餐!");
				} else {

					System.out.print("请输入订餐人姓名:");
					String name = input.next();

					// 显示所有可供选择的菜品名
					CaiPinManager.showCaiPinListForBuy();
					// 提示用户输入要订的菜品序号

					System.out.print("请输入要订的菜品序号:");
					int id = input.nextInt();
					CaiPin cp = CaiPinManager.getCaiPinById(id);
					if (null == cp) {
						System.out.println("输入菜品序号有误");
						break;
					}
					System.out.print("请输入要订购的份数:");
					int number = input.nextInt();
					System.out.print("请输入要送达的时间(10点-20点之间的整点送餐)");
					int dcTime = input.nextInt();
					while (dcTime < 10 || dcTime > 20) {
						System.out.print("您输入的时间有误,请重新输入:");
						dcTime = input.nextInt();
					}
					System.out.print("请输入送餐地址:");
					String address = input.next();
				
					// 将订单信息录入数组
					ddm.addDingDan(name, cp.getCpNames(), number, cp.getCpPrices(), dcTime, address);
					}
				break;
			case 2:
				System.out.println("****查看餐袋****");
				ddm.printDingDanList();
				break;
			case 3:
				System.out.println("****签收订单****");
				System.out.print("请输入一个要签收的订单编号:");
				int id = input.nextInt();
				int checkState = ddm.checkDingDanForChange(id);
				switch(checkState){
				case 0:
					ddm.changeDingDanState(id);
					break;
				case 1:
					System.out.println("订单不存在!");
					break;
				case 2:
					System.out.println("该订单已经签收!");
				}
				break;
			case 4:
				System.out.println("****删除订单****");
				System.out.print("请输入一个要删除的订单编号:");
				int delId = input.nextInt();
				int delState = ddm.checkDingDanForChange(delId);
				switch(delState){
				case 0:
					System.out.println("该订单未签收,不能删除!");
					break;
				case 1:
					System.out.println("订单不存在!");
					break;
				case 2:
					ddm.deleteDingDanById(delId);
				}
				break;
			case 5:
				System.out.println("****我要点赞****");

				// 显示所有可供选择的菜品名
				CaiPinManager.showCaiPinListForZan();
				break;
			default:
				flag = false;
				break;
			}
			if (flag) {
				System.out.print("输入0返回:");
				choose = input.nextInt();
				if (choose != 0) {
					flag = false;
				}
			}

		} while (flag);
		System.out.println("谢谢使用,欢迎下次再来");
	}
}
