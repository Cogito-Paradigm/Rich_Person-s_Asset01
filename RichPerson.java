
import java.util.ArrayList;
import java.util.List;

public class RichPerson implements AssetInterface{
	//리스트 필드
	List<PropertyVO> lp = new ArrayList<PropertyVO>();
	List<StockVO> ls = new ArrayList<StockVO>();
	String name;
	
	//생성자
	public RichPerson(){
	}
	public RichPerson(String name){
		this.name = name;
	}
	
	
	//자산관리 인터페이스 오버라이드
	//자산의 합계 메소드
	@Override
	public void sum(){
		int num = 0;
		String name = null;
		try{
			for(PropertyVO e : lp){
				num = num+e.getPrice();
				if(e.getPrice()==0 && name == null){
					name = e.getType();
				}else if(e.getPrice()==0){
					name = name+", "+e.getType();
				}
			}
			for(StockVO e : ls){
				num = num+e.getPrice();
				if(e.getPrice()==0 && name == null){
					name = e.getType();
				}else if(e.getPrice()==0){
					name = name+", "+ e.getType();
				}
			}
			if(name != null){
				throw new AssetException(name+"의 가격");
			}
		}catch(AssetException e){
			System.out.println(e.getMessage());

		}
		System.out.println(this.name+" 자산의 총합 : "+num+"억");
	}
	
	//자산의 평균 메소드
	@Override
	public void avg(){
		int num = 0;
		String name ="";
		try{
			for(PropertyVO e : lp){
				num = num+e.getPrice();
				if(e.getPrice()==0 && name == null){
					name = e.getType();
				}else if(e.getPrice()==0){
					name = name +", "+ e.getType();
				}
			}
			for(StockVO e : ls){
				num = num+e.getPrice();
				if(e.getPrice()==0 && name == null){
					name = e.getType();
				}else if(e.getPrice()==0){
					name = name+", "+e.getType();
				}
			}
			if(name != null){
				throw new AssetException(name+"의 가격");
			}
		}catch(AssetException e){
			System.out.println(e.getMessage());
		
		}
		System.out.println(this.name+" 자산의 평균 : "+num/(lp.size()+ls.size())+"억");
	}
	
	//자산의 개수 메소드
	@Override
	public void size(){
		System.out.println(this.name+"은 총 "+(lp.size()+ls.size())+"개의 부동산 및 주식 자산 보유");
	}
	
	//자산의 합계 리턴
	public int plus(){
		int num = 0;
		for(PropertyVO e : lp){
			num = num+e.getPrice();
		}
		for(StockVO e : ls){
			num = num+e.getPrice();
		}	
		return num;
	}
}
