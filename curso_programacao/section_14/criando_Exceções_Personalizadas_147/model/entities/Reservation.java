package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation(Integer roomNumber, Date checkin, Date checkout) throws DomainException  {
		 
		this.roomNumber = roomNumber;
		this.checkIn = checkin;
		this.checkOut = checkout;
	}

	public void verifyError() throws DomainException {
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Error in reservation: Check-out date must be after check-in date");
		}
	}
	
	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkIn;
	}

	public Date getCheckout() {
		return checkOut;
	}

	public void updateDates(Date checkIn, Date checkOut) throws DomainException {
		
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException( "Error in reservation: Reservation dates for update must be future dates ");
		} 
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Error in reservation: Check-out date must be after check-in date");
		} 
		this.checkIn = checkIn;
		this.checkOut = checkOut;

		
	}
	
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

	@Override
	public String toString() {
		return "Reservation: Room " + roomNumber + ", check-in: " + sdf.format(checkIn) + ", check-out: " + sdf.format(checkOut) + ", " + duration() + " nights";
	}
	

		
}
