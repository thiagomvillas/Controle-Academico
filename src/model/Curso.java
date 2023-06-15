package model;

public class Curso {
    private int codigo;
    private String descricao,coordenador;
    
	public Curso() {
		super();
	}

	public Curso(int codigo, String descricao, String coordenador) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.coordenador = coordenador;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(String coordenador) {
		this.coordenador = coordenador;
	}
    
	
    
}
