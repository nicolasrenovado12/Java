package model.entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Installment {

	public Date dueDate;
	public Double amount;
	public SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public Installment(Date dueDate, Double amount) {
		super();
		this.dueDate = dueDate;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return  sdf.format(dueDate) + " - " + amount ;
	}
	
	
	
	
	
	
}
