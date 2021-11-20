public class SignStack {
    private char s[];
    private int tos;

    public SignStack() {
        s = new char[100];
        tos = -1;
    }

    public void push(char item) {
        try {
            s[++tos] = item;
        } catch (ArrayIndexOutOfBoundsException e) {
            --tos;
            System.out.println("stackoverflow");;
        }
    }

    public char pop() {
        if (tos < 0) {
            return 0;
        } else 
            return s[tos--];
    }

    public char peek() {
        return s[tos];
    }

    public boolean empty() {
        if (tos < 0) {
            return true;
        } else {
            return false;
        }
    }

}
