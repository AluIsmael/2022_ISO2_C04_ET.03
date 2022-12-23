package ISOFT2.Teorico2_P3;

/**
 * Esta clase contiene subclases que son las que encapsulan los datos de la
 * aplicación Ademas de tener definidas también las excepciones que se lanzarán
 * 
 * @author Ismael Roman Rey y Joaquin Sierra Granados
 * @version 1.1
 */

public class Clases {
	// Clase cliente que representa al usuario en la aplicación
	public class Cliente {
		int edad;
		boolean casaPadres;
		boolean trabajando;

		public Cliente(int edad, boolean casaPadres, boolean trabajando) {
			this.trabajando = trabajando;
			this.casaPadres = casaPadres;
			try {
				this.edad = edad;
				if (this.edad <= 0) {
					throw new InvalidAgeException("La edad solo puede ser un valor positivo.");
				}
			} catch (InvalidAgeException iae) {
				System.out.println(iae.getMessage());
			}
		}

		public int getEdad() {
			return edad;
		}

		public boolean getTrabajando() {
			return trabajando;
		}

		public boolean getCasaPadres() {
			return casaPadres;
		}
	}

	// Excepción que se lanza cuando la edad del usuario es invalida
	public static class InvalidAgeException extends Exception {
		private static final long serialVersionUID = 1L;

		public InvalidAgeException(String msg) {
			super(msg);
		}
	}
}
