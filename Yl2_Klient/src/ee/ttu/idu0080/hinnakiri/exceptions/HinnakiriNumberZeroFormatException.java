package ee.ttu.idu0080.hinnakiri.exceptions;

import javax.xml.ws.WebFault;

@WebFault(name = "HinnakiriNumberZeroFormatFault")
public class HinnakiriNumberZeroFormatException extends Exception {

	private HinnakiriNumberZeroFormatFault faultInfo;

	public HinnakiriNumberZeroFormatException() {
		this("Number is zero");
	}

	public HinnakiriNumberZeroFormatException(String message) {
		super(message);

		// Set fault message
		faultInfo = new HinnakiriNumberZeroFormatFault();
		faultInfo.setMessage(message);
	}

	public HinnakiriNumberZeroFormatException(String message, HinnakiriNumberZeroFormatFault faultInfo) {
		super(message);

		this.faultInfo = faultInfo;
	}

	public HinnakiriNumberZeroFormatFault getFaultInfo() {
		return faultInfo;
	}
}
