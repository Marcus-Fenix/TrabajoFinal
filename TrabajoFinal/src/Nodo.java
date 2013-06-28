
public class Nodo {
	
	private int Dato;
	private Nodo siguiente;
	private Nodo anterior;
	private Nodo arriba;
	private Nodo abajo;
	
	public Nodo(){
	}
	
	public Nodo getArriba() {
		return arriba;
	}

	public void setArriba(Nodo arriba) {
		this.arriba = arriba;
	}

	public Nodo getAbajo() {
		return abajo;
	}

	public void setAbajo(Nodo abajo) {
		this.abajo = abajo;
	}

	public Nodo(int dato){
		this.Dato = dato;
		this.siguiente = null;
	}

	public Nodo getAnterior() {
		return anterior;
	}

	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}

	public int getDato() {
		return Dato;
	}

	public void setDato(int dato) {
		Dato = dato;
	}
	
	public void Borrar(){
		this.siguiente = null;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
}
