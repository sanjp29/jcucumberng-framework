package jcucumberng.api.locator;

/**
 * {@code InvalidPatternException} is thrown when the specified pattern does not
 * match the expected pattern in {@code ui-map.properties}.
 * 
 * @author Kat Rollo {@literal <rollo.katherine@gmail.com>}
 */
@SuppressWarnings("serial")
public class InvalidPatternException extends RuntimeException {
	public InvalidPatternException(String message) {
		super(message);
	}
}
