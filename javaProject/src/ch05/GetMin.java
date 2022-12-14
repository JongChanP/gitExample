package ch05;

public class GetMin {

	public static void main(String[] args) {
		int s[] = {12,3,19,6,18,8,12,4,1,19};
		int min;
		int max;
		
		min = s[0];//12
		for(int i=0; i<s.length; i++) {
			if(s[i] < min) {
				min = s[i];
			}
		}
		max = s[0];
		for(int i=0; i<s.length; i++) {
			if(s[i] > max) {
				max = s[i];
			}
		}
		System.out.println("최소값은 " +min);
		System.out.println("최대값은 " +max);
	}
}
