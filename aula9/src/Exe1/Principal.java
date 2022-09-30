package Exe1;

public class Principal {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		
		agenda.armazenarPessoa("João", 25, 1.78);
		agenda.armazenarPessoa("Jairo", 24, 1.69);
		agenda.armazenarPessoa("Diego", 25, 1.69);
		agenda.armazenarPessoa("Jucinei", 32, 1.65);
		agenda.armazenarPessoa("Julia", 20, 1.63);
		agenda.armazenarPessoa("Astolfo", 24, 1.66);
		agenda.armazenarPessoa("Lexar", 80, 1.95);
		agenda.armazenarPessoa("Josh", 55, 1.20);
		agenda.armazenarPessoa("Mario", 30, 1.77);
		agenda.armazenarPessoa("Claudinho", 90, 1.54);
		
		agenda.imprimeAgenda();
		agenda.removerPessoa("Jairo");
		

	}

}
