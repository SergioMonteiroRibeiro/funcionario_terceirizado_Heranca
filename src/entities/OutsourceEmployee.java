package entities;

public class OutsourceEmployee extends Employee{

	private Double additionalCharge;

	public OutsourceEmployee() {
		super();
	}

	public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public Double payment() {
		return (hours * valuePerHour + (additionalCharge * 1.10));
	}

	@Override
	public String toString() {
		return 
				name + " - $ " + String.format("%.2f", payment());
	}
	
	
}
