package cn.bdqn.orderingmsgggg;

public class CaiPin {
	// ��Ʒ��Ϣ��
		private String name;// ��Ʒ����
		private double price;// ��Ʒ�۸�
		private int zan;// ��Ʒ������
		
		public CaiPin(){}
		
		public CaiPin(String name, double price, int zan) {
			super();
			this.name = name;
			this.price = price;
			this.zan = zan;
		}

		// ��Ʒ����
		public String getCpNames() {
			return name;
		}

		public void setCpNames(String name) {
			this.name = name;
		}

		// ��Ʒ�۸�
		public double getCpPrices() {
			return price;
		}

		public void setCpPrices(double price) {
			this.price = price;
		}

		// ��Ʒ������
		public int getCpZanNums() {
			return zan;
		}

		public void setCpZanNums(int zan) {
			this.zan = zan;
		}
		
		//��ӡ��Ϣ
		public void print(){
			
		}
}
