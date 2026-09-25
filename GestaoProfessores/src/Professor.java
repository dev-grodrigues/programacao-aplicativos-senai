
abstract class Professor {
	private String matricula;
	private String nome;
	private int horasSemanais;
	private double salarioBase;
	public Professor(String nome, String matricula, int horasSemanais, double salarioBase) {
		super();
		Professores.getTotalProfessores();
		this.nome = nome;
		this.matricula = matricula;
		this.horasSemanais = horasSemanais;
		this.salarioBase = salarioBase;
	}
	
	abstract boolean elegivelAfastamento();
	abstract double calcularSalarioFinal();
	abstract void tipoProfessor();
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getHorasSemanais() {
		return horasSemanais;
	}
	public void setHorasSemanais(int horasSemanais) {
		this.horasSemanais = horasSemanais;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
}
