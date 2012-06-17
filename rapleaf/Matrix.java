import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


public class Matrix {



	public static void main(String args[])
	{
		Matrix mat=new Matrix();
		mat.calculate();
	}

	void calculate()
	{
		String inp;
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader inputs=new BufferedReader(input);
		
		try {
			System.out.println("Enter Matrix Order");
			inp=inputs.readLine();
			int inps=Integer.parseInt(inp);
			Integer[] test=new  Integer[inps];
			int[][]output=new int[inps][inps];
			for(int i=0;i<inps;i++) // Intialization of array
			{
			test[i]=i;	
			}
	
			for(int i=0;i<(test.length);i++) // Solution //Recognized pattern as Latin square 
			{
			
			for(int j=0;j<(test.length);j++) 
		    {
		    output[(test[j]-0)][j]=test[0];         // Creates the required solution in constant time
		    }
		    Collections.rotate(Arrays.asList(test), -1); // Rotate position of array by 1
			}
		
			for(int i=0;i<test.length;i++) //Displays the output
			{
			for(int j=0;j<test.length;j++)
			{
			System.out.print(output[i][j]+"\t");	
			
			}
			System.out.println("");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
