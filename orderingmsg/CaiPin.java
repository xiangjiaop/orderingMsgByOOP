package cn.bdqn.orderingmsgggg;

public class CaiPin {
	// 菜品信息类
		private String name;// 菜品名称
		private double price;// 菜品价格
		private int zan;// 菜品点赞数
		
		public CaiPin(){}
		
		public CaiPin(String name, double price, int zan) {
			super();
			this.name = name;
			this.price = price;
			this.zan = zan;
		}

		// 菜品名称
		public String getCpNames() {
			return name;
		}

		public void setCpNames(String name) {
			this.name = name;
		}

		// 菜品价格
		public double getCpPrices() {
			return price;
		}

		public void setCpPrices(double price) {
			this.price = price;
		}

		// 菜品点赞数
		public int getCpZanNums() {
			return zan;
		}

		public void setCpZanNums(int zan) {
			this.zan = zan;
		}
		
		//打印信息
		public void print(){
			
		}
}
