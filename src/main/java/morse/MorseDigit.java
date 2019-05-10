package morse;

enum MorseDigit {
    DOT('.'),
    DASH('-');

    private final char digit;

    MorseDigit(final char digit) {
        this.digit = digit;
    }

    char getDigit() {
        return digit;
    }

}
