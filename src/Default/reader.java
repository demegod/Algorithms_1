package Default;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class reader {
	public static void main(String[] args) throws IOException{
		
		Scanner input = new Scanner(new File("pa1_input.txt"));
		String fileName = "pa1_output.txt";
		PrintWriter output = new PrintWriter(fileName);
		
		while (input.hasNext()){
			String numbers = input.nextLine();
			String[] numArray = numbers.split("\t");
			int nums[] = new int[Integer.parseInt(numArray[0])];
			for (int i = 0; i < nums.length; i++){
				String numberAsString = numArray[i+1];
				nums[i] = Integer.parseInt(numberAsString);
			}
			
			if (uniqueElements(nums)){
				output.println("False");
			}
			else{
				output.println("True");
			}
			
		}
		output.close();
		
	}
	public static boolean uniqueElements(int [] a ){
		for (int i = 0; i < a.length - 2; i++){
			for (int j = i+1; j < a.length - 1; j++){
				if (a[i] == a[j]){
					return false;
				}
			}
		}
		return true;
	}
}
