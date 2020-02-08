package fr.pederobien.uhc.exceptions;

import fr.pederobien.uhc.interfaces.IMessageCode;

public class BaseExtractionException extends UHCPluginException {
	private static final long serialVersionUID = 1L;

	public BaseExtractionException(IMessageCode code) {
		super(code);
	}
}
