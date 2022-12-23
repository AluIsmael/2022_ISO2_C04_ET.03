package ISOFT2.Teorico2_P3;

/**
 * Clase que contiene la lógica de la aplicación encapsulada en métodos
 * 
 * @author Ismael Roman Rey y Joaquín Sierra Granados
 * @version 1.1
 */

public class Methods {
	// Lógica general de la aplicación, que fue mencionada en el enunciado del
	// problema
	public static String posiblesCuentas(Clases.Cliente cliente) {
		Clases.Cliente clienteAlt = cliente;
		String result = "Esta informacion no corresponde a ningún tipo de cuenta";
		// Primero se revisa la franja de edad en la que cae el cliente
		if (clienteAlt.getEdad() > 25) {
			// Luego se comprueba si el cliente esta trabajando o si esta estudiando
			if (clienteAlt.getTrabajando()) {
				// Por último se mira si sigue viviendo en casa de sus padres o no
				if (clienteAlt.getCasaPadres()) {
					result = "Cuenta Independizate que va siendo hora";
				} else {
					result = "Cuenta Bienvenido a la Vida Adulta";
				}
			}
		} else {
			if (clienteAlt.getEdad() > 18) {
				if (clienteAlt.getTrabajando()) {
					if (clienteAlt.getCasaPadres()) {
						result = "Cuenta Ahorra ahora que puedes";
					} else {
						result = "Cuenta Saltando del nido";
					}
				} else if (!clienteAlt.getCasaPadres()) {
					result = "Cuenta Vamos que tu puedes";
				}
			} else {
				if (!clienteAlt.getTrabajando()) {
					if (clienteAlt.getCasaPadres()) {
						result = "Cuenta Confort";
					} else {
						result = "Cuenta Vamos que tu puedes";
					}
				}
			}
		}
		return result;
	}
}
