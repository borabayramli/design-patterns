package state;

public class Engine {

	private State state;
	
	public Engine() {
		setState(new EngineOffState());
	}
	
	public void start() {
		getState().on(this);
	}
	
	public void stop() {
		getState().of(this);
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	
	
}
