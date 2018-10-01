public enum Operations {

    PLUS,
    MINUS,
    TIMES,
    DIVIDE;

    double calculate(int x,int y){

        switch (this){

            case PLUS:

                return x+y;

            case MINUS:

                return x-y;

            case TIMES:

                return x*y;

            case DIVIDE:

                return x/y;

                default:

                    throw new AssertionError("Unknown operations " + this);
        }
        }
    }

