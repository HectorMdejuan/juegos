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
	juegos(String titulo,int Horas_es,String genero,String compa�ia){
		this.titulo=titulo;
		this.Horas_es=Horas_es;
		this.genero=genero;
		this.compa�ia=compa�ia;
	}
	
	
	private String titulo;
	private int Horas_es;
	private boolean entregado;
	private String genero;
	private String compa�ia;
	
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
	public String getCompa�ia() {
		return compa�ia;
	}
	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}

	@Override
	public void entregar() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
	}

	@Override
	public void devolver() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
	}

	@Override
	public boolean isEntregado() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}

	@Override
	public void compareTo(Object a) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
	}
	
	
	
	
	
	
	
	
	
}
