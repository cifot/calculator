package handlers;

public final class Handlers {
    private static final FunctionHandler functionHandler= new FunctionHandler();
    private static final VariableHandler variableHandler = new VariableHandler();

    public static FunctionHandler getFunctionHandler() {
        return functionHandler;
    }

    public static VariableHandler getVariableHandler() {
        return variableHandler;
    }
}
