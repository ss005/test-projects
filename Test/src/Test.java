import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.w3c.dom.ls.LSInput;

public class Test {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 5, 3, 3, 100 );
		
		numbers.stream().map( i -> (int) i * 5 ).filter(i -> (int)i > 10 ).forEach(i -> System.out.println(i));
		System.out.println(List.class);
	
		List<Person > persons = new ArrayList<>();
		Person person = new Person(1, 20);
		Person person2 = new Person(2, 40);
		Person person3 = new Person(3, 40);
		Person person4 = new Person(4, 20);
		Person person5 = new Person(5,  70);
		Person person6 = new Person(6, 30);
		
		
		persons.add(person);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);
		persons.add(person5);
		persons.add(person6);
		
//		Collections.sort(messageList, (m1, m2)-> Integer.compare(m2.getId(), m1.getId()) );
//		for (Message message3 : messageList) {
//			System.out.println(message3);
//		}
		
		//messageList.stream().sorted((m1, m2)-> Integer.compare(m2.getId(), m1.getId()) )
			//		.forEach(s -> System.out.println(s));
		
		System.out.println("sorting the list on the basis of id  using parallel stream ...");
		System.out.println("--------------------------");
				
		persons.parallelStream().sorted((m1, m2)-> Integer.compare(m1.getId(), m2.getId()) )
				.forEachOrdered(s -> System.out.println(s));
		
		System.out.println("Groubp by statement ...");
		System.out.println("----------------------------");
		//printing persons gouped by their age ...
		System.out.println(persons.stream().collect(Collectors.groupingBy(Person::getAge)));
		
		System.out.println("===========");
		
		persons.stream().filter( (p) -> p.getAge() > 40  );
		
		System.out.println("Miscellenous ... ");
		
		String s = "text" ;
		Predicate<String> predicate =   s::contains;
		System.out.println(predicate.test("r"));
		
		Function<String, Integer> function  = Integer::valueOf ;
		System.out.println(function.apply("23"));
		
		
		
		MyInterface <String, Integer> myInterface = Integer::valueOf;
		System.out.println(myInterface.aMethod("234"));
		
		//MyInterface <Integer, String> myInterface2 =
		
		System.out.println(ATest.someAction(String::valueOf));
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		//stream not suopported on map 
		//map.stream
		
		
		
	}

}


class ATest {
	public static String someAction (MyInterface myInterface) {
		System.out.println("Performing some action ");
		return (String) myInterface.aMethod(9999);
	}
}

@FunctionalInterface
interface MyInterface<I, R > {
	R aMethod (I i) ;
}


class Person {
	private int id ;
	private int age ;
	

	
	public Person(int id, int age) {
		super();
		this.id = id;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + "]";
	}
	
	
	
}
