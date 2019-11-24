package homework1_programming;

public class Class2 {
	public static void main(String[] args) {
	int sumEven = 0;
	int j = 1;
	while(j <= 50) {
		if(j % 2 ==0) {
			sumEven = sumEven + j;
		}
		j++;
	}
	System.out.println("Sum of even number:" + "" + sumEven);

}
}

