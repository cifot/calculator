package handlers;

import assignment.Variable;
import exceptions.CalculatorException;

import java.util.HashMap;
import java.util.Map;


class VariableHandler {
    private final Map<String, Variable> variables = new HashMap<>();

    VariableHandler() {}

    public void add(Variable variable) {
        variables.put(variable.getName(), variable);
    }

    public Variable getVariables(String name) {
        Variable variable = variables.get(name);
        if (variable == null) {
            throw new CalculatorException(String.format("Неизвестная переменная %s", name));
        }
        return variable;
    }
}
