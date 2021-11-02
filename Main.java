package practica6;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("| --- TORNEO PROFESIONAL ESTADOUNIDENSE ---| \n");
		Torneo torneo = new Torneo("Liga","EstadosUnidos",5,5,2);
		torneo.team();	
		System.out.println("\n");
		torneo.DT();
	}
	public static class CapturaEntrada {
		
		   public static int capturarEntero(String msg){
		        Scanner sc = new Scanner(System.in);
		        System.out.println("" + msg+":");
		        return (sc.nextInt());
		    }
		    public static float CapturarFloat(String msg){
		        Scanner sc = new Scanner(System.in);
		        System.out.println("" + msg+":");
		        return (sc.nextFloat());
		    }
		    public static String CapturarString(String msg){
		        Scanner sc = new Scanner(System.in);
		        System.out.println("" + msg+ ":");
		        return (sc.nextLine());
		    }
	}
}
