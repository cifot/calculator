package assignment;

import assignment.expression.Expression;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Function {
    private final String name;
    private final List<Variable> variableList;
    @EqualsAndHashCode.Exclude
    private final Expression expression;

    @Override
    public String toString() {
        return String.format("%s(%s) = %s", name, variableList.stream().map(Variable::toString).collect(Collectors.joining(", ")), expression.toString());
    }
}
