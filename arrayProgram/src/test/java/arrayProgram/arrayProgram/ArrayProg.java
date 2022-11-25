package arrayProgram.arrayProgram;

public class ArrayProg {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3};
		int s=0,avg;
		for(int a:arr)
		{
			 s=s+a;
		}
		avg=s/arr.length;
		System.out.println(avg);
		
	}
	
}
