package nl.skiphoutzager.hospital;

public class HealthMonitor implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		Patient patient = (Patient) o;
		System.out.println("Updating heartbeat: " + patient.getName() + ", hb" + patient.getHeartbeat() + ", bp" + patient.getBloodPressure() + ", t" + patient.getTemperature());
	}

}
