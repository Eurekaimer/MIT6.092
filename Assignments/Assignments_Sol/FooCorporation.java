class FooCorporation {
	public static void pay(double base_pay, int time){
		if (base_pay < 8.0) {
			System.out.println("You must pay at least $8.0/hour");
		} else if (time > 60) {
			System.out.println("You can't work more than 60h/week");	
		} else {
			int overtime = 0;
			if (time > 40) {
				overtime = time - 40;
				time = 40;
			}
			double pay = base_pay * time + 1.5 * base_pay * overtime;
			System.out.println("This employee should get " + pay);
		}
	}
	public static void main(String[] arguments){
		pay(7.5, 35);
		pay(8.2, 47);
		pay(10.0, 73);
	}
}
