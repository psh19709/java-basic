package myex;

public class Store {
	
		String no;
		String id;
		String date;
		String name;
		String orderNum;
		String addess;
		public String getNo() {
			return no;
		}
		public void setNo(String no) {
			this.no = no;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getOrderNum() {
			return orderNum;
		}
		public void setOrderNum(String orderNum) {
			this.orderNum = orderNum;
		}
		public String getAddess() {
			return addess;
		}
		public void setAddess(String addess) {
			this.addess = addess;
		}
		@Override
		public String toString() {
			return "Store [no=" + no + ", id=" + id + ", date=" + date + ", name=" + name + ", orderNum=" + orderNum
					+ ", addess=" + addess + "]";
		}
	
		
}
