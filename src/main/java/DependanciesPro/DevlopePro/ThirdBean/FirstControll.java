package DependanciesPro.DevlopePro.ThirdBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DependanciesPro.DevlopePro.FourthBean.SecondService;
import DependanciesPro.DevlopePro.FourthBean.ThirdService;

@RestController
@RequestMapping("/api")
public class FirstControll 
{
	
	

		@Autowired
		private SecondService greetingService;

		@GetMapping("/greeting")
		public ThirdService getGreeting() {
			return greetingService.getBeanSpot();
		}
	}


