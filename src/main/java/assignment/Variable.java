package assignment;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import assignment.value.Value;

@Getter
@Setter
@EqualsAndHashCode
public class Variable {
    private final String name;
    @EqualsAndHashCode.Exclude
    private Value value;

    Variable(String name, Value value) {
        this.name = name;
        this.value = value;
    }
}
