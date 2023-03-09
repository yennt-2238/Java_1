package Transfer_money;

public class Account {
	private int id;
	private String name;
	private int balance = 0;

	public Account(int id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public void checkAmount_displays_infor() {
		System.out.println(this.name+" Tài khoản hiện tại là :" + this.balance);
	}
	public void credit(int amount) {
		if (amount < 0) {
			System.out.println("Số tiền nhập invalid");
			return;
		}

		this.balance = balance + amount;
	}

	public void debit(int amount) {
		if (amount > balance) {
			System.out.println(" Số dư tài khoản không  đủ. Giao dịch không thành công");
			return;
		}
		this.balance = balance - amount;

	}


	public void tranferTo(Account accountFrom, Account accountTo, int amount) {
		accountFrom.debit(amount);
		accountTo.credit(amount);
	}

}
