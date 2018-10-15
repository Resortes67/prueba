
public class Math {
	
	public static void calculo_horas_seg (int h, int m, int s, int sa)
	{
		int stotal, mtotal, htotal, sactual, mactual;
		stotal = s + sa;
		sactual = stotal%60;
		mtotal = ((stotal-sactual)/60)+m;
		mactual = mtotal%60;
		htotal = ((mtotal-mactual)/60)+h;
		Condiciones.condicion_horas_seg(htotal, mactual, sactual);
	}
	public static void invertir_numero( int num)
	{
		int a,b,c,d,n=num;
		a = num%10;
		b = ((num%100)-a)/10;
		c = ((num%1000)-(num%100))/100;
		d = ((num%10000)-(num%1000))/1000;
		Condiciones.condicion_invertir_numero(a, b, c, d, n);
	}
	
}
