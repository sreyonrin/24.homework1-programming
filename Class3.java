package homework1_programming;

public class Class3 {
	public static void main(String[] args) {
		int averageOdd = 0;
		int j = 1;
		while(j <= 50) {
			if(j % 2 !=0) {
				averageOdd = averageOdd + j;
			}
			j++;
		}
		System.out.println("The average of odd number:" + ""  +averageOdd/25);
		
	}
}
