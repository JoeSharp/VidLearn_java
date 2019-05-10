package morse;

import java.util.Map;
import java.util.stream.Stream;

import static morse.MorseDigit.DASH;
import static morse.MorseDigit.DOT;

public class MorseCharacter {
    static Map<Character, MorseCharacter> code;

    static {
        code.put('a', of(DOT, DASH));
        code.put('b', of(DASH, DOT, DOT, DOT));
        code.put('c', of(DASH, DOT, DASH, DOT));
        code.put('d', of(DASH, DOT, DOT));
    }

    static MorseCharacter of(final MorseDigit...morseDigits) {
        return new MorseCharacter(morseDigits);
    }

    private final MorseDigit[] morseDigits;

    private MorseCharacter(final MorseDigit...morseDigits) {
        this.morseDigits = morseDigits;
    }

    private Stream<MorseDigit> getDigits() {
        return Stream.of(this.morseDigits);
    }
}
