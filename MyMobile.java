package Week1.Day2;

public class MyMobile {
	public void makeCalls() {
		System.out.println("Make Calls");
	}

	public void sendMsgs() {
		System.out.println("send Msgs");
	}

	private void payBills() {
		System.out.println("pay Bills");
	}

	public static void main(String[] args) {
		MyMobile mobObj = new MyMobile();
		mobObj.makeCalls();
		mobObj.sendMsgs();
		mobObj.payBills();
	}

}
