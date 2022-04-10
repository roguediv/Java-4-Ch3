
public class ValuableObject implements Deposit{

	private String name;
	private double value;
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public Double getValue() {
		// TODO Auto-generated method stub
		return this.value;
	}
	
	public ValuableObject(String name, Double value) {
		this.name = name;
		this.value = value;
	}

}
