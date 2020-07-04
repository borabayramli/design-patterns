package abstractfactory;

public class ConcreateFactoryImpl implements AbstractFactory {

	@Override
	public Elma getElma() {
		return new KirmiziElma();
	}

	@Override
	public Biber getBiber() {
		return new SivriBiber();
	}

	
	
}
