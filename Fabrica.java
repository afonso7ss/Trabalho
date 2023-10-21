
public class Fabrica {

	public static void main(String[] args) {
		Company companhia = new Company("Ford");
		Employee empregado = new Employee(companhia, "Afonso");
		Car carro = new Car("onix");
		Truck scania = new Truck("Scania");
		
		System.out.println(companhia.name);
	}
}
