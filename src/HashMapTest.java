import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapTest {
//p.412
	public static void main(String[] args) {
		
		
//		HashMap<String,String> map = new HashMap<String,String>();
//		map.put("myid", "1234");//(k,y)
//		map.put("asdf", "1111");
//		map.put("asdf", "1234");
//		map.put("asdf", "6666");
//		System.out.println(map);//{myid=1234, asdf=6666}
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.println("���̵� �Է� : ");
//			String id = sc.next(); 
//			
//			System.out.println("��   �� �Է� : ");
//			String password = sc.next();
//			
//			//get(key) -> value�� ��ȯ
//			//get("myid")->"1234"
//			//containsKey(key) -> �������� Ȯ��(true,false) 
//			
//			if(!map.containsKey(id)) {
//				System.out.println("���̵� �������� �ʽ��ϴ�.�ٽ��Է�");
//				continue;
//			}else {
//				if(!map.get(id).equals(password)) {
//					System.out.println("����� �������� �ʽ��ϴ�. �ٽ��Է�");
//				}else {
//					System.out.println("�α��� ����");
//					break;
//				}
//			}
			
		
		
		//HashMap�� remove
		//keySet() :Ű�� ��ü�� ��ȯ�Ѵ�
		HashMap map = new HashMap();
		map.put("myid", "1234");//(k,y)
		map.put("asdf", "1111");
		map.put("asdf", "1234");
				
	    map.remove("myid");
		System.out.println(map);//{asdf=1234}
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);//asdf
		}
		
		System.out.println("============");
				
		//values() : values��ü�� ��ȯ�Ѵ�.
		Collection<String> values = map.values();
		Iterator<String> itv = values.iterator();
		
		while(itv.hasNext()) {
			String value = itv.next();
			System.out.println(value);//1234
			
		}
		
		Set<Map.Entry<String,String>> entry =map.entrySet();
		Iterator<Map.Entry<String, String>> itE= entry.iterator();
		
		while(itE.hasNext()) {
			Map.Entry<String, String> ent = itE.next();
			String key = ent.getKey();
			String value = ent.getValue();
			System.out.println("[key]: " + key + ", [value]:" + value);//[key]: asdf, [value]:1234
		}
			
			
		
		
		
		
		
		
		
		
		}

	}


