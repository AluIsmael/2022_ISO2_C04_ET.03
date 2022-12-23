package ISOFT2.Teorico2_P3;

public class Main {
	public static void main(String[] args) {
		Clases clases = new Clases();
        Clases.Cliente cliente = clases.new Cliente("Pepe", 17, false, false);
        System.out.println(Methods.posiblesCuentas(cliente));
	}
}
