package entities;

public class Employee {
		private int id;
		private String nome;
		private float salario;
		
		public Employee(int id, String nome, float salario) {
			this.id = id;
			this.nome = nome;
			this.salario = salario;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public float getSalario() {
			return salario;
		}
		
		public void aumento (float porcentagem) {
			salario += salario * porcentagem / 100.0;
		}
		
		public String toString() {
			return id +
			", " +
			nome +
			", " +
			String.format("%.2f", salario);
		}
}
