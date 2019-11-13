package csd;

class App{
	public static void main(String[] args) {
		java.util.Scanner kb= new java.util.Scanner(System.in);
		System.out.println("Bir çift sayi giriniz:");
		int a= Integer.parseInt(kb.nextLine());
		
		System.out.println("<<<Goldbach's Conjecture>>>\n");
		System.out.println("Girilen sayi="+a);
		
			NumberUtil.goldBach(a);	
			
		}
		
	}

class NumberUtil {
	public static boolean isPrime(int val)
	{
		if(val<=1)
			return false;
		if(val%2==0)
			return val==2; 
		if(val%3==0)
			return val==3;
		if(val%5==0)
			return val==5;
		if(val%7==0)
		return val==7;
		
		for(int i=11;i*i<=val;i+=2)
			if(val%i==0)
				return false;
		return true;
			
	}  

		public static void goldBach(int n) {
	        if(n%2 != 0) { // Not expressible as 
	                       // sum of two primes
	            System.out.print(
	                " Cift degil!");
	            return;
	        }
	        if(n < 2) {
	            System.out.print(
	                " 2 den kucuk!");
	            return;
	        }
		     
	        
	        for(int i=2; i<n/2 +1; i++) {
	            if(isPrime(i) && isPrime(n-i)) {
	                System.out.println(
	                  "2 asal sayinin toplamý olarak gosterimi = "+
	                      i +" + "+ (n-i) );
	            }
	        }
	    }
}