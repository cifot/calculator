package handlers;

import assignment.Function;
import exceptions.CalculatorException;

import java.util.HashMap;
import java.util.Map;

class FunctionHandler {
    private final Map<Map.Entry<String, Integer>, Function> functions = new HashMap<>();

    FunctionHandler() {}

    public void add(Function function) {
        functions.put(Map.entry(function.getName(), function.getVariableList().size()), function);
    }

    public Function getFunction(String name, Integer parameterCounts) {
        var entry = Map.entry(name, parameterCounts);
        Function function = functions.get(entry);
        if (function == null) {
            throw new CalculatorException(String.format("Неизвестная функция %s с количеством параметров %d",name, parameterCounts));
        }
        return function;
    }
}
