package hashMap.dto;

public class Employee {

	private int id;
	private String fName;
	private String mName;
	private String lName;
	private String deptName;
	private String city;
	
	
	
	public Employee(int id, String fName, String mName, String lName, String deptName, String city) {
		super();
		this.id = id;
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.deptName = deptName;
		this.city = city;
	}
	
	public int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	//i am allowing others to read only the fullName but allowing to modify individual sections of Name field.
	protected String getUserName() {
		return new StringBuilder().append(fName).append("-").append(mName).append("-").append(lName).toString();
	}
	protected void setfName(String fName) {
		this.fName = fName;
	}
	protected void setmName(String mName) {
		this.mName = mName;
	}
	protected void setlName(String lName) {
		this.lName = lName;
	}
	protected String getDeptName() {
		return deptName;
	}
	protected void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	protected String getCity() {
		return city;
	}
	protected void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", full name=");
		builder.append(fName);
		builder.append(" ");
		builder.append(mName);
		builder.append(" ");
		builder.append(lName);
		builder.append(", deptName=");
		builder.append(deptName);
		builder.append(", city=");
		builder.append(city);
		builder.append("]");
		return builder.toString();
	}
	
	
}
