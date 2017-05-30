
//예외처리를 위해 만들어놓은 클래스
public class AssetException extends Exception{
	public AssetException(){
	}
	public AssetException(String msg){
		super(msg);
	}
	
	public String getMessage(){
		return super.getMessage()+"의 값이 없습니다.";
	}
}
