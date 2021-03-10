import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Record[] records = new Record[7]; 
		
		records[0] = new Record("", "", -1, 7);
		records[1] = new Record(null, null, 0, 7);
		records[2] = new Record("title3", "daiki3", 100, 6);
		records[3] = new Record("Title4", "Daiki4", 98, 4);
		records[4] = new Record("Title5", "Daiki5", 100, 3);
		records[5] = new Record("Title6", "Daiki6", 100, 1);
		records[6] = new Record("Title7", "Daiki7", 300, 2);
		
		Scanner input = new Scanner(System.in);
		
		// find a record title user inputed.
		System.out.print("Please enter the title of record: ");
		String recordTitle = input.nextLine();
		int foundIndex = findRecordTitle(records, recordTitle); 
		if (foundIndex > 0) {
			System.out.println("Found " + recordTitle + " in the list. Its index is " + foundIndex);
		} else {
			System.err.println("Not Found " + recordTitle + " in the list.");
		}
		
		// print the record
		printRecord(records[0]);
		printRecord(records[1]);
		printRecord(records[2]);
		printRecord(records[3]);
		printRecord(records[4]);
		printRecord(records[5]);
		printRecord(records[6]);
		
		// print the length average
		System.out.println("The average of length is " + getLengthAverage(records));
		
		// print the ranking average
		System.out.println("The average of ranking is " + getRankAverage(records));
		
		input.close();
		
	}
	
	/**
	 * Print out the given record information
	 * @param record
	 */
	public static void printRecord(Record record) {
		
		System.out.println("Record information:");
		System.out.println("\tID: " + record.getId() + "\n\tTitle: " + record.getRecordTitle() + 
							"\n\tSinger name: " + record.getSingerName() + "\n\tLength: " + record.getRecordLength() +
							"\n\tRanking: " + record.getRecordRanking()); 
	}
	
	/**
	 * find record title from index and return index of the record
	 * @param records
	 * @param recordTitle
	 * @return index of record or -1(when no found title)
	 */
	public static int findRecordTitle(Record[] records, String recordTitle) {
		
		for (int i = 0; i < records.length; i++) {
			if (recordTitle.equalsIgnoreCase(records[i].getRecordTitle())) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * get a average of length
	 * @param records
	 * @return (double)length of average
	 */
	public static double getLengthAverage(Record[] records) {
		
		int sum = 0;
		for (int i = 0; i < records.length; i++) {
			sum += records[i].getRecordLength();
		}
		
		return (double)sum / (double)records.length;
	}

	
	/**
	 * get a average of ranking
	 * @param records
	 * @return (double) ranking of average
	 */
	public static double getRankAverage(Record[] records) {
		
		int sum = 0;
		for (int i = 0; i < records.length; i++) {
			sum += records[i].getRecordRanking();
		}
		
		return (double)sum / (double)records.length;
	}
	
}
