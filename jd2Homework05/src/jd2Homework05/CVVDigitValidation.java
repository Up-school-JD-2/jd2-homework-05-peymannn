package jd2Homework05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CVVDigitValidation implements Validation {
	String regex = "^[0-9]{3,4}$";

	@Override
	public boolean IsValid(Payment payment) {
		String CVV = Integer.toString(payment.CVV);
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(CVV);
		if (CVV == null) {
			return false;
		}
		return m.matches();
	}
}