
package practica6;
import java.util.ArrayList;

public class Equipo {
	ArrayList<Jugador>players = new ArrayList<Jugador>();
	String equipo;
	String division;
	String entrenador;
	int torneosPartici;
	int torneoswin;
	int torneoslose;
	
	public Equipo(String equipo, String division, String entrenador, int torneosPartici, int torneoswin, int torneoslose) {
		this.equipo = equipo;
		this.division = division;
		this.entrenador = entrenador;
		this.torneosPartici = torneosPartici;
		this.torneoswin = torneoswin;
		this.torneoslose = torneoslose;	
	}
	  public String getEquipo(){
        return equipo;
    }
    public String getEntrenador(){
        return entrenador;}
    public String getDivision(){return division;
    }
    public int gettorneosPartici(){
        return torneosPartici;
    }
    public int gettorneoswin(){
        return torneoswin;
    }
    public int gettorneoslose(){
        return torneoslose;
    }
    
    
    int cantJugadores = 10;
    public void crear_jugadores(){
    	String nombre;
		int numeroPlayer;
		String posicion;
		int puntosanotads;
		float estatura;
		
		int i= 1;
		int y = 1;
		int x = -1;
        while(i < 11){
            do{
                nombre = Main.CapturaEntrada.CapturarString("Introduce el nombre del jugador "+i);
                posicion = Main.CapturaEntrada.CapturarString("Introduce la posicion del jugador");
                numeroPlayer = Main.CapturaEntrada.capturarEntero("Introduce el numero del jugador");
                puntosanotads = Main.CapturaEntrada.capturarEntero("Introduce los puntos anotados del jugador");
                estatura = Main.CapturaEntrada.CapturarFloat("Introduce la estatura de jugador");
                if((estatura < 0) || (estatura > 4)||(puntosanotads < 0)||(numeroPlayer < 0)) System.out.println("Error, ingrese un valor permitido.");
                else y = 0;
                if(numeroPlayer == x){System.out.println("| EL NUMERO DEL JUGADOR YA HA SIDO ELEJIDO |"); y = 1;}
                else x = numeroPlayer;

                String auxiliarNombre = nombre;
                for(Jugador p:players){
                    if(p.getNombre().equals(auxiliarNombre)){
                        System.out.println("| LOS EQUIPOS NO PUEDEN SER REPETIDOS |");
                        y = 1;
                    }
                    else auxiliarNombre = p.getNombre();
                }

            }while(y !=0);
			y = 1;i++;
			Jugador newPy = new Jugador(nombre,numeroPlayer,posicion,puntosanotads,estatura);
			players.add(newPy);
        }
    }
    public int PT(){
        int pt = 0;
        for(int i = 0; i < players.size();i++){
            pt += players.get(i).getPuntosanotads();
        }
        return pt;
    }
    public void view(){
        System.out.println("Nombre | posicion ");
        for(int i = 0; i < players.size(); i++){
            System.out.println(players.get(i).getNombre()+":"+players.get(i).getPosicion());
        }
    }
    public void inf(){
        System.out.println(equipo +","+division);
    }
}

