import java.util.Random;

public class arreglos {
	public static String[] aletorio_arreglos (int[] numeros)
	{
		String[] meses = new String[numeros.length];
		for(int contador=0; contador<numeros.length; contador++)
		{
			switch (numeros[contador]) {
			case 1:
				meses[contador]="Enero";
				break;
			case 2:
				meses[contador]="Febrero";
				break;
			case 3:
				meses[contador]="Marzo";
				break;
			case 4:
				meses[contador]="Abril";
				break;
			case 5:
				meses[contador]="Mayo";
				break;
			case 6:
				meses[contador]="Junio";
				break;
			case 7:
				meses[contador]="Julio";
				break;
			case 8:
				meses[contador]="Agosto";
				break;
			case 9:
				meses[contador]="Septiembre";
				break;
			case 10:
				meses[contador]="Octubre";
				break;
			case 11:
				meses[contador]="Noviembre";
				break;
			case 12:
				meses[contador]="Diciembre";
				break;
			default:
				meses[contador]="Ahorita no joven";
				break;
			}
		}
		return meses;
	}
	public static int[] arreglo_suma_aleatorios(int[]arreglo1 , int[]arreglo2)
	{
		Random rnd = new Random(System.nanoTime());
		int[] arreglosuma = new int[arreglo1.length];
		for(int c=0; c<arreglo1.length; c++)
		{
			arreglo1[c]=rnd.nextInt(100);
			arreglo2[c]=rnd.nextInt(100);
			arreglosuma[c]=arreglo1[c]+arreglo2[c];
			//System.out.println(arreglo1[c] + " + " + arreglo2[c] + " = " + arreglosuma[c]);
		}
		return arreglosuma;
	}

	
	public static int[] mover_arreglo (int[] arreglo)
	{
		int[] auxiliar = new int[10];
		for(int c=1; c<10; c++)
			auxiliar[c]=arreglo[c-1];
		auxiliar[0]=arreglo[arreglo.length-1];
		return auxiliar;
	}
}
