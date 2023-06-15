package model;

public class Aluno {
  private String matricula, nome, endereco, telefone, cursoAprovado;

  public Aluno() {
	super();
 }

public Aluno(String matricula, String nome, String endereco, String telefone, String cursoAprovado) {
	super();
	this.matricula = matricula;
	this.nome = nome;
	this.endereco = endereco;
	this.telefone = telefone;
	this.cursoAprovado = cursoAprovado;
}

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

public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public String getTelefone() {
	return telefone;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}

public String getCursoAprovado() {
	return cursoAprovado;
}

public void setCursoAprovado(String cursoAprovado) {
	this.cursoAprovado = cursoAprovado;
}
  
  

}
