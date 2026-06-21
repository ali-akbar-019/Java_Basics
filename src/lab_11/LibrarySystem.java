package lab_11;

enum UserType {
	STUDENT, FACULTY, VISITOR
}

interface FineCalculator {
	double calculateFine(int daysLate);
}

class StudentFineCalculator implements FineCalculator {
	@Override
	public double calculateFine(int daysLate) {
		return daysLate * 5;
	}

}

class FacultyFineCalculator implements FineCalculator {
	@Override
	public double calculateFine(int daysLate) {
		return daysLate * 2;
	}

}

class VisitorFineCalculator implements FineCalculator {
	@Override
	public double calculateFine(int daysLate) {
		return daysLate * 10;
	}

}

class FineCalculatorFactory {
	public FineCalculator getFineCalculator(UserType type) throws Exception {
		switch (type) {
		case STUDENT:
			return new StudentFineCalculator();

		case FACULTY:
			return new FacultyFineCalculator();

		case VISITOR:
			return new VisitorFineCalculator();
		default:
			throw new Exception("Invalid User type");
		}

	}
}

interface BookOperation {
	void execute();
}

class IssueBookOperation implements BookOperation {
	@Override
	public void execute() {
		System.out.println("Book issued Successfully");
	}
}

class ReturnBookOperation implements BookOperation {
	@Override
	public void execute() {
		System.out.println("Book returned Successfully");
	}
}

class RemoveBookOperation implements BookOperation {
	@Override
	public void execute() {
		System.out.println("Book removed Successfully");
	}
}

class ReportManger {
	public void printReport(String category, double fine) {
		if (category.equals("REFERENCE")) {
			System.out.println("Reference book usage report generated.");
		} else {
			System.out.println("General book usage report generated");
		}
		System.out.println("Total Fine: " + fine);
	}
}

public class LibrarySystem {
	public static void main(String args[]) {
		FineCalculator fc = new StudentFineCalculator();
		double fine = fc.calculateFine(6);
		String category = "REFERENCE";
		BookOperation bo = new ReturnBookOperation();
		bo.execute();
		ReportManger rm = new ReportManger();
		rm.printReport(category, fine);
	}
}
