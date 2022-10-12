import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Person {
	String name;
    int age;
    
//	@Override //lombok으로 이용하면 12~20줄 코드가 없어도 출력가능하다
//	public int hashCode() {
//		return(this.name + this.age).hashCode();
//	}
//	@Override
//	public boolean equals(Object obj) {
//		Person another = (Person)obj;
//		return this.name.equals(another.name)&&this.age ==another.age;
//	}
	
    

	
}
