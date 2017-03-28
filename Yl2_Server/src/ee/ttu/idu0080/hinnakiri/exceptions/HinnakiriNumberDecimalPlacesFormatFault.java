package ee.ttu.idu0080.hinnakiri.exceptions;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "HinnakiriNumberDecimalPlacesFormatFault")
public class HinnakiriNumberDecimalPlacesFormatFault {
	private String message;

	public HinnakiriNumberDecimalPlacesFormatFault() {
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
