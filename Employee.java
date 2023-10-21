import java.util.ArrayList;

public class Employee {
	public ArrayList <Automovel> automoveis;
	public Company companhia;
	public String name;
	

	public Employee(Company companhia, String name) {
		this.automoveis = new ArrayList();
		this.companhia = companhia;
		this.name = name;
	}
}
