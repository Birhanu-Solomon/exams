package project1;

public class Exam4 {
	
	public static void main(String[]args) {
		
	}
	
	public static void  bubbleS(int[] array) { 
		
	for(int i=array.length-1; i>=0;i--) {
		for(int j=0; j<i; j++) {
			
			if(array[j]> array[j+1]) {
				
				int temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
				
			}
		}
	}
	}

}
