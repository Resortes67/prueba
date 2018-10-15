import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class Archivos {
	public String leer (String ubicacion)
	{
		String texto = "";
		try
		{
			File archivo = new File(ubicacion);
			FileReader reader = new FileReader(archivo);
			BufferedReader buffer = new BufferedReader(reader);
			String temp;
			while((temp=buffer.readLine()) != null)
				texto += temp + "\n";
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return texto;
	}
	
	public void escribir (String ubicacion, String contenido)
	{
	//	FileWriter archivo;
		try
		{
			FileWriter archivo = new FileWriter (ubicacion,true);//el ,true es para añadir, si se quita o se pone false se sobrescribe
			PrintWriter writer = new PrintWriter(archivo);
			writer.println(contenido);
			writer.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public String cambiar_vocales_Archivos(String txt)
	{
		char[] aux = txt.toCharArray();
		//aux=txt.replaceAll("[aeiouAEIOU]", "-"); //forma simple//lo que sta dentro de los corchetes se toma caracter por caracter al sustituir
		for(int c=0; c<aux.length; c++)
		{
			char letra = aux[c];
			if(letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u')
				aux[c]='-';
		}
		txt = String.valueOf(aux);
		//aux = aux.toString();
		return txt;
	}
	
}
