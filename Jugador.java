package practica6;

public class Jugador {
	String nombre;
	int numeroPlayer;
	String posicion;
	int puntosanotads;
	float estatura;
	
	public Jugador(String nombre,int numeroPlayer, String posicion, int puntosanotads , float estatura) {
		this.nombre = nombre;
		this.numeroPlayer=numeroPlayer;
		this.posicion = posicion;
		this.puntosanotads = puntosanotads;
		this.estatura = estatura;
	}

	public String getNombre() {
		return nombre;
	}
	
	public int getNumeroPlayer() {
		return numeroPlayer;
	}

	public String getPosicion() {
		return posicion;
	}

	public int getPuntosanotads() {
		return puntosanotads;
	}

	public float getEstatura() {
		return estatura;
	}
	
}

