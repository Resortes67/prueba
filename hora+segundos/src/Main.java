import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
public class Main 
{
	public static Scanner sc = new Scanner (System.in);
//	public Arrays Listas = new Arrays();
	public static void main(String[] args)
	
	{
		Main menu = new Main();
		int opcion=0;
		do 
		{
			system("CLS");
			System.out.println("1- Cambiar la hora aumentado n segundos");
			System.out.println("2- Invertir n numero entre 0 y 9999");
			System.out.println("3- Adivinar un numero");
			System.out.println("4- Cadena de nuemros primos");
			System.out.println("5- Obtener minimo comun multiplo de 3 numeros");
			System.out.println("6- Cuadrado de n lados");
			System.out.println("7- Numeros aleatorios convertidos a meses");
			System.out.println("8- Suma de numeros aleatorios");
			System.out.println("9- Array");
			System.out.println("10- Pila");
			System.out.println("11- Cola");
			System.out.println("12- Tree");
			System.out.println("13- Hashtable");
			System.out.println("14- Treemap");
			System.out.println("15- Arreglo tamaño 10");
			System.out.println("16- Leer un archivo");
			System.out.println("17- Escribir en un archivo");
			System.out.println("18- CAmbiar vocales de un texto");
			System.out.print("Elige una opcion: ");
			opcion = sc.nextInt();
			switch (opcion)
			{
			case 1: 
				menu.horaseg();
				break;
			case 2: 
				menu.invertir();
				break;
			case 3: 
				menu.adivinar_numero();
				break;	
			case 4: 
				menu.primo();	
				break;
			case 5: 
				menu.minimo_comun();
				break;
			case 6: 
				menu.cuadrado_n();
				break;
			case 7: 
				menu.aleatorio();
				break;
			case 8: 
				menu.suma_aleatorio();
				break;
			case 9: 
				menu.array();
				break;
			case 10: 
				menu.pila();
				break;
			case 11: 
				menu.cola();
				break;
			case 12: 
				menu.tree();
				break;
			case 13: 
				menu.hasht();
				break;
			case 14: 
				menu.treemap();
				break;
			case 15: 
				menu.areglo10();
				break;
			case 16: 
				menu.archivo_leer();
				break;
			case 17: 
				menu.archivo_escribir();
				break;
			case 18: 
				menu.cambiar_vocales();
				break;

			}
		}while(opcion>=1 && opcion<=18);
		//menu.horaseg();
		//menu.invertir();
		//menu.adivinar_numero();
		//menu.primo();
		//menu.minimo_comun();
		//menu.cuadrado_n();
		//menu.aleatorio();
		//menu.suma_aleatorio();
		//menu.array();
		//menu.pila();
		//menu.cola();
		//menu.tree();
		//menu.hasht();
		//menu.treemap();
		//menu.areglo10();
		//menu.archivo_leer();
		//menu.archivo_escribir();
		//menu.cambiar_vocales();
	}
	private static void system(String string) {
	// TODO Auto-generated method stub
	
}
	public  void horaseg ()
	{
		int horas, minutos, seg, incremento;
		System.out.println("Ingresa la hora actual");
		horas= sc.nextInt();         
		System.out.println("Ingresa el minuto actual");
		minutos= sc.nextInt();
		System.out.println("Ingresa el segundo actual");
		seg = sc.nextInt();
		System.out.println("Ingresa el incremento en segundos");
		incremento = sc.nextInt();
		Math.calculo_horas_seg(horas, minutos, seg, incremento);
	}
	public void invertir ()
	{
		int numero;
		System.out.println("Ingresa un numero del 0 - 9999");
		numero= sc.nextInt();
		Math.invertir_numero(numero);
	}
	public void adivinar_numero()
	{
		int numero;
		System.out.println("Ingresa un numero\n");
		numero = sc.nextInt();
		Ciclos.ciclo_adivinar_numero(numero);
	}
	public void primo()
	{
		int numero;
		System.out.println("Ingresa un numero");
		numero = sc.nextInt();
		Ciclos.ciclo_primo(numero);
	}
	public void minimo_comun()
	{
		int numero1, numero2, numero3;
		System.out.println("Ingresa un numero\n");
		numero1 = sc.nextInt();
		System.out.println("Ingresa un numero\n");
		numero2 = sc.nextInt();
		System.out.println("Ingresa un numero\n");
		numero3 = sc.nextInt();
		Ciclos.ciclo_minimo_comun(numero1, numero2, numero3);
	}
	public void cuadrado_n()
	{
		int numero;
		System.out.println("Ingresa un numero");
		numero = sc.nextInt();
		Ciclos.ciclo_cuadrado_n_lados(numero);
	}
	public void aleatorio ()
	{
		arreglos arreglo = new arreglos();
		Random rnd = new Random(System.nanoTime());
		int[] aleatorios = new int[12];
		String[] meses = new String[12];
		for(int i=0; i<aleatorios.length; i++)
		{
			aleatorios[i]=rnd.nextInt(12);
		}
		meses = arreglos.aletorio_arreglos(aleatorios);
		for(String temp : meses)
		{
			System.out.println(temp);
		}
	}
	public void suma_aleatorio()
	{
		//arreglos arreglo = new arreglos();
		
		//int[] aleatorios = new int[12];
		int numero;
		System.out.println("Ingresa un numero\n");
		numero = sc.nextInt();
		int[] arreglo1 = new int[numero];
		int[] arreglo2 = new int[numero];
		int[] arreglo3 = new int[numero];
		arreglo3=arreglos.arreglo_suma_aleatorios(arreglo1, arreglo2);
		for(int c=0; c<arreglo1.length; c++)
			System.out.println(arreglo1[c] + " + " + arreglo2[c] + " = " + arreglo3[c]);
	} 
	public void array()
	{
		/*ArrayList list = new ArrayList();
		list.add("holaaa");
		list.add(128);
		list.add('a');
		list.add(true);
		
		list.remove(3); //retiramos el dato en el indice 3
		System.out.println("La lista contiene holaaa? " + list.contains("holaaa")); //veirifica si existe un dato en la lista y devuelve un booleano
		Iterator it = list.iterator(); //creamos un iterador para recorrer la lista
		while(it.hasNext())//el ciclo se efectua mientras haya elementos en la lista
		{
			System.out.println(it.next());
		}
		System.out.println("El tamaño actual de la lista es: " + list.size());
		*/
		
		//Listas.promdeio_lista();
		int numero;
		
		System.out.println("Ingresa el limite de la serie de fibonacci: ");
		numero = sc.nextInt();
		long [] arreglo = new long[numero];
//		arreglo = Listas.fibonacci(numero);
		for (int c=0; c<numero; c++)
		{
			System.out.println(arreglo[c]);
		}  
		
	}
	public void pila()
	{
		Stack<String> pila = new Stack<String>();
		pila.push("Adal");
		pila.push("Victor");
		pila.push("Efren");
		pila.push("La Yadis");
		System.out.println("El tamaño: " + pila.size());
		System.out.println("Ultimo elemento " + pila.peek()); //muestra ultimo elemento de la pila sin sacarlo
		System.out.println("El tamaño: " + pila.size());
		System.out.println("Ultimo elemento despues de peek: " + pila.pop()); // muestra ultimo elemento de la pila y lo saca
		System.out.println("El tamaño: " + pila.size());
		System.out.println("Ultimo elemento despues de pop" + pila.peek());
	}
	public void cola()
	{
		PriorityQueue <String> cola = new PriorityQueue <String> ();
		cola.add("Carro");
		cola.add("Avion");
		cola.add("computadora");
		cola.add("raton");
		Iterator it = cola.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		//peek muestra el primer elemento de la cola
		System.out.println("Primero: " + cola.peek());
		//poll nos muestra el primer elemento de la cola y lo saca de ella
		System.out.println("Primero: " + cola.poll());
		System.out.println("Nuevo primero: " + cola.peek());
		//Devuelve true si contiene el elemento
		System.out.println("Contiene avion? : " + cola.contains("Carro"));
		System.out.println("Contiene mochila ? : " + cola.contains("mochila"));
		cola.remove("raton");
	}
	public void tree() {
		TreeSet <String> arbol = new TreeSet <String>();
		arbol.add("rama");
		arbol.add("camion");
		arbol.add("helicoptero");
		arbol.add("maletin");
		arbol.add("moto");
		
		System.out.println("Elementos del arbol: " + arbol.size());
		
		Iterator it = arbol.iterator();
		while(it.hasNext())
			System.out.println("\t" + it.next());
	
		System.out.println("¿Se agrego el elemento?" + arbol.add("rama"));
		System.out.println("¿Se agrego el elemento?" + arbol.add("ra"));
		System.out.println("Elementos del arbol: " + arbol.size());
		arbol.remove("rama");
		System.out.println("Despues de remove: " + arbol.size());
		arbol.clear();
		System.out.println("Despues de clear: " + arbol.size());
	}
	
