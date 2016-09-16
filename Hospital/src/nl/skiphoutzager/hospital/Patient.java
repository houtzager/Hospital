package nl.skiphoutzager.hospital;

import java.time.LocalDate;

public class Patient extends Observable {
	private String name;
	private LocalDate birthDate;

	private int bloodPressure = 100;
	private int heartbeat = 80;
	private double temperature = 37;

	public Patient(String name, LocalDate birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public int getBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(int bloodPressure) {
		setChanged();
		this.bloodPressure = bloodPressure;
		notifyObservers(bloodPressure);
	}

	public int getHeartbeat() {
		return heartbeat;
	}

	public void setHeartbeat(int heartbeat) {
		this.heartbeat = heartbeat;
		setChanged();
		notifyObservers(heartbeat);
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		setChanged();
		this.temperature = temperature;
		notifyObservers(temperature);
	}

}
