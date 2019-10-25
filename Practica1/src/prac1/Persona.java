package prac1;

public class Persona {
		private String name;
		private int edad;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		
		public Persona(String name, int edad) {
				this.name=name;
				this.edad=edad;
		}
		@Override
		public String toString() {
			return "Persona :name= " + name + "/ edad=" + edad;
		}
		
		
}
