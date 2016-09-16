package nl.skiphoutzager.hospital;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DoctorPager implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		Patient patient = (Patient) o;
		long age = ChronoUnit.YEARS.between(patient.getBirthDate(), LocalDate.now());
		boolean somethingBadHappened = false;
		if (patient.getHeartbeat() < (220 - age) * 0.15) {
			System.out.println(patient.getName() + "'s heart beat is too low!");
			somethingBadHappened = true;
		}
		if (somethingBadHappened)
			System.out
					.println("Details:\n" + "\tHeart Beats/min: " + patient.getHeartbeat() + "\n" + "\tBlood Pressure: "
							+ patient.getBloodPressure() + "\n" + "\tTemperature: " + patient.getTemperature());
	}

}
