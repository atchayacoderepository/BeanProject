package DependanciesPro.DevlopePro.FourthBean;

import org.springframework.stereotype.Service;

import DependanciesPro.DevlopePro.Bean.BeanSpot;

public class FirstService 
{
	@Service
	public class GreetingService {
		public String getGreeting() {
			return "Hello, World!";
		}
	}

	public BeanSpot getHelloWorldBean() {
		// TODO Auto-generated method stub
		return null;
	}


}
