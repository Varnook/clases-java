class test{
	public static void main(String[] args) {

		Complejo a = new Complejo(4,2);
		NumerosComplejos b = new Complejo(4,2);
		//float bRe = b.parteRe;

		a.sumar(b);
		//a.parteIm = (float)Math.sqrt(a.parteIm);
		a.mostrar();
	}
}
