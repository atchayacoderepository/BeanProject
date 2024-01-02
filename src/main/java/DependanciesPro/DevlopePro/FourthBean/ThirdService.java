package DependanciesPro.DevlopePro.FourthBean;

import org.springframework.stereotype.Service;

import DependanciesPro.DevlopePro.Bean.ResultBean;


@Service
public class ThirdService 
{

	

		public ThirdService(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

		public ResultBean performOperation(double operand1, double operand2, String operation) {
			double result = 0;

			switch (operation.toLowerCase()) {
			case "add":
				result = operand1 + operand2;
				break;
			case "subtract":
				result = operand1 - operand2;
				break;
			case "multiply":
				result = operand1 * operand2;
				break;
			case "divide":
				if (operand2 != 0) {
					result = operand1 / operand2;
				} 
				else 
				{
					throw new IllegalArgumentException("Cannot divide by zero.");
				}
				break;
			default:
				throw new IllegalArgumentException("Invalid operation: " + operation);
			}

			return new ResultBean(result);
		}
	}



