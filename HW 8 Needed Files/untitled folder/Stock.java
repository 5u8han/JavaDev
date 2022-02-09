import java.math.BigDecimal;

public class Stock implements ISellable {

	private int shares;
	private String  symbol;
	private String pricePerShare;

	
	public Stock(int shares , String symbol, String pricePerShare ) {
		this.shares=shares;
		this.symbol=symbol;
		this.pricePerShare= pricePerShare;
		
	}
												public void setShares(int shares) {
													this.shares=shares;
												}
												public int getShares() {
													return shares;
													
												}
									
												public String getPricePerShare() {
													return pricePerShare;
												}
									
												public void setPricePerShare(String string) {
													this.pricePerShare = pricePerShare;
												}
				


	@Override
	public BigDecimal cost(int n) {
		BigDecimal pricepershare = new BigDecimal(getPricePerShare());
		BigDecimal price= new BigDecimal (n);
		BigDecimal cost = price.multiply(pricepershare);		
		return cost;
	}


										@Override
										public void sale(int n) {
											if(getShares()< n) {
												System.out.println("Sale Not Possible: "+ this.symbol);
											
										}
										
										System.out.println("Shares available: "+ this.shares);
										System.out.println("Price Per Share: "+ this.pricePerShare );
										System.out.println("Sale of Stock: " + this.symbol);
											
										}
	


	// i gave up. Exams without a compiler? I do not understand...... god help us all.....
	
	
	

}
