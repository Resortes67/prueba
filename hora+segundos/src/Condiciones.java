
public class Condiciones {
	public static void condicion_horas_seg (int hora, int minuto, int segundo)
	{
		if (hora > 24)
		{
			hora = hora - 24;
		}
		System.out.println(hora + " : " + minuto +  " : " + segundo);
	}
	public static void condicion_invertir_numero (int a, int b, int c, int d, int n)
	{
		if (n<10)
		{
			System.out.println(n);
		}
		else
		{
			if (n>9 && n<100)
			{
				System.out.println((a*10)+b);
			}
			else
			{
				if (n>99 && n<1000)
				{
					System.out.println((a*100)+(b*10)+c);
				}
				else
				{
					System.out.println((a*1000)+(b*100)+(c*10)+d);
				}
			}
		}
	}
}
