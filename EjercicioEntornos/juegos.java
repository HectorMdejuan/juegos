package version1;

public class juegos implements Entregable {
	juegos(){
		Horas_es=10;
		entregado = false;
	}
	
	juegos(String titulo,int Horas_es){
		this.titulo=titulo;
		this.Horas_es=Horas_es;
		
	}
	juegos(String titulo,int Horas_es,String genero,String compañia){
		this.titulo=titulo;
		this.Horas_es=Horas_es;
		this.genero=genero;
		this.compañia=compañia;
	}
	
	
	private String titulo;
	private int Horas_es;
	private boolean entregado;
	private String genero;
	private String compañia;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getHoras_es() {
		return Horas_es;
	}
	public void setHoras_es(int horas_es) {
		Horas_es = horas_es;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCompañia() {
		return compañia;
	}
	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	@Override
	public void entregar() {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void devolver() {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public boolean isEntregado() {
		// TODO Apéndice de método generado automáticamente
		return false;
	}

	@Override
	public void compareTo(Object a) {
		// TODO Apéndice de método generado automáticamente
		
	}
	
	
	
	
	
	
	
	
	
}
