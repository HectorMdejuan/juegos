package version1;

public class Serie  implements Entregable{

	private String titulo;
	private int num_temporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
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
	@Override
	public void entregar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void compareTo(Object a) {
		// TODO Auto-generated method stub
		
	}
	
}
