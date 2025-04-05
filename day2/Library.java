package week2.day2;

public class Library {
	
	public String addBook(String bookTittle) {
		
		System.out.println(bookTittle);
		System.out.println("Book added successfully");
		return bookTittle;
	}

	public void issueBook() {
	
		System.out.println("Book issued successfully");
	}
	
	public static void main(String[] args) {
		
		Library L=new Library();
		L.addBook("Murder Mystry");
		L.issueBook();

	}

}
