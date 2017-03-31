package base;

public class MyInteger {
	
	private int iValue;
	
	
   // Constructors
	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}
    
	// Getters and Setters
	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	
	// These are Boolean Methods
	public boolean isEven(){
		if(getiValue() % 2 == 0) {
			return true;
		}
		else 
			return false; 
	}
	
	public boolean isOdd(){
		if(getiValue() % 2 != 0) {
			return true;
		}
		else 
			return false; 
	}
	
	
	public boolean isPrime() {
	    for(int i = 2; i < iValue ;i++) {
	        if(iValue  % i == 0)
	            return false;
	    }
	    return true;
	}
	
	// These are Static Methods(int)
	public static boolean isEven(int num){
		if(num % 2 == 0) {
			return true;
		}
		else 
			return false; 
	}
	
	public static boolean isOdd (int num) {
		if(num % 2 != 0) {
			return true;
			
		}
		else 
			return false; 
	}
		
	public static boolean isPrime(int num) {
	    for(int i = 2; i < num ;i++) {
	        if(num  % i == 0)
	            return false;
	    }
	    return true;
	}
	
	
	// These are Static Methods(MyIntegerValue)
	public static boolean isEven(MyInteger num) {
		return num.isEven();
	}

	public static boolean isOdd(MyInteger num) {
		return num.isOdd();
	}

	public static boolean isPrime(MyInteger num) {
		return num.isPrime();
	}
	
	
	// Equals methods
	public boolean equals(int num) {
		return iValue == num;
		
	}
	
	public boolean equals(MyInteger num){
		return iValue == num.getiValue();
	}

	




}
