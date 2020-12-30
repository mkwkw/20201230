//20201230
//그리디
//백준 11399

//인출에 소요되는 시간이 적은 순서대로 값을 찾고 계산값을 구한다.
import java.util.*;
public class p11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int arr [] = new int[num];
		
		for(int i=0; i<num; i++) {
			arr[i]= sc.nextInt();
		}
		
		
		
		for(int i=0; i<num; i++) {
			for(int j=i+1; j<num; j++) {
				int min= arr[i];
				if(min>arr[j]) {
					min=arr[j];
					
					int temp = arr[i];
					arr[i]=min;
					min = arr[j];
					arr[j]=temp;
				}
				
				
			}
		}
		sc.close();
		
		int sum=0;
		int fsum=0;
		for(int i=0; i<num; i++) {
			sum +=arr[i];
			fsum +=sum;
		}
		
		System.out.println(fsum);
	}

}
