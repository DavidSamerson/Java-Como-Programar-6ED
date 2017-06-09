package polimorfismo.Geral;

public class Invoice implements Payable {
	
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double princePerItem;

	public Invoice(String part, String description, int count, double price) {
		// TODO Auto-generated constructor stub
		partNumber = part;
		partDescription = description;
		setQuantity(count);
		setPrincePerItem(price);
	}

	public String getPartNumber() {
		return partNumber;
	}



	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}



	public String getPartDescription() {
		return partDescription;
	}



	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity < 0 ? 0 : quantity;
	}



	public double getPrincePerItem() {
		return princePerItem;
	}



	public void setPrincePerItem(double princePerItem) {
		this.princePerItem = princePerItem < 0.0 ? 0.0 : princePerItem;
	}
	
	public String toString(){
		return String.format("%s: \n%s: %s (%s) \n%s: %d\n%s: $%,.2f","invoice", "Part Number", getPartNumber()
				, getPartDescription(), "Quantity", getQuantity(), "price per item", getPrincePerItem());
	}

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
