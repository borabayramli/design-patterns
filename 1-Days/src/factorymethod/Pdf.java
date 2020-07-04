package factorymethod;

public class Pdf implements Document {

	@Override
	public DEnum getDocumentType() {
		return DEnum.pdf;
	}
	
	
	
}
