class ListsOfExceptionsTest {
	public static void main(String[] args) {
		ListsOfExceptions lE = new ListsOfExceptions();
		try{
			lE.listsOfExceptionsTest();
			System.out.println("The codes work!");
		} catch (ClassCastException e) {
			System.out.println("Something wrong!");
		}
	}
}