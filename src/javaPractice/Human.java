package javaPractice;

 class Human {
	

}

 class Doctor extends Human{
	
}
 
 class Animal{
	 
 }
 
 class Dog extends Animal{
	 
 }
 
 class Bird{
	 
 }
 
 class Test{
	 
	 public static <T> void printInfo(T AnyObj) {
		 
		 System.out.println("Hey you are a Human/Doctor/Bird/Dog...");
	 }
	 public static void main(String[] args) {
			
		 printInfo(new Human());
		 printInfo(new Bird());
	}
	 
 }
