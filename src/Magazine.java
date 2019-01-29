/*
 * Name of the Student: Hongyun Du
 * Class: CS3345
 * Section:003
 * Semester: Fall 2018
 * Project 2
 */

public class Magazine extends IDedObject {
	private int magazineID;
	private String magazineName;
	private String publisherName;

	public Magazine() {
	}

	/*
	 * @id is the ID
	 * 
	 * @param mName is the magazine name
	 * 
	 * @param pName is the publisher name
	 */
	public Magazine(int id, String mName, String pName) {
		magazineID = id;
		magazineName = mName;
		publisherName = pName;
	}

	public int getID() {
		//return its ID
		return this.magazineID;
	}

	public void printID() {
		//print all three variables
		System.out.print("\t\t" + magazineID + "\n\t\t" + magazineName + "\n\t\t" + publisherName + "\n");
	}

}
