import java.util.*;
public class CodeUp1089 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum=a+(d*i);
		}
		System.out.print(sum);
	}
}
