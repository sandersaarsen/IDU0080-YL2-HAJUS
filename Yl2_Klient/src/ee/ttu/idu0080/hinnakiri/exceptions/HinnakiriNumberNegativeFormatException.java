package ee.ttu.idu0080.hinnakiri.exceptions;

import javax.xml.ws.WebFault;

@WebFault(name = "HinnakiriNumberNegativeFormatFault")
public class HinnakiriNumberNegativeFormatException extends Exception {
	
	private HinnakiriNumberNegativeFormatFault faultInfo;

	public HinnakiriNumberNegativeFormatException() {
		this("Number is negative");
	}

	public HinnakiriNumberNegativeFormatException(String message) {
		super(message);

		faultInfo = new HinnakiriNumberNegativeFormatFault();
		faultInfo.setMessage(message);
	}

	public HinnakiriNumberNegativeFormatException(String message, HinnakiriNumberNegativeFormatFault faultInfo) {
		super(message);

		this.faultInfo = faultInfo;
	}

	public HinnakiriNumberNegativeFormatFault getFaultInfo() {
		return faultInfo;
	}
}
