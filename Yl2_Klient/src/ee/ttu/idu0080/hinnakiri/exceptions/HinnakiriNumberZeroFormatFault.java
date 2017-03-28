package ee.ttu.idu0080.hinnakiri.exceptions;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "HinnakiriNumberZeroFormatFault")
public class HinnakiriNumberZeroFormatFault {
	private String message;

	public HinnakiriNumberZeroFormatFault() {
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
