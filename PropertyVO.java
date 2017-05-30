public class PropertyVO {
	//PropertyVO 필드
	private String type;
	private String address;
	private int price;
	private String roomsu;
	private String area;
	private String month;
	private String total;
	private String floor;
	private String tree;
	
	//PropertyVO 생성자
	public PropertyVO(){
	}
	public PropertyVO(String type, String address, int price, String roomsu, String area, String month, String total, String floor, String tree){
		this.type = type;
		this.address = address;
		this.price = price;
		this.roomsu = roomsu;
		this.area = area;
		this.month = month;
		this.total = total;
		this.floor = floor;
		this.tree = tree;
	}
	
	//toString 오버라이드
	public String toString(){
		return "분류 : "+type+", 주소 : "+address+", 가격 : "+price+"억"+", 방수 : "+roomsu+"개"+", 면적 : "+area+"평"
				+", 월세 : "+month+"만"+", 전세 : "+total+"억"+", 층수 : "+floor+"층"+", 나무수 "+tree+"그루";
	}
	
	//setter와 getter
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getRoomsu() {
		return roomsu;
	}
	public void setRoomsu(String roomsu) {
		this.roomsu = roomsu;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getTree() {
		return tree;
	}
	public void setTree(String tree) {
		this.tree = tree;
	}
	
}
