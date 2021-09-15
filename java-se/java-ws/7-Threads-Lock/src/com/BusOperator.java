package com;

class Reservation implements Runnable {
	int noOfSeats = 1;
	int wantedSeats;

	public Reservation(int wantedSeats) {
		this.wantedSeats = wantedSeats;
	}

	@Override
	public void run() {
		bookTicket();
	}

	public void bookTicket() { // lock
		String tname = Thread.currentThread().getName();
		System.out.println("Available seats : " + noOfSeats + " for " + tname);
		System.out.println(">>> Trying to Book " + wantedSeats + " for " + tname);

		synchronized (this) {
			if (noOfSeats >= wantedSeats) {
				System.out.println(">>> Booking " + wantedSeats + " Seats for " + tname);

				System.out.println(wantedSeats + " Booked for " + tname);
				noOfSeats = noOfSeats - wantedSeats;
				System.out.println("Available seats : " + noOfSeats);
			} else {
				System.out.println("No Seats are avaible. Avaible seats: " + noOfSeats);
			}
		}
	}
}

public class BusOperator {
	public static void main(String[] args) {
		Reservation passenger = new Reservation(1);
		Thread t1 = new Thread(passenger, "Passenger-1");
		Thread t2 = new Thread(passenger, "Passenger-2");
		t1.start();
		t2.start();
	}
}
