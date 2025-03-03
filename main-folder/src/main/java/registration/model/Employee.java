package registration.model;


public class Employee {
    private String Username;
    private String Password;
    private String EmployeeID;
    private String EmployeeName;
    private String EmployeeAge;
    private String EmployeeAddress;
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(String employeeID) {
		EmployeeID = employeeID;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getEmployeeAge() {
		return EmployeeAge;
	}
	public void setEmployeeAge(String employeeAge) {
		EmployeeAge = employeeAge;
	}
	public String getEmployeeAddress() {
		return EmployeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		EmployeeAddress = employeeAddress;
	}
}