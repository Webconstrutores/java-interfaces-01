package model.entities;

public class Invoice {
	private Double basicPayment;
	private Double tax;
	
	public Invoice() {
		
	}

	public Invoice(Double basicPaymentDouble, Double tax) {
		this.basicPayment = basicPaymentDouble;
		this.tax = tax;
	}

	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double basicPaymentDouble) {
		this.basicPayment = basicPaymentDouble;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	
	public Double getTotalPayment() {
		return getBasicPayment() + getTax();
	}
}
