package 렌터카;

public class Car extends Base {
	private String carNumber;
	private String carName;
	private String carColor;
	private int carSize;
	private String carMaker;
	
	//차의 정보를 조회
	public String checkCarInfo() {
		System.out.println("렌트카 조회시간:"+showTime());
		System.out.println("렌트카를 조회합니다.");
		return "조회한 렌트카 정보";
	}
	
	//새 차의 정보를 등록
	public void regcarInfo() {
		System.out.println("렌트카 등록시간:"+showTime());
		System.out.println("렌트카를 등록합니다.");
	}
	
	//차의 정보를 수정
	public void modcarInfo() {
		System.out.println("렌트카 정보 수정시간:"+showTime());
		System.out.println("렌트카 정보를 수정합니다.");
	}
	
	//차의 정보를 삭제
	public void delcarInfo() {
		System.out.println("렌트카 정보 삭제시간:"+showTime());
		System.out.println("렌트카 정보를 삭제합니다.");
	}
}
