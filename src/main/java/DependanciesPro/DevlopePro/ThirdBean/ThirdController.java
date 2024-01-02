package DependanciesPro.DevlopePro.ThirdBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import DependanciesPro.DevlopePro.Bean.ResultBean;
import DependanciesPro.DevlopePro.FourthBean.SecondService;


public class ThirdController 
{
	@RestController
	@RequestMapping("/api")
	public class MathOperationController {

		@Autowired
		private SecondService mathOperationService;

		// http://localhost:8080/api/calculate?operand1=5&operand2=3&operation=multiply
		@GetMapping("/calculate")
		public ResultBean performOperation(@RequestParam double operand1, @RequestParam double operand2,
				@RequestParam String operation) {
			return mathOperationService.performOperation(operand1, operand2, operation);
		}
	}

}
