package lab_12;

interface Database {
	void saveData(String data);
}

class SqlDatabase implements Database {
	@Override
	public void saveData(String data) {
		System.out.println("Saving data to MySql Database: " + data);
	}
}

class MongoDbDatabase implements Database {
	@Override
	public void saveData(String data) {
		System.out.println("Saving data to MongoDb Database: " + data);
	}
}

class UserRegistration {
	private Database dbService;

	public UserRegistration(Database dbService) {
		this.dbService = dbService;
	}

	//
	public void registerUser(String username) {
		System.out.println("Register User: " + username);
		dbService.saveData(username);
	}
}

public class PracticeTask_01 {
	public static void main(String args[]) {
		Database db = new MongoDbDatabase();
		UserRegistration ur = new UserRegistration(db);
		ur.registerUser("ALi Akbar");
		Database db2 = new SqlDatabase();
		UserRegistration ur2 = new UserRegistration(db2);
		ur2.registerUser("Zainab Fatima");
	}
}
