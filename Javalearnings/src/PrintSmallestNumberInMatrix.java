
public class PrintSmallestNumberInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int abc [][]= {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
		int min= abc[0][0];
		
		for (int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				if (abc[i][j]<min)
				{
					min= abc[i][j];
				}
			}
		}
		System.out.println(min);
	} 

}
