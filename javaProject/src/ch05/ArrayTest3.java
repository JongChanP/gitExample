package ch05;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[] numbers = {10,20,30};
		for(int i=0; i<numbers.length; i++){
			System.out.println(numbers[i]);
		}
	//향상된 for문(for~each문 확장for문)
	for(int value : numbers) {
		System.out.println(value);
		}
	}
}
