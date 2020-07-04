package abstractfactory;

public class Test {

	public static void main(String[] args) {
		
		AbstractFactory fc = new ConcreateFactoryImpl();
		call(fc);
		System.out.println("==========================");
		fc = new ConcreateFactoryImplYesil();
		call(fc);

	}
	
	
	public static void call(AbstractFactory fc) {
		Elma elma = fc.getElma();
		Biber biber = fc.getBiber();
		System.out.println(elma.getType());
		System.out.println(biber.getType());
	}
	

}
