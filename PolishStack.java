public class PolishStack {
    private double s[];
    private int tos;

    public PolishStack() {
        s = new double[100];
        tos = -1;
    }

    public void push(double item) {
        try {
        s[++tos] = item;
        } catch (ArrayIndexOutOfBoundsException e) {
            --tos;
            System.out.println("stackoverflow");;
        }
    }

    public double pop() {
        if (tos < 0) {
            return 0;
        } else 
            return s[tos--];
    }

    public double peek() {
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