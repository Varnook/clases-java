public class Complejo implements NumerosComplejos {

	float parteRe;
	float parteIm;

	public Complejo(float a, float b) {
		this.parteRe = a;
		this.parteIm = b;
	}
	
	public void sumar(NumerosComplejos a) {
		Complejo x = (Complejo) a;		

		this.parteRe += x.parteRe;
		this.parteIm += x.parteIm;
	}
	
	public void mostrar() {

		Complejo a = (Complejo) this;

		String signo = a.parteIm < 0 ? " - " : " + ";

		System.out.println(Float.toString(a.parteRe) + signo + Float.toString(a.parteIm) + "i");

	}
}

