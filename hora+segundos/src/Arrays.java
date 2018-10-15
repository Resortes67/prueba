import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;
public class Arrays {
	public static Scanner sc = new Scanner (System.in);	
	public ArrayList lista = new ArrayList();
	public float promdeio_lista ()
	{
			int numero=0;
			float suma=0, promedio=0;
			do
			{
				suma+=(float)numero;
				System.out.println("Ingresa un numero");
				numero = sc.nextInt();
				lista.add(numero);
			}while(numero>=0);
			promedio=suma/(lista.size()-1);
			return promedio;
	}
	public long[] fibonacci (int n)
	{
		long a=0, b=0, c;
		long[] fibo = new long[n];
		for(int count=1; count<=n; count++)
		{
			c=a+b;
			fibo[count-1]=c;
			b=a;
			a=c;
			if (count==1 || count==2)
			{
				a=1;
				b=0;
			}
		}
		return fibo;
	}
}
