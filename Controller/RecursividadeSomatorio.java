package Controller;

public class RecursividadeSomatorio {

	public RecursividadeSomatorio() {
		// TODO Auto-generated constructor stub
		super();
	}

	
	public int Somatorio(int numero) {
		if (numero < 0) {
			return 0;
		} else {
			return numero + Somatorio(numero - 1);
		}
	}
}
