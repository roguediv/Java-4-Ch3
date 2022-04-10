
public class CoinCurrency implements Deposit{

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
	
	public CoinCurrency(String name, Double value) {
		this.name = name;
		this.value = value;
	}

}
