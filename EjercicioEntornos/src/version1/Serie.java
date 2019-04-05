package version1;

public class Serie  implements Entregable{

	private String titulo;
	private int num_temporadas;//estimadas
	private boolean entregado;
	private String genero;
	private String creador;
	private int temporadas_reales;
	
	public Serie() {
		num_temporadas=3;
		entregado=false;
	}
	public Serie(String titulo, String creador) {
		this.titulo=titulo;
		this.creador=creador;
	}
	public Serie(String titulo, int num_temporadas,String genero, String creador) {
		this.titulo=titulo;
		this.num_temporadas=num_temporadas;
		this.genero=genero;
		this.creador=creador;
		
	}
	
	public void setTemporadas_reales(int temporadas_reales) {
		this.temporadas_reales=temporadas_reales;
	}
	public int getTemporadas_reales() {
		return temporadas_reales;
	}
	
	public void entregar() {
		entregado=true;
		
		
	}
	
	public void devolver() {
		entregado=false;
		
	}
	public boolean isEntregado() {
		return entregado;
	}
	
	public void compareTo(Serie a) {
	int temp=a.getNum_temporadas();
	if(temp>num_temporadas) {
		System.out.println("hay mas temporadas de las estimadas.");
	}else {
		if(temp==num_temporadas) {
			System.out.println("Hay tantas temporadas como se esperaban.");
		}else {
			System.out.println("Hay menos temporadas de las estimadas.");
		}
	}
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNum_temporadas() {
		return num_temporadas;
	}
	public void setNum_temporadas(int num_temporadas) {
		this.num_temporadas = num_temporadas;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	
	
}
