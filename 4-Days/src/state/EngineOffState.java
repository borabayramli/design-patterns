package state;

public class EngineOffState implements State {

	@Override
	public void on(Engine engine) {
		engine.setState(new EngineOnState());
		System.out.println("Engine Start()");
	}

	@Override
	public void of(Engine engine) {
		System.out.println("Engine Stop()");
	}

	
}
