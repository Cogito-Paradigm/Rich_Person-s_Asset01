
import java.util.List;

public class Main {
	public static void main(String[] args){
		//부자1
		RichPerson buja01 = new RichPerson("강호동");
		
		//부자 1의 부동산 목록
		buja01.lp.add(new PropertyVO("주택", "서울 강남구", 10, "3", "20", null, null, null, null));
		buja01.lp.add(new PropertyVO("오피스텔", "서울 동작구", 2, null, "30", "100", null, null, null));
		buja01.lp.add(new PropertyVO("아파트", "서울 마포구", 5, "4", null, null, "1", null, null ));
		buja01.lp.add(new PropertyVO("빌라", "서울 강남구", 0, "2", "15", null, null, "5", null));
		buja01.lp.add(new PropertyVO("토지", "서울 종로구", 50, null, "100", null, null, null, "50"));
		
		//부자 1의 주식 목록
		buja01.ls.add(new StockVO("삼성전자", 1, 200, 250 ,100));
		buja01.ls.add(new StockVO("셀트리온", 2, 8, 15, 5));
		
		//부자 1의 자산 합계, 평균, 개수
		buja01.sum();
		buja01.avg();
		buja01.size();
		
		//부자2
		RichPerson buja02 = new RichPerson("유재석");
		
		//부자 2의 부동산 목록
		buja02.lp.add(new PropertyVO("주택", "서울 도봉구", 6, "5", "25", null, null, null, null));
		buja02.lp.add(new PropertyVO("오피스텔", "서울 마포구", 8, null, "15", "80", null, null, null));
		buja02.lp.add(new PropertyVO("아파트", "서울 중구", 0, "8", null, null, "10", null, null ));
		buja02.lp.add( new PropertyVO("빌라", "서울 종로구", 5, "2", "15", null, null, "15", null));
		buja02.lp.add(new PropertyVO("토지", "서울 강남구", 0, null, "60", null, null, null, "20"));
		buja02.lp.add(new PropertyVO("주택", "서울 강동구", 20, "10", "30", null, null, null, null));
		buja02.lp.add(new PropertyVO("오피스텔", "서울 강남구", 10, null, "20", "120", null, null, null));
		buja02.lp.add(new PropertyVO("아파트", "서울 은평구", 15, "10", null, null, "75", null, null ));
		
		//부자 2의 주식 목록
		buja02.ls.add(new StockVO("제니퍼", 1, 150, 200 ,100));
		buja02.ls.add(new StockVO("삼성전자", 2, 200, 250, 150));
		buja02.ls.add(new StockVO("한화", 1, 80, 150 ,70));
		buja02.ls.add(new StockVO("LG", 2, 20, 30, 10));	
		
		//부자 2의 자산 합계, 평균, 개수
		buja02.sum();
		buja02.avg();
		buja02.size();
		
		//두 사람의 자산 비교
		compare(buja01, buja02);
		
		//10억 이상의 자산 찾기
		assetFind(buja01);
		assetFind(buja02);
		
		//서울 강남구에 있는 부동산
		addressFind(buja01);
		addressFind(buja02);
	}
	
	//두 부자의 자산 비교 메소드
	public static void compare(RichPerson buja01, RichPerson buja02){
		if(buja01.plus() > buja02.plus()){
			System.out.println(buja01.name+"의 자산이 더 많습니다.");
		}else if(buja02.plus() > buja01.plus()){
			System.out.println(buja02.name+"의 자산이 더 많습니다.");
		}else{
			System.out.println("두 사람의 자산이 같습니다.");
		}
	}
	
	//10억 이상 자산찾기 메소드//인자 받을 수있게 하드코딩 x
	public static void assetFind(RichPerson buja){
		for(PropertyVO e : buja.lp){
			if(e.getPrice()>=10){
				System.out.println(buja.name+"의 "+e.getAddress()+"에 있는"+e.getType());
			}
		}
		for(StockVO e: buja.ls){
			if(e.getPrice()>= 10){
				System.out.println(buja.name+"의 "+e.getType()+"의 주식");
			}
		}
	}
	
	//서울 강남구에 있는 부동산 자산 찾기 메소드
	public static void addressFind(RichPerson buja){
		for(PropertyVO e : buja.lp){
			if(e.getAddress()=="서울 강남구"){
				System.out.println(buja.name+"의 "+e.getType()+"이(가) 서울 강남구에 있습니다.");
			}
		}
	}
}