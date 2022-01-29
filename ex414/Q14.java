package ex414;

public class Q14 {
	public static void main(String[] args) {
		int n = 100;
		int evencount=0,oddcount = 0,evensum=0, oddsum=0;
		while (n>0) {
			if (n%2==0) {
				evencount++;
				evensum = evensum+n;	
			} else {oddcount++;
			oddsum = oddsum+n;	
			}
			n--;
		}
		int avgEven,avgOdd;
		avgEven= evensum/evencount;
		avgOdd= oddsum/oddcount;
		System.out.println("Average of Even no till 100 :"+ avgEven);
		System.out.println("Average of Odd no till 100 :"+ avgOdd);
	}

}