	public void hasht()
	{
		Hashtable <Integer, String> hash = new Hashtable <Integer,String>();
		//Se defina la clave y el valor 
		hash.put(1, "auto");
		hash.put(2, "perro");
		hash.put(3, "lap");
		hash.put(4, "planta"); 
		//se pude sobre escribir los datos utilizando los indices
		//Hashtable se recorre como Enumeration en lugar de Iterator
		Enumeration en = hash.keys();
		while(en.hasMoreElements())
		{
			int clave = (int)en.nextElement();
			 System.out.println(clave + " " + hash.get(clave));
		}
		hash.put(5, "*.*");
		//podemos comprobar si nuestro Hastable ya contien esa clave
		System.out.println("Existe la clave 3: " + hash.containsKey(3));
		System.out.println("Existe la clave 6: " + hash.containsKey(6));
	}
	public void treemap()
	{
		//TreeMap incluye clave por valor, y se ordena automaticamente de acuerdo 
		TreeMap<String, Integer> tmap = new TreeMap<>();
		tmap.put("gato", 90);
		tmap.put("pantera", 91);
		tmap.put("mono", 10);
		tmap.put("guitarra", 80);
		
		Iterator it = tmap.keySet().iterator();
		while(it.hasNext())
		{
			String clave = (String) it.next();
			System.out.println(clave + " -> " + tmap.get(clave));
		}
	}
	
