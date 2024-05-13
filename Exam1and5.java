package project1;
import java.util.Arrays;
import java.util.Scanner;
public class Exam1and5 {
	public static void main(String args[]) {
		int[] array= new int[2];
		Scanner sc= new Scanner(System.in);

		System.out.println("Insert the first number : ");
		int first=sc.nextInt();
		// array[0]=first;

		System.out.println("Insert the second number :  ");
		int second=sc.nextInt();
		//array[1]=second;
		// sc.close();
		array[0]=first;
		array[1]=second;



		System.out.println("The array includes : "+Arrays.toString(array));

		System.out.println("Enter the number to be searched : ");
		int target=sc.nextInt();
		int occurenceTime =countOccurences(array,target);
		System.out.println(target+" occurs "+occurenceTime+" times.");
		mergeS(array);

	}

	public static int countOccurences(int[]array, int target) { 
		int count =0;
		for(int value:array) {
			if(value==target)
				count++;
		}
		return count;
	}

	public static void mergeS(int[] array) {
		int n= array.length;
		if (n<2) return;

		int mid = n/2;
		int[] left= new int[mid];
		int[] right= new int[n-mid];

		for(int i=0; i<mid; i++)
			left[i]=array[i];
		for(int i=mid; i<n; i++)
			right[i]=array[i];

		mergeS(left);
		mergeS(right);
		merge(left,right,array);

	}

	public static void merge(int[]array, int[] left, int[] right) {

		int leftS=left.length;
		int rightS=right.length;

		int i=0;
		int l=0;
		int r=0;

		while(l<leftS&&r<rightS) {

			if (array[l]<array[r]) {
				array[i]=array[l];
				i++;
				l++;
			}

			else {
				array[i]=array[r];
			}
		}



	}



}






