
public class Main {
	public static void main(String[] args) {
		Pessoa Pessoa1 = new Pessoa(1, "Nycolas", 16);
		Pessoa Pessoa2 = new Pessoa(2, "Joao", 15);
		Pessoa Pessoa3 = new Pessoa(3, "Lucas", 17);
		Endereco Endereco1 = new Endereco(1, "rua 25 de dezembro", "flor de napolis", 60);
		Endereco Endereco2 = new Endereco(2, "rua do cara la", "kobrassol", 201);
		Endereco Endereco3 = new Endereco(3, "rua q tbm n sei o nome", "nem sei", 100);
		System.out.println("O nome dele é " + Pessoa1.getNome());
		System.out.println("Ele tem " + Pessoa1.getIdade() + " anos");
		System.out.println("A rua dele é " + Endereco1.getRua());
		System.out.println("O bairro dele é " + Endereco1.getBairro());
		System.out.println("O numero da casa dele é " + Endereco1.getNumero());
		System.out.println("O nome dele é " + Pessoa2.getNome());
		System.out.println("Ele tem " + Pessoa2.getIdade() + " anos");
		System.out.println("A rua da dele é " + Endereco2.getRua());
		System.out.println("O bairro dele é " + Endereco2.getBairro());
		System.out.println("O numero da casa dele é " + Endereco2.getNumero());
		System.out.println("O nome dele é " + Pessoa3.getNome());
		System.out.println("Ele tem " + Pessoa3.getIdade() + " anos");
		System.out.println("A rua dele é " + Endereco3.getRua());
		System.out.println("O bairro dele é " + Endereco3.getBairro());
		System.out.println("O numero da casa dele é " + Endereco3.getNumero());
	}
}
