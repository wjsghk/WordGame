import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		//Properties : k -> String, y-> String
	
//		Properties prop = new Properties();
//		prop.setProperty("myid", "1234");
//		prop.setProperty("asdf", "1111");
//		prop.setProperty("asdf", "6666");
		
//		String value =  prop.getProperty("myid");
//		System.out.println(value);//1234
		
		
//		Enumeration e = prop.propertyNames();
//		while(e.hasMoreElements()) {
//			String element = (String)e.nextElement();
//			String value = prop.getProperty(element);
//			System.out.println(value);//1234 6666
//			
//		}
		
		
		Properties prop =new Properties();
		try {
			prop.load(new FileInputStream("input.txt"));//src하위 폴더로 옮기면 'src/'를 input앞에 써준다 
		}catch(IOException e) {
			System.out.println("지정한 파일이 없습니다.");
			System.exit(0);//프로그램 강제종료
		}
		String name =prop.getProperty("name");//input 파일에 =>"Hong kil Dong"이 출력된다.
		String[] data = prop.getProperty("data").split(",");
		
		int max = 0;
		int min = 0;
		int sum = 0;
		
//		이름 출력해보기
//		max
//		min
//		sum
//		평균
		//문자열을 숫자로 바꿔주는거는 Integer.paresInt(문자열)
		//숫자를 문자열로 바꿔주는거는 String.valueOF(숫자)
		for(int i =0;i<data.length;i++) {
			int value = Integer.parseInt(data[i]);
			
			if(max < value) {//처음에 max를 0으로 두고 input.txt의
				             //차례대로9,1,5,2,8,13,26,11,35,1
				             //대입하면 0<9 => 9<1 => 9<5...9<35가 되기때문에 max가35가된다
				max = value;	
			}
			if(min > value) {//위에 max와 똑같은 방법으로 
				min=value;
			}
			sum += value;//위에 max와 똑같은 방법으로 반목문이니까
		}
		double avg = (double)sum/data.length;
		System.out.println("이름 :" + name);
		System.out.println("최대 :" + max);
		System.out.println("최소 :" + min);
		System.out.println("합계 :" + sum);
		System.out.println("평균 :" + avg);
		
		
	}

}
