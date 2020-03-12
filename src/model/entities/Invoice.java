package model.entities;

public class Invoice {
	
	private Double basicPyament;
	private Double tax;
	
	
	public Invoice(Double basicPyament, Double tax) {
		this.basicPyament = basicPyament;
		this.tax = tax;
	}
	
	public Double getBasicPyament() {
		return basicPyament;
	}
	
	public Double getTax() {
		return tax;
	}
	
	public Double getTotalPayment() {
		return getBasicPyament() * getTax();
	}

}
