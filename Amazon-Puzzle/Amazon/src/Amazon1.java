import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;


/**
 * TODO Put here a description of what this class does.
 *
 * @author rangesh.
 *         Created Jun 27, 2012.
 */
public class Amazon1 {
InputStreamReader input=new InputStreamReader(System.in);
BufferedReader inputs=new BufferedReader(input);
int[] pos=new int[5];
Long [][] output=new Long [5][2];
int flag=0;
ArrayList<Double> fibinp=new ArrayList();
public static void main(String args[])
	{
Amazon1 fib=new Amazon1();
fib.input();
	}
	void input()
	{
	try {


		String tcase=inputs.readLine();
		int tcase1=Integer.parseInt((tcase));
		String s=Integer.toBinaryString(tcase1);
		  int f= Integer.parseInt(s,2);
System.out.println("f"+f );

				for(int i=0;i<tcase1;i++)
		{
			String inp=inputs.readLine();
		Double k=Double.parseDouble(inp);
		fibinp.add(k);
		}
		for(int i=0;i<tcase1;i++)
		{
		pos[i]=0;	
		}
		for(int i=0;i<fibinp.size();i++)
		{
			int j=i;
		primegen(fibinp.get(i),j);	
		}
		flag=0;
		for(int i=0;i<tcase1;i++)
		{
		if(pos[i]==0)
		{
genfib1(fibinp.get(i),i);
		}
		}
		for(int i=0;i<tcase1;i++)
		{
		for(int j=0;j<2;j++)
		{
		System.out.print(output[i][j]);	
		System.out.print(" ");
		}
		System.out.println();
		}
	} catch (IOException exception) {
		// TODO Auto-generated catch-block stub.
		exception.printStackTrace();
		
	}	
	catch (NumberFormatException e)
	{
	System.out.println(e);	
	}
	}
	void primegen(Double double1,int p)
	{
		int s = 0;
		int count = 0;
		int sqrtin=(int)Math.sqrt(double1);
		boolean [] check=new boolean[(int) (double1+1)];
		for(int i=2;i<=double1;i++)
		{
		check[i]=true;	
		}
	for(int i=2;i<=sqrtin;i++)
	{
	if(check[i]==true)	                 //sieve of erithrosis
	{
		for(int j=(i*i);j<=double1;j=(j+i))
		{
			check[j]=false;
		}
	}
	}
	for(int i=2;i<=double1;i++)
	{
	if(check[i]==true)
	{
		
		if((double1%i==0) && (flag!=1))
		{
flag=genfib(i,double1,p);
		}
	}
	}
	flag=0;
	}
	int genfib(int fibs,Double double1 ,int p)
	{
		int fib1=1;
		int fib2=1;
		int fib3=0;
		for(int i=0;fib3<=double1;i++)
		{
		fib3=fib1+fib2;
		if(fib3%fibs==0)
		{
			output[(p)][0]=Long.parseLong(String.valueOf(fib3));
			output[(p)][1]=Long.parseLong(String.valueOf(fibs));
		//System.out.println(fib3+" "+fibs);
pos[p]=1;
		return 1;	
		}
		fib1=fib2;
		fib2=fib3;
		
		}
		return 0;
		
	}
	void genfib1(Double double1 ,int p)
	{
		
		Long fib1=(long) 1;
		Long fib2=(long) 1;
		Long fib3=(long) 0;
		Long double2=double1.longValue();
		while(flag==0)
		{
		fib3=fib1+fib2;
		if((fib3%double2)==0)
		{
//		System.out.println(fib3+" "+(int)Math.round(double1));
		output[p][0]=fib3;
		output[p][1]=double1.longValue();
		pos[p]=1;
       flag=1;
		}
		fib1=fib2;
		fib2=fib3;
		}
		flag=0;
	}

}
