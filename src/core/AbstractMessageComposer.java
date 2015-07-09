package core;

public abstract class AbstractMessageComposer implements MessageComposer {

	@Override
	public String composeMessage() {
		return "Basis-Nachricht von " + getClass().getSimpleName();
	}

}
