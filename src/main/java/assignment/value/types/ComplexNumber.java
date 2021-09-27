package assignment.value.types;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import assignment.value.Value;


@Getter
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class ComplexNumber extends Value {
    double real;
    double imaginary;

    @Override
    public String toString() {
        return String.format("%f%+f*i", real, imaginary);
    }
}
