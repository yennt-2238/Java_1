package Transfer_money;

public class Main {

	public static void main(String[] args) {
		Account object1 = new Account(1, "Object 1", 20);
		Account object2 = new Account(2, "Object 2", 5);
		object1.checkAmount_displays_infor();
		object2.checkAmount_displays_infor();
		object1.tranferTo(object1,object2, 5);
		System.out.println("===========Đây là giao dịch sau khi chuyển tiền=========");
		object1.checkAmount_displays_infor();
		object2.checkAmount_displays_infor();
	}
}
