package de.spacepotato.sagittarius.chat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatComponent extends Component {

	private String text;

	public ChatComponent(String text) {
		this.text = text == null ? null : translate(text);
	}

	private static String translate(String text) {
		char[] b = text.toCharArray();
		for (int i = 0; i < b.length - 1; i++) {
			if (b[i] == '&' && "0123456789abcdefklmnorABCDEFKLMNOR".indexOf(b[i + 1]) > -1) {
				b[i] = '§';
				b[i + 1] = Character.toLowerCase(b[i + 1]);
			}
		}
		return new String(b);
	}

}
