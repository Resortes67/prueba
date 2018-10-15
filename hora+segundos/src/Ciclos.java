
public class Ciclos {
	//static Scanner sc = new Scanner (System.in);
	public static void ciclo_adivinar_numero(int n)
	{
		int intento=n+1;
		while(n!=intento)
		{
			System.out.println("Adivina el numero");
			intento = Main.sc.nextInt();
			if (intento>n) 
			{
				System.out.println("El numero ingresado es mayor al original\n");
			}
			else
			{
				System.out.println("El numero ingresado es menor al original\n");
			}
		}
		System.out.println("El numero ingresado es igual al original\nVICTORIA");
	}
	public static void ciclo_primo(int n)
	{
		int divisores = 0, contador = 1;
		do
		{
			if ((n%contador)==0)
			{
				divisores+=1;
			}
			if(contador>=3)
				contador+=2;
			else
				contador++;
			System.out.println(divisores);
			System.out.println(contador + "____");
		}while(contador<=n);
		if(divisores==2)
			System.out.println("El numero es primo");
		else
			System.out.println("El numero NO es primo");
	}
	public static void ciclo_minimo_comun(int num1, int num2, int num3)
	{
		int contador=2, minimocomun=1;
		boolean condicion=false;
		while(condicion==false)
		{
			if(num1==1 && num2==1 && num3==1)
				condicion=true;
			if(num1%contador==0 ||num2%contador==0 || num3%contador==0 )
			{
				if(num1%contador==0)
					num1/=contador;
				if(num2%contador==0)
					num2/=contador;
				if(num3%contador==0)
					num3/=contador;
				minimocomun*=contador;
			}
			else
			{
				if(contador>=3)
					contador+=2;
				else
					contador++;
			}
		}
		System.out.println(minimocomun);
	}
	public static void ciclo_cuadrado_n_lados(int n)
	{
		int renglones=1;
		String cuadro="";
		for (int contador=1; contador<=n; contador++)
		{
			cuadro+="*\t";
			//System.out.println("*\t");
			if (contador == n && renglones<n)
			{
				//System.out.println("\n");
				cuadro+="\n";
				renglones++;
				contador=0;
			}
		}
		System.out.println(cuadro);
	}
}
