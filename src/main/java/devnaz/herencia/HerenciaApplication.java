package devnaz.herencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Crea una clase Persona con las siguientes variables:
// La edad
// El nombre
// El teléfono
// Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase
// tendrá la variable credito solo para esa clase.
// Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad,
// el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
// Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
// y con una variable salario que solo tenga la clase Trabajador.

@SpringBootApplication
public class HerenciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HerenciaApplication.class, args);
		Cliente cliente = new Cliente();
		cliente.edad = 22;
		cliente.nombre = "Jose Manuel";
		cliente.telefono = "4521313146";
		cliente.credito = 24;
		System.out.println(cliente.edad);
		System.out.println(cliente.nombre);
		System.out.println(cliente.telefono);
		System.out.println(cliente.credito);
		Trabajador trabajador = new Trabajador();
		trabajador.edad = 23;
		trabajador.nombre = "Elizabeth Conor";
		trabajador.telefono = "4521313146";
		trabajador.salario = 234;
		System.out.println(trabajador.edad);
		System.out.println(trabajador.nombre);
		System.out.println(trabajador.telefono);
		System.out.println(trabajador.salario);
	}

	static class Persona {
		int edad;
		String nombre;
		String telefono;

	}

	static class Cliente extends Persona {
		int credito;
	}

	static class Trabajador extends Persona {
		int salario;
	}
}
