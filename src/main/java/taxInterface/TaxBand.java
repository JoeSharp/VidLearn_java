package taxInterface;

class TaxBand {
    private final float threshold;
    private final float additionalRate;

    TaxBand(float threshold, float additionalRate) {
        this.threshold = threshold;
        this.additionalRate = additionalRate;
    }

    float getThreshold() {
        return threshold;
    }

    float getAdditionalRate() {
        return additionalRate;
    }
}
