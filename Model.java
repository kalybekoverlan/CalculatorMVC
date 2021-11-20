public class Model {

    private Viewer viewer;
    private SortStation sortStation;
    private String infix;
    private String postfix;
    private double answer;

    public Model(Viewer viewer) {
        this.viewer = viewer;
        sortStation = new SortStation(this);
        infix = "";
        postfix = "";
    }

    public void doAction(String command) {

        String strAnswer;
        String strAnswerTemp;

        switch (command) {
            case "Clear" :
                infix = "";
                postfix = "";
                break;
            case "Zero" :
                infix = infix + "0";
                break;
            case "One" :
                infix = infix + "1";
                break;
            case "Two" :
                infix = infix + "2";
                break;
            case "Three" :
                infix = infix + "3";
                break;
            case "Four" :
                infix = infix + "4";
                break;
            case "Five" :
                infix = infix + "5";
                break;
            case "Six" :
                infix = infix + "6";
                break;
            case "Seven" :
                infix = infix + "7";
                break;
            case "Eight" :
                infix = infix + "8";
                break;
            case "Nine" :
                infix = infix + "9";
                break;
            case "DcmlPoint" :
                infix = infix + ".";
                break;
            case "Minus" :
                infix = infix + "-";
                break;
            case "Plus" :
                infix = infix + "+";
                break;
            case "Multiply" :
                infix = infix + "*";
                break;
            case "Division" :
                infix = infix + "/";
                break;   
            case "Equal" :
                infix = infix + "="; 
                postfix = sortStation.getRPN();

                System.out.println("Reverse polish notation: " + postfix + "\n");
                
                answer = sortStation.calculate( postfix );
                strAnswer = "" + answer;
                strAnswerTemp = "";

                if( strAnswer.charAt(strAnswer.length()-1) == '0' && 
                    strAnswer.charAt(strAnswer.length()-2) == '.'  ) {
                        int k=0;
                        while ( strAnswer.charAt(k) != '.' ) { 
                            strAnswerTemp = strAnswerTemp + strAnswer.charAt(k);
                            k++;
                        }
                    strAnswer=strAnswerTemp;
                }

                infix=infix+strAnswer;
                break;     
        }
        viewer.update(infix);
    }

    // Get infix notation of expression
    public String getInfix() {
        return infix;
    }

}