import java.util.Objects;

public class Record {
	
	final int MIN_ID = 100;
	final int MAX_ID = 10000;
	final int MIN_RECORD_LENGTH = 1; 
	final int MIN_RECORD_RANKING = 1;
	final int MAX_RECORD_RANKING = 6;
	
	private int id;
	private String recordTitle;
	private String singerName;
	private int recordLength;
	private int recordRanking;
	
	public Record(String recordTitle, String singerName, int recordLength, int recordRanking) {
		setId();
		setRecordTitle(recordTitle);
		setSingerName(singerName);
		setRecordLength(recordLength);
		setRecordRanking(recordRanking);
	}

	/**
	 * @return id of record
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return record title
	 */
	public String getRecordTitle() {
		return recordTitle;
	}

	/**
	 * @return singer name
	 */
	public String getSingerName() {
		return singerName;
	}

	/**
	 * @return length of record
	 */
	public int getRecordLength() {
		return recordLength;
	}

	/**
	 * @return record ranking
	 */
	public int getRecordRanking() {
		return recordRanking;
	}

	/**
	 * @param id
	 */
	public void setId() {
		this.id = (this.id < MIN_ID) ?
				(int)((Math.random()*(MAX_ID-MIN_ID+1)) + MIN_ID) : this.id;
	}

	/**
	 * @param recordTitle
	 */
	public void setRecordTitle(String recordTitle) {
		this.recordTitle = (recordTitle == "" || Objects.isNull(recordTitle)) ?
				"Unknown title" : recordTitle;
	}

	/**
	 * @param singerName
	 */
	public void setSingerName(String singerName) {
		this.singerName = (singerName == "" || Objects.isNull(singerName)) ?
				"Unknown singer name" : singerName;
	}
		
	/**
	 * @param recordLength
	 */
	public void setRecordLength(int recordLength) {
		this.recordLength = (recordLength < MIN_RECORD_LENGTH) ? MIN_RECORD_LENGTH : recordLength;
	}

	/**
	 * @param recordRanking
	 */
	public void setRecordRanking(int recordRanking) {
		if (recordRanking < MIN_RECORD_RANKING) {
			this.recordRanking = MIN_RECORD_RANKING;
		} else if (recordRanking > MAX_RECORD_RANKING) {
			this.recordRanking = MAX_RECORD_RANKING;
		} else {
			this.recordRanking = recordRanking;
		}
	}

}
