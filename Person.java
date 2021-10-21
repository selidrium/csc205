class Person {
	
	String firstName;
	String lastName;
	String gender;
	String dateOfBirth;
	String occupation;

	int daysWorked;

	// methods
	public double getPaid(double pay, int daysWorked){
		this.daysWorked = daysWorked;
		// write the code to print the total pay
		var totalPay = 0.00;
		//write  the code here
		return totalPay;
	}

	public int bookHoliday(int hours){
		var holidays = 0;
		// assume 1 days is 8 hours of work
		// write the code, if the total hours worked greater than 40
		// then the person gets 1 hour of holiday

		return holidays;
	}
	public void getPayedTimeOff(int days){
		// assume 1 days is 8 hours of work
		// write the code, if the total hours worked greater than 40
		// then the person gets 2 hours of payed time off
	}

	// getter and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
}