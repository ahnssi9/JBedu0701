package CH07_03;

public class SmartPhone extends Phone{

	public SmartPhone() {
		super();
	}

	public SmartPhone(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}
	
	//메소드
	public void internetSearch() {
		System.out.println(" class SmartPhone --->  인터넷 검색을 합니다.");
	}

	@Override
	public int powerType() {
		// TODO Auto-generated method stub
		System.out.println(" class SmartPhone  Override  powerType()  --->  뭐하는 거지?");
		return 0;
	}

	
	
	
	
}
