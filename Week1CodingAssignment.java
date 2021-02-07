
public class Week1CodingAssignment {

	public static void main(String[] args) {
		
				double itemPrice1 = 10.00;
				double itemPrice2 = 5.00;
				double amountInWallet1 = 100.00;
				double amountInWallet2 = 20.00;
				int numberOfFriends1 = 1;
				int numberOfFriends2 = 2;
				int age1 = 50;
				int age2 = 11;
				String firstName1 = "Melissa";
				String firstName2 = "Michael";
				String lastName1 = "Bloom";
				String lastName2 = "Marchand";
				char middleInitial1 = 'B';
				char middleInitial2 = 'P';
				System.out.println(amountInWallet1 - itemPrice1);
				System.out.println(amountInWallet2 - itemPrice2);
				double newAmountWallet1 = amountInWallet1 - itemPrice1;
				double newAmountWallet2 = amountInWallet2 - itemPrice2;
				System.out.println("The new amount in your wallet after buying the item is $" + newAmountWallet1);
				System.out.println("The new amount in your wallet after buying the item is $" + newAmountWallet2);
				System.out.println(age1 * numberOfFriends2);
				System.out.println(age2 * numberOfFriends1);
				int newFriends1 = age1 * numberOfFriends2;
				int newFriends2 = age2 * numberOfFriends1;
				System.out.println("The number of friends Melissa has made each year is " + newFriends1);
				System.out.println("The number of friends Michael has made each year is " + newFriends2);
				System.out.println(firstName1 + " " + middleInitial1 + " " + lastName1);
				System.out.println(firstName2 + " " + middleInitial2 + " " + lastName2);
				String fullName1 = firstName1 + " " + middleInitial1 + " " + lastName1;
				String fullName2 = firstName2 + " " + middleInitial2 + " " + lastName2;
				System.out.println("Her full name is " + fullName1);
				System.out.println("His full name is " + fullName2);
	}

}
