import java.util.ArrayList;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;

//p391
public class ArrayListTest {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList(20);//�θ��� Object Ÿ������ ����ȯ�Ѵ�
//		list.add("1");//���� 
//		list.add("1");//����
//		list.add(new Integer(1));//����
//		list.add(1);//����
//		list.add("2");//����
//		list.add(2);//����
	
//		list.add("1"); //String Ÿ�Կ���-> Object�� ����ȯ�� �߻�
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
		
//		String str = (String)list.get(0);//Object -> String
//		System.out.println(str);//1�� ���´�
		
		 
//	    int sum =0;
//	    
//		for(Object obj : list) {
//			String str = (String)obj;
//			System.out.println(str);//1�̳��´�
//		    int num = Integer.parseInt(str);
//		    sum += num;
// 		
//		}
//		
//		System.out.println("sum = "+ sum);//1�̳��´�
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		list.remove(3);
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		
		//���ñ���p.422
//		Stack st = new Stack();
//		st.push("1");
//		st.push("2");//push =����,  pop =����
//		st.push("3");
//		try {
//	    System.out.println((String)st.pop()); //3�� ���´�.
//	    System.out.println((String)st.pop());//2�� ���´�.
//	    System.out.println((String)st.pop());//1�� ���´�.
//	    System.out.println((String)st.pop());
//	    }catch(EmptyStackException e){
//	    	System.out.println("Stack�� �ٲ�����ϴ�.");
//	    }
	    
		
		//p.404
//		ArrayList list =new ArrayList();   
//		list.add("1");
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
//		//Itearator (�ݺ�������)
//	    Iterator it = list.iterator();
//		
//		while(it.hasNext()) {//���������� ���� Ȯ��
//		    String str =(String)it.next();//���� ������ ���� ��Ȱ
//		    System.out.println(str);//1,2,3,4,5
//		}

		
//		���׸� : �÷��� ��ü�� ������ Ÿ���� �����Ѵ�.	
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("1");
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
//		
//		list.get(0);
//		
//		Iterator<String> it =list.iterator();
//		while(it.hasNext()) {//���������� ���� Ȯ��
//		    String str =(String)it.next();//���� ������ ���� ��Ȱ
//		    System.out.println(str);//1,2,3,4,5
//		}
		
		
//	    HashSet set = new HashSet();
//	    set.add("1");
//	    set.add("2");
//	    set.add("1");
//	    set.add("4");
//	    set.add(new Integer(1));
//	    System.out.println(set);//1,1,2,4 
//	    
//	    for(Object obj : set) {
//	    	String str = (String)obj;
//	    	System.out.println(str);
//	    }
	
		
		
//		 HashSet<String> set = new HashSet<String>();
//		    set.add("1");
//		    set.add("2");
//		    set.add("1");
//		    set.add("4");
//		    set.add("5");
//		    
//		    Iterator<String> it = set.iterator();
//		    while(it.hasNext()) {
//		    	String str =  it.next();
//		    	System.out.println(str);//1,2,4,5
//		    }
	
		
		
		
		//�������
//		Set<Integer> set = new HashSet<Integer>();
//		
//		int[][]bingo = new int [5][5];
//		
//		for(int i=0;set.size()<25;i++) {
//			set.add((int)(Math.random()*50)+1);
//		}
//		//System.out.println(set);//1~50���� �������� 25�� ����
//		
//		ArrayList list = new ArrayList(set);
//		Collections.shuffle(list);//������ �� ������
//
//		Iterator<Integer> it = list.iterator();//������ �� ������
//		
//		for(int i =0;i<bingo.length;i++) {
//			for(int j=0;j<bingo[i].length;j++) {
//			bingo[i][j] = it.next();	
//		}
//	}
//	
//	    for(int i =0;i<bingo.length;i++) {
//	    	for(int j=0;j<bingo[i].length;j++) {
//			System.out.print(bingo[i][j] + " ");
//	    	}
//	    	System.out.println();
//	    }
	
	    //TreeSet : �ݵ�� ������ ���Ǵ� �ش�Ŭ���� �ȿ��� ���� ������ �������̵� �Ǿ��־���Ѵ�.
		//Implements Comparable (Integer,String...)
//	    TreeSet<Integer> set = new TreeSet<Integer>();//���� ���ĵǾ�����.
//	    set.add(new Integer(2));
//	    set.add(5);
//	    set.add(1);
//	    set.add(4);
//	    set.add(3);
//	    
//	    System.out.println(set);//[1,2,3,4,5]
//	    
//	    Iterator<Integer> it = set.iterator();
//		while(it.hasNext()) {
//			Integer intg = it.next();    
//		    System.out.print(intg);//12345
//		}
		
		
		//Student Ŭ������ ���� �ϸ鼭 ����
//		TreeSet<Student> set = new TreeSet<Student>();
//		Student s1 = new Student("kim",1,1,10,10,10);
//		Student s2 = new Student("pim",3,1,10,10,10);
//		Student s3 = new Student("aim",6,1,10,10,10);
//		Student s4 = new Student("sim",9,1,10,10,10);
//		Student s5 = new Student("fim",4,1,10,10,10);
//		
//		set.add(s1);
//		set.add(s2);
//		set.add(s3);	
//		set.add(s4);
//		set.add(s5);
//		
//		Iterator<Student> it = set.iterator();
//		
//		while(it.hasNext()) {
//			Student s = it.next();
//			System.out.println(s.toString());
//		}
			
	}

}
