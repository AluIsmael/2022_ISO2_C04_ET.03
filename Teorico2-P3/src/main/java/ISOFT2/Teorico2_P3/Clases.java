package ISOFT2.Teorico2_P3;

public class Clases {
    public class Cliente{
        String nombre;
        int edad;
        boolean casaPadres;
        boolean trabajando;
        public Cliente(int edad, boolean casaPadres, boolean trabajando){
            this.trabajando = trabajando;
            this.casaPadres = casaPadres;
            try {
                this.edad = edad;
                if (this.edad <= 0){
                    throw new InvalidAgeException("La edad solo puede ser un valor positivo.");
                }
            } catch (InvalidAgeException iae) {
                System.out.println(iae.getMessage());
            }
        }
        public int getEdad(){
            return edad;
        }
        public boolean getTrabajando(){
            return trabajando;
        }
        public boolean getCasaPadres(){
            return casaPadres;
        }
    }

    public static class InvalidAgeException extends Exception{
		private static final long serialVersionUID = 1L;
		public InvalidAgeException(String msg){
            super(msg);
        }
    }
}
