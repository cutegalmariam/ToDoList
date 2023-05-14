public enum State {

    DONE('X'),TODO(' '),POSTPONED('*');

    private char symbol;

    State(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}
