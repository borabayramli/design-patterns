package abstractfactory;

public class ConcreateFactoryImplYesil implements AbstractFactory {

	@Override
	public Elma getElma() {
		return new YesilElma();
	}

	@Override
	public Biber getBiber() {
		return new YesilBiber();
	}

	
	
}
