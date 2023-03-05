import javax.swing.JOptionPane;
public class Ejer2 {
	public static void main(String[] args) {
        int sueldo, vehi, inmu;
		String anti="No" ,capeco;
		boolean aux2= false, aux3=true;
		
		sueldo=Integer.parseInt(JOptionPane.showInputDialog("¿Cual es su ingreso mensual?"));
		vehi=Integer.parseInt(JOptionPane.showInputDialog("¿De cuantos vehiculos es usted propietario?"));
		
		if(vehi>=3) {
			anti=JOptionPane.showInputDialog("¿Alguno de esos vehiculos tiene una antiguedad menor a 5? (si/no)");
			if(anti.equalsIgnoreCase("si")== true) {
		    	   
		    	   aux2= true; }
		}
		inmu=Integer.parseInt(JOptionPane.showInputDialog("¿De cuantos inmuebles es usted propietario?"));
		capeco=JOptionPane.showInputDialog("¿Posee una embarcación, una aeronave de lujo o es titular de activos societarios que demuestren capacidad economica plena?");
		
		
		if(sueldo > 489083 || aux2 == true || inmu >= 3 || capeco.equalsIgnoreCase("si")== true || aux3==false ) {
			
	    	System.out.println("Usted pertenece al segmento de ingresos altos");
	    
	    } 
	    else {
		
	    	System.out.println("Usted no pertenece al segmento de ingresos altos");
	    }
		
		
		
		

	}

}
