class Student  {
	private String name;
	private String id;
	private int credits;
	private double points;
	
	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student tempt = (Student) obj;
			if(this.id.equals(tempt.getId())) {
				return true;
			}
		}
		return false;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
}