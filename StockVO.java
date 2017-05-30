
public class StockVO {
	//StockVO 필드
	private String type;
	private int code;
	private int price;
	private int high;
	private int low;
	
	//StockVO 생성자
	public StockVO(){
	}
	public StockVO(String type, int code, int price, int high, int low){
		this.type = type;
		this.code = code;
		this.price = price;
		this.high = high;
		this.low = low;
	}
	
	//toString 오버라이드
	public String toString(){
		return "종목 : "+type+", 코드 : "+code+", 현재가 : "+price+"만"+", 최고가 : "+high+"만"+", 최저가 : "+low+"만";
	}
	
	//setter와 getter
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getHigh() {
		return high;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	public int getLow() {
		return low;
	}
	public void setLow(int low) {
		this.low = low;
	}
	
}
