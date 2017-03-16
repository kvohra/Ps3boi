package pkgLibrary;

public class BookException extends Exception {
	private Book book;
	
	public BookException(){
		super();
	}
	public BookException(Book book){
		super("No Good");
		this.book=book;
	}}
	
