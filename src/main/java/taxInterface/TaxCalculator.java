package taxInterface;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class TaxCalculator {
    private final List<TaxBand> bands;

    TaxCalculator(final TaxBand...bands) {
        this.bands = Stream.of(bands)
                .collect(Collectors.toList());
    }

    float calculateTax(float earnings) {
        float tax = 0.0f;

        for (TaxBand band : bands) {
            if (earnings > band.getThreshold()) {
                // Eacb band calculates additional tax on all earnings above it's threshold
                tax += (earnings - band.getThreshold()) * band.getAdditionalRate();
            }
        }

        return tax;
    }

    protected List<TaxBand> getBands() {
        return bands;
    }
}
