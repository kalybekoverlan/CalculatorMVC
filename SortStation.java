public class SortStation {

    private Model theModel;
    private SignStack signStack;
    private PolishStack polishStack;
    private double answer;

    public SortStation(Model model) {
        theModel = model;
        signStack = new SignStack();
        polishStack = new PolishStack();
    }

    // Get priority of symbol 
    public int getPriority(char symbol) {               
        if ( symbol == '*' || symbol == '/' )
            return 2;
        if ( symbol == '+' || symbol == '-' )
            return 1;
        else 
            return 0;
    }

    // Get Reverse Polish Notation
    public String getRPN() {
        String postfix = "";
        String infix = "";
    	int priority;
    	char symbol;

        infix = theModel.getInfix();
    	
    	for ( int i = 0; i < infix.length()-1; i++) {
            symbol = infix.charAt(i); 

            // Check if the first symbol is "minus" 
            if ( i == 0 && symbol == '-') {
                priority = 0;;
            } else 
                priority = getPriority(symbol);
            
            if ( priority == 0 ) {
                postfix = postfix + symbol;
            }

            if ( priority > 0 ) {
                postfix = postfix + " ";

                while ( !signStack.empty() && 
                        getPriority(symbol) <= getPriority(signStack.peek() ) ) {
                    postfix = postfix + signStack.pop() + " ";
                }
                signStack.push(symbol);
            }                

        }
        
        // Pop all last symbols of arithmetic operations
        while( !signStack.empty() ) {
            postfix = postfix + " " + signStack.pop();
        }

    	return postfix;
    }

    // Calculate reverse polish notation
    public double calculate(String postfix) throws ArithmeticException {
        String tempValue = "";
        double left;
        double right;
        char s;
            
        for( int k = 0; k < postfix.length(); k++ ) { 
            s = postfix.charAt(k);
            if(s == ' ') {
                continue;
            } else 
                if( (s >= '0' && s <= '9' ) || s == '.' || (k == 0 && s == '-') ) {
                    tempValue = "";

                    while( (s >= '0' && s <= '9' ) || s == '.' || (k == 0 && s == '-') ) {
                        tempValue = tempValue + s;
                        k++;
                        s = postfix.charAt(k);
                    }

                    k = k - 1;
                    polishStack.push( Double.parseDouble(tempValue) ) ;
                    
                } else {
                    right = polishStack.pop() ;
                    left = polishStack.pop() ;

                    switch (s) {
                        case '*' :
                            polishStack.push( left * right );       
                            break;
                        case '/' :
                            polishStack.push( left / right );       
                            break;
                        case '+' :
                            polishStack.push( left + right );       
                            break;
                        case '-' :
                            polishStack.push( left - right );       
                            break;
                    }
                }
            }
    answer=polishStack.pop();

    return answer;  
    }

}