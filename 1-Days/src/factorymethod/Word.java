package factorymethod;

public class Word implements Document {
	
	@Override
	public DEnum getDocumentType() {
		return DEnum.word;
	}
	
}
