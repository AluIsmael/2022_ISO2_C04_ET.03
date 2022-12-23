package ISOFT2.Teorico2_P3;

public class Clases {
    public class Cliente{
        String nombre;
        int edad;
        boolean casaPadres;
        boolean trabajando;
        public Cliente(String nombre, int edad, boolean casaPadres, boolean trabajando){
            this.nombre = nombre;
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
        public String getNombre(){
            return nombre;
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
        public void setNombre(String nombreNew){
            nombre = nombreNew;
        }
        public void setEdad(int edadNew){
            edad = edadNew;
        }
        public void setTrabajando(boolean trabajandoNew){
            trabajando = trabajandoNew;
        }
        public void setCasaPadres(boolean casaPadresNew){
            casaPadres = casaPadresNew;
        }
    }

    public class InvalidAgeException extends Exception{
		private static final long serialVersionUID = 1L;
		public InvalidAgeException(String msg){
            super(msg);
        }
    }
}
