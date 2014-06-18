import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;
import com.cui.domain.Car;
import com.cui.service.Person;




/**
 * project_name :hessianEx
 * @author kexiang.cui
 * create time :2014-6-18 下午4:08:04
 * 
 */
public class main {

	 
    
	public static void main(String[] args) throws MalformedURLException {
		 String url = "http://localhost:8080/HessianExample/hello";   
	     HessianProxyFactory factory = new HessianProxyFactory();   
	     Person basic = (Person) factory.create(Person.class, url);   
	     Car car   = basic.getCar();
	     
	     System.out.println("Hello: " + basic.hello());   
	     System.out.println("Hello: " + car.toString()); 
	}
      
}
