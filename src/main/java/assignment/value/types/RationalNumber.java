package assignment.value.types;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import assignment.value.Value;

@Getter
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class RationalNumber extends Value {
    double value;

    @Override
    public String toString() {
        return String.format("%f", value);
    }
}
