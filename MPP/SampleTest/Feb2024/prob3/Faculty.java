package MPP.SampleTest.Feb2024.prob3;

public class Faculty {
	private String name;
	private String officeNumber;
	private CheckoutRecord record;
	
	public Faculty(String name, String office, CheckoutRecord record) {
		this.name = name;
		this.officeNumber = office;
		this.record = record;
	}
	
	public String getName() {
		return name;
	}

	public String getOfficeNumber() {
		return officeNumber;
	}

	public CheckoutRecord getRecord() {
		return record;
	}
	
	public String toString() {
		return "{Name: " + name + "Overdue: " + record.getOverdueBooks() + "}";
	}
}