	public void areglo10 ()
	{
		int[] arreglo = {1,2,3,4,5,6,7,8,9,0};
		int[] auxiliar = arreglo;
		int opcion= 1;
		while(opcion!=0)
		{
			System.out.println("quieres recorrer el arreglo? 1/0 ");
			opcion = sc.nextInt();
			if(opcion==1)
			{
				auxiliar= arreglos.mover_arreglo(auxiliar);
				/*for(int c=0; c<10; c++)
				{
					System.out.println(auxiliar[c]);
				}*/
				for(int aux : auxiliar)
					System.out.print(aux + "  ");
				System.out.println();
			}
		}
		
	}
	
	public void archivo_leer ()
	{
		Archivos txt = new Archivos();
		String ruta, texto;
		System.out.println("ingresa la ruta del archivo: ");
		ruta = sc.nextLine();
		texto = txt.leer(ruta);
		System.out.println(texto);
	}
	
	public void archivo_escribir()
	{
		Archivos txt = new Archivos();
		String ruta, texto, newtext;
		System.out.println("ingresa la ruta del archivo: ");
		ruta = sc.nextLine();
		System.out.println("ingresa texto: ");
		texto = sc.next();
		txt.escribir(ruta, texto);
		newtext=txt.leer(ruta);
		System.out.println(newtext);
	}
	public void cambiar_vocales()
	{
		Archivos txt = new Archivos();
		String ruta, texto, aux;
		System.out.println("ingresa la ruta del archivo: ");
		ruta = "C:\\Users\\Antonia\\Desktop\\hola.txt";
		texto = txt.leer(ruta);
		aux=txt.cambiar_vocales_Archivos(texto);
		System.out.println(aux);
	}
}
