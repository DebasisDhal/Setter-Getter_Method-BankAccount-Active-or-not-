class Bank 
{
	public static void main(String[] args) 
	{
		BankAccount acc1 = new BankAccount();
		System.out.println(acc1.isActive());

		acc1.setbankName("SBI");
		acc1.setaccNum(254415845745l);
        acc1.setActive(true);

		//it is 1 type condition check

		/*if(acc1.isActive())
			System.out.println("is active");
			else
			System.out.println("is not active");*/

			//it is 2 type condition check

         System.out.println(acc1.isActive()? "active" : "!active"); //terynary operator
		
		System.out.println(" ");

		acc1.display();
	}
}
