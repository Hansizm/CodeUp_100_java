import java.util.*;
public class CodeUp1059 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = String.valueOf(~n);
		System.out.print(Integer.parseInt(str, 10));
		System.out.print(str);
	}
}
