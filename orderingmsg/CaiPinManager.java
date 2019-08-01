package cn.bdqn.orderingmsgggg;

import java.util.Scanner;

public class CaiPinManager {
	//菜品管理类
	
	//所有菜品的数组
	private static CaiPin[] caiPinArr = new CaiPin[3];
	
	/*
	 * 初始化所有菜品信息
	 */
	static{
		caiPinArr[0] = new CaiPin("红烧肉",28.0,5);
		caiPinArr[1] = new CaiPin("麻辣龙虾",50.0,2); 
		caiPinArr[2] = new CaiPin("回锅肉",30.0,6); 
	}
	/*
	 * 展示菜品列表功能
	 */
	public static void showCaiPinListForBuy(){
		// 显示所有可供选择的菜品名
		System.out.println("序号\t菜名\t\t单价");
		for (int i = 0; i <caiPinArr.length; i++) {
			String price = caiPinArr[i].getCpPrices() + "元";
			System.out.println((i + 1) + "\t" + caiPinArr[i].getCpNames() + "\t\t" + price);
		}
	}
	/*
	 * 根据菜品序号获取指定菜品对象
	 */
	public static CaiPin getCaiPinById(int id){
		if(id>=1 &&id<=caiPinArr.length){
			return caiPinArr[id - 1];
		}else{
			return null;
		}
	}
	
	
	/*
	 * 为指定菜品点赞功能
	 */
	public static void showCaiPinListForZan(){
		// 显示所有可供选择的菜品名
		System.out.println("序号\t菜名\t\t单价\t点赞数");
		for (int i = 0; i <caiPinArr.length; i++) {
			String price = caiPinArr[i].getCpPrices() + "元";
			String zanNum = (caiPinArr[i].getCpZanNums()) > 0 ? caiPinArr[i].getCpZanNums() + "赞" : "0";
			System.out.println((i + 1) + "\t" + caiPinArr[i].getCpNames() + "\t\t" + price + "\t" + zanNum);
		}
		System.out.print("请输入要订的菜品序号:");
		Scanner input = new Scanner(System.in);
		int dzNoForIndex = input.nextInt() - 1;
		if(dzNoForIndex < 0||dzNoForIndex >=caiPinArr.length){
			System.out.println("输入序号有误!");
		}else{
			caiPinArr[dzNoForIndex].setCpZanNums(caiPinArr[dzNoForIndex].getCpZanNums()+1);
			System.out.println("点赞成功!");
		}
	}
}
