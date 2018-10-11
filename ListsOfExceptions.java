import java.util.*;
class ClassCastException extends Exception{}
public class ListsOfExceptions {
	public boolean listsOfExceptionsTest() throws ClassCastException {
		Scanner scanner = new Scanner();
		boolean hasPass = scanner.nextBoolean();
		if (hasPass) {
			ArrayList<Object> myList = new ArrayList<Object>();
			myList.add("13");
			myList.add("hello world");
			myList.add(48);
			myList.add("Goodbye World");
			return true;
		}
		throw new ClassCastException();	

		if (hasPass) {
			for(int i = 0; i < myList.size(); i++) {
				Integer castedValue = (Integer) myList.get(i);
			}
			return true;
		}
		throw new ClassCastException();
	}
}