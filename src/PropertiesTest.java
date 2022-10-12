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
			prop.load(new FileInputStream("input.txt"));//src���� ������ �ű�� 'src/'�� input�տ� ���ش� 
		}catch(IOException e) {
			System.out.println("������ ������ �����ϴ�.");
			System.exit(0);//���α׷� ��������
		}
		String name =prop.getProperty("name");//input ���Ͽ� =>"Hong kil Dong"�� ��µȴ�.
		String[] data = prop.getProperty("data").split(",");
		
		int max = 0;
		int min = 0;
		int sum = 0;
		
//		�̸� ����غ���
//		max
//		min
//		sum
//		���
		//���ڿ��� ���ڷ� �ٲ��ִ°Ŵ� Integer.paresInt(���ڿ�)
		//���ڸ� ���ڿ��� �ٲ��ִ°Ŵ� String.valueOF(����)
		for(int i =0;i<data.length;i++) {
			int value = Integer.parseInt(data[i]);
			
			if(max < value) {//ó���� max�� 0���� �ΰ� input.txt��
				             //���ʴ��9,1,5,2,8,13,26,11,35,1
				             //�����ϸ� 0<9 => 9<1 => 9<5...9<35�� �Ǳ⶧���� max��35���ȴ�
				max = value;	
			}
			if(min > value) {//���� max�� �Ȱ��� ������� 
				min=value;
			}
			sum += value;//���� max�� �Ȱ��� ������� �ݸ��̴ϱ�
		}
		double avg = (double)sum/data.length;
		System.out.println("�̸� :" + name);
		System.out.println("�ִ� :" + max);
		System.out.println("�ּ� :" + min);
		System.out.println("�հ� :" + sum);
		System.out.println("��� :" + avg);
		
		
	}

}
