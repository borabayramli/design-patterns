package builder;

public class SiparisManager {

	private SiparisBuilder builder = null;
	
	public Araba createOrder( final String marka, final String model, final String renk, final int beygirGucu ) {
		
		if (marka.equals("ford")) {
			builder = new FordSiparisBuilder();
		}else if (marka.equals("audi")) {
			builder = new AudiSiparisBuilder();
		}
		
		builder.setModel(model);
		builder.setMarka(marka);
		builder.setRenk(renk);
		builder.setBeygirGucu(beygirGucu);
		
		return builder.getAraba();
	}
	
	
	public void write() {
		System.out.println("Marka : " + builder.getAraba().getMarka());
	}
	
}
