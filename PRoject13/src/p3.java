//백준 15663
//n과 m
//백트래킹
//n개에서 m개를 중복 없이 고르기, 오름차순으로 출력
//3 1
//4 4 2
//4 4 2 3개의 숫자 중에 1개를 고르는 경우를 출력
//2
//4
import java.util.*;
public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr [] = new int [n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		
	}

}
