import java.util.*;
public class Ejer1_c {
public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Indique si quiere visualizar los numeros pares o impares (par/impar)");
		
		String var1= entrada.nextLine();
		
		int a=3;
		int b=15;
		String var2= "par";
		while( a <= b) {
			if(var2.equalsIgnoreCase(var1)== true && a%2 == 0) {
				System.out.println(a);
			}
			else if(a%2 !=0 && var2.equalsIgnoreCase(var1)== false)  {
				System.out.println(a);
			}
			a=a+1;
		}
		

	}
}
