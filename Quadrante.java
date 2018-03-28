public class Quadrante {

	private String estado;
	private String tipo;

	public Quadrante() {
		this.estado = "Vazio";
		this.tipo = "   ";
	}
	public Quadrante(String tipo){
		this.estado = "Vazio";
		this.tipo = " "+tipo+" ";
	}

	public void preencher() {
		this.estado = "Preenchido";
	}
	public boolean isPreenchido() {
		return this.estado.equals("Preenchido");
	}
	public String getTipo(){
		return this.tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = " "+tipo+" ";
	}

}