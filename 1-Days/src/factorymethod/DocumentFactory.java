package factorymethod;

public class DocumentFactory {

	public static Document createDocument( final DEnum type ) {
		if ( type == DEnum.pdf ) {
			return new Pdf();
		}else if ( type == DEnum.word ) {
			return new Word();
		}else {
			throw new RuntimeException("Doküman türü hatası");
		}
	}
	
}
