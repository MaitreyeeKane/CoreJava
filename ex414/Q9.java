package ex414;

public class Q9 {
public static void main(String[] args) {
	int number = 371,originalNumber,reminder,result=0;
	originalNumber = number;
	while (originalNumber !=0) {
	 reminder = originalNumber % 10;
		result += Math.pow(reminder,3);
		originalNumber /= 10;
	}
 if (result==number) {System.out.println(number+"  is the Armstrong number");
	
} else {System.out.println(number+"  is not the Armstrong number");

}
}
}
