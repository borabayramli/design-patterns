package state;

public class EngineOnState implements State {

	@Override
	public void on(Engine engine) {
		System.out.println("Engine Starting...");
	}

	@Override
	public void of(Engine engine) {
		engine.setState(new EngineOffState());
		System.out.println("Engine Stoping...");
	}

	
	
}
