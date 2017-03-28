package ee.ttu.idu0080.hinnakiri.exceptions;

import javax.xml.ws.WebFault;

@WebFault(name = "HinnakiriNumberDecimalPlacesFormatFault")
public class HinnakiriNumberDecimalPlacesFormatException extends Exception {
	private HinnakiriNumberDecimalPlacesFormatFault faultInfo;

	public HinnakiriNumberDecimalPlacesFormatException() {
		this("Number is too accurate");
	}

	public HinnakiriNumberDecimalPlacesFormatException(String message) {
		super(message);

		// Set fault message
		faultInfo = new HinnakiriNumberDecimalPlacesFormatFault();
		faultInfo.setMessage(message);
	}

	public HinnakiriNumberDecimalPlacesFormatException(String message,
			HinnakiriNumberDecimalPlacesFormatFault faultInfo) {
		super(message);

		this.faultInfo = faultInfo;
	}

	public HinnakiriNumberDecimalPlacesFormatFault getFaultInfo() {
		return faultInfo;
	}
}
