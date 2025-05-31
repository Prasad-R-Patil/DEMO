package session_03;
public class ArrDemo {	
	public static void main(String[] args) {	
		/*int arr[][] = new int[2][2];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 30;*/
		//arr[1][1] = 40;
		
	//	int[][] arr = {{1,2,3},{2,3},{4,5,6,7}};
		
		int [][]arr = new int[][] {{1,2,3},{2,3},{4,5,6,7}};
		
	/*	for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		*/
		
		for(int i[] : arr)
		{
			for(int j:i)
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		
	}

}
