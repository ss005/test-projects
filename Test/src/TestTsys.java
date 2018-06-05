import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

	
public class TestTsys {

	public TestTsys() {
		super();
		System.out.println("inside child constructor ");
	}

	public static void main(String[] args) {
        TestTsys sys = new TestTsys();
        Object object = new Object() ;
        
        String fileName = "test" ;
        
        BufferedReader bReader = null ;
        FileReader reader = null ;
        
        try {
        	reader = new FileReader(fileName) ;	
        } catch (FileNotFoundException exception ) {
        	System.out.println("exception occurred ");
        }
        
        try (BufferedReader bReader2 = new BufferedReader(new FileReader(fileName))) {
        	System.out.println("hi");
        } catch (Exception e) {
			System.out.println("hello");
		}
 
        
        
    }
}
