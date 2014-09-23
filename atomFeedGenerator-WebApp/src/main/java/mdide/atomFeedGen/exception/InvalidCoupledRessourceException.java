package mdide.atomFeedGen.exception;

/**
 * Exception, die geworfen wird, wenn das coupled ressource Elment falsch modelliert wurde.
 * 
 * @author Mathias Luecker
 *
 */
public class InvalidCoupledRessourceException extends Exception {

	private static final long serialVersionUID = -2304681463865447111L;

	public InvalidCoupledRessourceException() {
		super("Coupled Ressource encoding is not valid!");
	}

	public InvalidCoupledRessourceException(final String arg0) {
		super(arg0);
	}

}