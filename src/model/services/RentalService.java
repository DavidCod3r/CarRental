package model.services;

import model.entities.CarRental;

public class RentalService {
	
	private Double pricePerDay;
	private Double pricePerHour;

	private BrazilTaxService taxService;

	public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
//	public Double getPricePerDay() {
//		return pricePerDay;
//	}
//	
//	public Double getPricePerHour() {
//		return pricePerHour;
//	}
//	
//	public BrazilTaxService getTaxService() {
//		return taxService;
//	}
	
	public void processInvoice(CarRental carRental) {
		
	}
	
	
	
}
