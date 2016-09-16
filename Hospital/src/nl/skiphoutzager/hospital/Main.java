package nl.skiphoutzager.hospital;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		DoctorPager doctorPager = new DoctorPager();
		HealthMonitor monitor = new HealthMonitor();

		Patient harry = new Patient("Harry",LocalDate.of(1998, 4, 3));
		harry.addObserver(doctorPager);
		harry.addObserver(monitor);
		harry.setHeartbeat(20);


//		Patient bob = new Patient("Bob",LocalDate.of(1987, 12, 14));
//		bob.addObserver(monitor);
//
//		bob.addObserver(doctorPager);
//		bob.setHeartbeat(20);

		harry.setTemperature(37.4);

	}

}
