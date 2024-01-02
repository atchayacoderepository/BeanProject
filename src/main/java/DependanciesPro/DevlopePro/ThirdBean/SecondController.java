package DependanciesPro.DevlopePro.ThirdBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DependanciesPro.DevlopePro.Bean.BeanSpot;
import DependanciesPro.DevlopePro.FourthBean.FirstService;



public class SecondController 
{
	@RestController
	@RequestMapping("/api")
	public class HelloWorldController {

		@Autowired
		private FirstService FirstService;

		@GetMapping("/helloworld")
		public BeanSpot getGreeting() {
			return FirstService.getHelloWorldBean();
		}
		
		
	}

}
