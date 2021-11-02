package practica6;

import java.util.ArrayList;

class Torneo{
	ArrayList<Equipo> Teams = new ArrayList<Equipo>();
	String nombreTorneo;
	String region;
	int num_jugadores;
	int partidos_jgds;
	int partidos_pendientes;
	
	public Torneo(String nombreTorneo, String region, int num_jugadores, int partidos_jgds, int partidos_pendientes) {
		this.nombreTorneo = nombreTorneo;
		this.region = region;
		this.num_jugadores = num_jugadores;
		this.partidos_jgds = partidos_jgds;
		this.partidos_pendientes = partidos_pendientes;
	}
    public void team(){
    	int torneosPartici;
		int torneoswin;
		int torneoslose;
		int Equipos = 1;
		int x = 1;
		
        while(Equipos < 3){
            String nombreEquipo = Main.CapturaEntrada.CapturarString("Introduce el nombre del equipo");
            String division = Main.CapturaEntrada.CapturarString("Introduce la division");
            String nombreEntrenador = Main.CapturaEntrada.CapturarString("Introduce nombre del entrenador");
            do{
            	torneosPartici = Main.CapturaEntrada.capturarEntero("Introduce los torneos participados");
            	torneoswin = Main.CapturaEntrada.capturarEntero("Introduce la cantidad de torneos Ganados");
            	torneoslose = Main.CapturaEntrada.capturarEntero("Introduce la cantidad de torneos Perdidos");
                if(torneosPartici !=(torneoswin + torneoslose)) System.out.println("| LOS TORNEOS INGRESADO NO SON LOS CORRECTOS |");
                else x = 0;
            }while(x!= 0);
            Equipos++;
            Equipo NE = new Equipo(nombreEquipo,division,nombreEntrenador,torneosPartici,torneoswin,torneoslose);
            System.out.println("10 jugadores por equipo.");
            NE.crear_jugadores();
            Teams.add(NE);
        }
    }
    public void DT(){
        System.out.println("En el torneo "+nombreTorneo+" hay "+num_jugadores+" equipos  de la region "+region);System.out.println("Se han jugado "+partidos_jgds+" partidos y quedan "+partidos_pendientes+" pendientes");
        for(int i = 0; i < Teams.size(); i++){
            System.out.println("Equipo "+ (i+1)+": "+Teams.get(i).getEquipo()+" - Puntos = "+Teams.get(i).PT()+" - Division = "+Teams.get(i).getDivision());Teams.get(i).view();
        }
    }
}