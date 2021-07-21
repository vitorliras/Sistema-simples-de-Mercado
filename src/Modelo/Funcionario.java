package Modelo;

public abstract class Funcionario {
	
	private double salario;
	private int carga;
	private String nome;
	private int matricula;
	/*

	public Funcionario(double salario, int cargo, String nome, int matricula) {
		this.salario = salario;
		this.carga = cargo;
		this.nome = nome;
		this.matricula = matricula;
	}
	*/
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getCarga() {
		return carga;
	}
	public void setCarga(int cargo) {
		this.carga = cargo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
	
}
