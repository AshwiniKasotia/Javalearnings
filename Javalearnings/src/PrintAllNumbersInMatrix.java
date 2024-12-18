
public class PrintAllNumbersInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abc [][]= {{1, 2, 3}, {4, 5, 4}, {3, 2, 9}};
		int min= abc[0][0];
		
		for (int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				System.out.println(abc[i][j]);
			}
		}
	}

}
