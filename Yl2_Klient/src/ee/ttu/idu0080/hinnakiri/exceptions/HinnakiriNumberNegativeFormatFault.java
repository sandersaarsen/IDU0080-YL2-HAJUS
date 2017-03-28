package ee.ttu.idu0080.hinnakiri.exceptions;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "HinnakiriNumberNegativeFormatFault")
public class HinnakiriNumberNegativeFormatFault {
	private String message;

	public HinnakiriNumberNegativeFormatFault() {
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
