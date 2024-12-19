package entities;

import java.util.Objects;

public class Course {

	private int studentNumbers;

	public Course(int studentNumbers) {
		super();
		this.studentNumbers = studentNumbers;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentNumbers);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return studentNumbers == other.studentNumbers;
	}

	
	
	
}
