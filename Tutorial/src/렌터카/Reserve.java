package 렌터카;

public class Reserve extends Base {
	private String regCarNumber;
	private String resDate;
	private String useBeginDate;
	private String returnDate;
	
	//차를 예약하는 기능
	public String reserveCar() {
		System.out.println("렌트카 예약시간:"+showTime());
		System.out.println("차를 예약합니다.");
		return "예약차 정보";
	}
	
	//차 예약 정보를 수정
	public void modReserveInfo() {
		System.out.println("렌트카 예약정보 수정시간:"+showTime());
		System.out.println("예약정보를 수정합니다.");
	}
	
	//차 예약정보를 취소
	public void cancleReserveInfo() {
		System.out.println("렌트카 예약정보 삭제시간:"+showTime());
		System.out.println("예약을 취소합니다.");
	}
}
