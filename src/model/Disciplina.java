package model;

public class Disciplina extends Curso {
  private int cargaHoraria;
  private String ementa, bibliografia, prerequisitos;
  
  public Disciplina() {
	super();
}

  public Disciplina(int codigo, String descricao, String coordenador, int cargaHoraria, String ementa,
		String bibliografia, String prerequisitos) {
	super(codigo, descricao, coordenador);
	this.cargaHoraria = cargaHoraria;
	this.ementa = ementa;
	this.bibliografia = bibliografia;
	this.prerequisitos = prerequisitos;
}

public int getCargaHoraria() {
	return cargaHoraria;
}

public void setCargaHoraria(int cargaHoraria) {
	this.cargaHoraria = cargaHoraria;
}

public String getEmenta() {
	return ementa;
}

public void setEmenta(String ementa) {
	this.ementa = ementa;
}

public String getBibliografia() {
	return bibliografia;
}

public void setBibliografia(String bibliografia) {
	this.bibliografia = bibliografia;
}

public String getPrerequisitos() {
	return prerequisitos;
}

public void setPrerequisitos(String prerequisitos) {
	this.prerequisitos = prerequisitos;
} 
  
  
}
