package arrayex;

public class ArrayTest01 {

	public static void main(String[] args) {
		int[]num=new int[5];
		int[]values= {1,2,3,4,5,6,7,8,9}; //초기값선언을 { }를 사용해 한번에 줄수도 있다
		//char[]ch=new char[5];
		char[]ch= {'a','b','c','d','e'};
		/*ch[0]='a';
		ch[1]='b';
		ch[2]='c';
		ch[3]='d';
		ch[4]='e';*/
	
		for(int i=0; i<ch.length;i++) {
			//System.out.println("ch:"+ch[i]);
			System.out.println("ch["+i+"]="+ch[i]);
			
		}
		
		num[0]=100; //초기값선언, int num1 =100; 
		num[1]=200; //int num2 =200; (단일변수)와 같다. 하지만 array를 사용하면 같은 이름으로 사용
		num[1]=(int)12.345F; //F는 float (4byte)를 쓰겠다는 말, F가 없으면 자동으로 double(8byte)로 쓰임
		//num[2]=300;//ArrayIndexOutofBoundsException 발생 (배열개수초과)
		System.out.println("num[0]="+num[0]);
		System.out.println("num[1]="+num[1]);
		//System.out.println("num[2]="+num[2]);
		
		int sum=num[0]+num[1];
		System.out.println("합 ="+sum);
		int add=num[0]+100;
		int sub=num[0]-50;
		int mul=num[0]*num[1];
		System.out.println("Add="+add+",Sub="+sub+",Mul="+mul);
		
		//배열의 개수
		int len=num.length;
		System.out.println("배열의 개수 : " + len);
		
		for(int i=0; i<num.length;i++) {
			System.out.println("num:"+num[i]);
		}
		
	}
	
}
