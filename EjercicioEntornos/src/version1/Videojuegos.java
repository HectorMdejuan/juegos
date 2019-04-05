package version1;

public class Videojuegos implements Entregable{
   
	private String titulo;
	private int horas_estimadas;
	private boolean entregado;
	private String genero;
	private String compañia;
	private int horas_reales;
	
	Videojuegos(){
		horas_estimadas=10;
		entregado = false;
	}
	
	Videojuegos(String titulo,int horas_estimadas){
		this.titulo=titulo;
		this.horas_estimadas=horas_estimadas;
		
	}
	Videojuegos(String titulo,int horas_estimadas,String genero,String compañia){
		this.titulo=titulo;
		this.horas_estimadas=horas_estimadas;
		this.genero=genero;
		this.compañia=compañia;
	}
	
	

	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getHoras_estimadas() {
		return horas_estimadas;
	}
	public void setHoras_estimadas(int horas_estimadas) {
		horas_estimadas = horas_estimadas;
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


	public void entregar() {
		entregado=false;
		
	}

	public void devolver() {
		entregado=true;
	}


	public boolean isEntregado() {
		return entregado;
	}
	public int getHoras_reales() {
		return horas_reales;
	}
	
	public void setHoras_reales(int horas_reales) {
		this.horas_reales=horas_reales; 
	}
		

	public void compareTo(Videojuegos a) {
		int horas=a.horas_estimadas;
		
		if(horas>a.getHoras_reales()) {
			System.out.println("hay mas temporadas de las estimadas.");
		}else {
			if(horas==a.getHoras_reales()) {
				System.out.println("Hay tantas temporadas como se esperaban.");
			}else {
				System.out.println("Hay menos temporadas de las estimadas.");
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
}

