package springboot.devtools.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import springboot.devtools.entities.Book;

@Component
public class BookService {

	private static List<Book> list = new ArrayList<>();

	static {
		list.add(new Book(1, "Static block runs when class gets executed", "Vidur"));
		list.add(new Book(2, "Trying", "Agarwal"));
		list.add(new Book(3, "CRUD", "Vidur Agarwal"));
	}

	public List<Book> getAllBooks() {
		return list;
	}

	public Book getBookById(int id) {
		Optional<Book> optionalBook = list.stream().filter(e -> e.getId() == id).findFirst();

		return optionalBook.orElse(null); // or handle as needed
	}

	public void addBook(Book book) {
		list.add(book);
	}

	public void deleteBook(Book book) {
			list.removeIf(e -> e.getId() == book.getId());
	}
}