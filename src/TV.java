
public class TV {
	private double tamanho;
	private String marca;
	private boolean controle;
	
	private boolean ligada;
	private int volume;
	
	String getMarca() {
		return this.marca;
	}
	
	void setMarca(String novamarca) {
		this.marca = novamarca;
	}
	
	void liga() {
		this.ligada = true;
	}
	
	void desliga() {
		this.ligada = false;
	}
	
	void aumentaVolume() {
		this.volume++;
	}
	
	void diminuiVolume() {
		this.volume--;
	}
	
	void mostraEstado() {
		if (this.ligada) {
			System.out.println("A TV est� ligada");
		} else {
			System.out.println("A TV est� desligada");
		}
		
		System.out.println("O volume � " + this.volume);
	
	}
	
}
