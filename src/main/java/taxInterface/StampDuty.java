package taxInterface;

import java.util.concurrent.atomic.AtomicReference;

class StampDuty extends TaxCalculator {
    StampDuty(final TaxBand...bands) {
        super(bands);
    }

    @Override
    float calculateTax(float earnings) {
        AtomicReference<Float> tax = new AtomicReference<>(0.0f);
        AtomicReference<Float> accumulatedRate = new AtomicReference<>(0.0f);

        getBands().forEach(taxBand -> {
            if (earnings > taxBand.getThreshold()) {
                accumulatedRate.getAndUpdate(r -> r + taxBand.getAdditionalRate());
                tax.set(earnings * accumulatedRate.get());
            }
        });

        return tax.get();
    }
}
