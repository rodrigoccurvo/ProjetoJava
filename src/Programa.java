
public class Programa {

	public static void main(String[] args) {
		
		
		int x;
		
		x = 8;
		
		TV tele1, tele2;
		
		tele1 = new TV();
		tele2 = new TV();
		
		tele1.setMarca("Sony");
		
		System.out.println(tele1.getMarca());
		
		tele2.liga();
		tele2.aumentaVolume();
		tele2.aumentaVolume();
		tele2.aumentaVolume();
		tele2.diminuiVolume();
		
		tele2.mostraEstado();
		
	}

}
