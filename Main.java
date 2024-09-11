/**
 * Main.java - Driver class to demonstrate revised historical examples
 * 
 * @author ???
 * @version ???
 */

public class Main {
	public static void main(String[] args) {
		String description = "The 1622 Indian Massacre is an event where the tribes of the Powhatan Confederacy, attacked the English colonist out of no where for no reason. Even though the colonists where very nice they were masscred the planned attack made by their leader Opchanacanough and his brother Opitchapam.";
		Date eventDate = new Date(3, 22, 1622);
		HistoricalEvent tulsaRiot = new HistoricalEvent(description, eventDate);
		tulsaRiot.teach();
		
		
		String revisedDescription = "The London Company's primary concern was the survival of the colony. Due to the interests of the company, the colonists would be required to maintain civil relations with the Powhatan. The Powhatan and the English realized that they could benefit from each other through trade once peace was restored. In exchange for food, the chief asked the colonists to provide him with metal hatchets and copper.[7] Unlike John Smith, other early leaders of Virginia, such as Thomas Dale and Thomas Gates, based their actions on different thinking. They were military men and considered the Powhatan Confederacy as essentially a 'military problem''The Powhatan peoples concluded that the English were not settling in Jamestown for the purposes of trade but rather to 'possess' the land. As Chief Powhatan said:'Your coming is not for trade, but to invade my people and possess my country…Having seen the death of all my people thrice… I know the difference of peace and war better than any other Country.'",
			citation = "https://en.wikipedia.org/wiki/Indian_massacre_of_1622";
			RevisedEvent tulsaMassacre = new RevisedEvent(description, eventDate,
			revisedDescription, citation);
			tulsaMassacre.teach();
		

		// int[] array = { 4, 7, 2, 9, 3, 1, 5, 8 };
		// //Date[] 

		// // Bubble sort: https://en.wikipedia.org/wiki/Bubble_sort  //
		// for (int j = 0; j < array.length; j++) {
		// 	for (int i = 0; i < array.length - 1; i++) {
		// 		if (array[i] > array[i + 1]) {
		// 			int temp = array[i];
		// 			array[i] = array[i + 1];
		// 			array[i + 1] = temp;
		// 		}
		// 	}
		// }

		// for (int i = 0; i < array.length; i++) {
		// 	System.out.print(array[i] + ", ");
		// }
	}
}