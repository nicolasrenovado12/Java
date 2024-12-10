package model.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.OnlinePaymentService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {

		OnlinePaymentService paymentService = new PaypalService();
		ContractService service = new ContractService();
		Scanner sc = new Scanner(System.in);
		Enum a = Enum.valueOf(null, null);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Enter the contract details: ");	
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/mm/yyyy): ");
		String dateString = sc.next();
		Date  date = sdf.parse(dateString);
		System.out.print("Enter contract value: ");
		double totalValue = sc.nextDouble();
		System.out.print("enter number of installments: ");
		int months  = sc.nextInt();
		
		Contract contract = new Contract(number, date, totalValue);
		service.processContract(contract, months);

		System.out.println("Installments: ");
		for (Installment installment : service.getInstallmentList()) {
			System.out.println(installment.toString());
		}
	}
	
}
