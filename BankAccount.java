class BankAccount 
{
	private String bankName;
	private long accNum;
	private boolean Active;

	public void setbankName(String bankName){
		this.bankName = bankName;
	}
	public String getbankName(){
		return this.bankName;
	}
	public void setaccNum(long accNum){
		this.accNum = accNum;
	}
	public long getaccNum(){
		return this.accNum;
	}
	public void setActive(boolean Active){
		this.Active = Active;
	}
	//boolean so Here we use is because it is more meaning full(is,can,has)
	public boolean isActive(){
		return this.Active;
	}
	public void display()
	{
		System.out.println("bankName:"+bankName);
		System.out.println("accNum:"+accNum);
		System.out.println("active:"+Active);
		
	}
}
