class Square2 {
	public static void printSquare(int x){
		System.out.println(x*x);
	}
	public static void main(String[] arguments){
		printSquare("hello");
		printSquare(5.5);
	}
	//What is wrong here?
	//The method printSquare(int) in the type Square2 is not applicable for the arguments (double)
}
