package DependanciesPro.DevlopePro.FourthBean;

import org.springframework.stereotype.Service;

import DependanciesPro.DevlopePro.Bean.BeanSpot;
import DependanciesPro.DevlopePro.Bean.ResultBean;

@Service
public class SecondService 
{
public ThirdService getBeanSpot() {
return new ThirdService("Hello, World! - From Bean", "dummy Message");
	}

public ResultBean performOperation(double operand1, double operand2, String operation) {
	// TODO Auto-generated method stub
	return null;
}


}



