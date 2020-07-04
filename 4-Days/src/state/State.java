package state;

public interface State {
	
	void on(Engine engine);
	void of(Engine engine);

}
