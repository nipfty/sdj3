import Model.*;
public class Test {
public static void main(String[] args) throws ClassNotFoundException {
	
	DBServer dbs = new DBServer();
	Car car = new Car("12991480ash12",2000,"name");
	dbs.addCarToDB(car);
}
}
