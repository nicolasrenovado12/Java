package model.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private List<Installment> installmentList = new ArrayList<Installment>();

	public double processContract(Contract contract, int months) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		double amount = 0;
		OnlinePaymentService paymentService = new PaypalService(); 
		
		Calendar c = Calendar.getInstance();
		c.setTime(contract.getDate());


		for(int i=months-1; i>=0; i-=1) {
		 	amount = contract.getTotalValue() / months;
			amount +=  paymentService.interest(contract.getTotalValue() / months, months-i);		
			amount += paymentService.paymentFee(amount);
			c.add(Calendar.MONTH, 1);  
			Date dueDate = c.getTime();

			installmentList.add(new Installment(dueDate, amount));
		}
		
	
		
		return amount;
	}

	public List<Installment> getInstallmentList() {
		return installmentList;
	}

	public void setInstallmentList(List<Installment> installmentList) {
		this.installmentList = installmentList;
	}
}
