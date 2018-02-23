/**
 * @author Eli Fox-Epstein
 */
 public class TuringMachineWithNoSemicolons {
    /* ARGS:
     *  0: tape
     *  1: state
     *  2: current index
     *  3: transition table (prefix "ABCDE" means at state A, if read a B, move C, write D, go to state E)
     *  4: reject state
     *  5: accept state
     * 
     * Example use: a turing machine that recognizes the languages of words of the form: 0^jELI
     *
     * One way to write a machine for this is with the following rules:
     *      at A, if 0, move R, write _, goto A
     *      at A, if E, move R, write _, goto B
     *      at B, if L, move R, write _, goto C
     *      at C, if I, move R, write _, goto +
     * A test case:
     *      java TuringMachineWithNoSemicolons 00000ELI A 0 A0R_AAER_BBLR_CCIR_+ - +
     *
     * This machine will not halt on most inputs.
     * TODO: use stream() api with lambda expressions.
     */
    public static void main(String[] args) {
        while(!args[1].equals(args[4]) && !args[1].equals(args[5])){
            if((args[1] + args[0].charAt(Integer.parseInt(args[2]))).equals(args[3].substring(0,2))){
                                                    
                // Write
                if((        args[0] = args[0].substring(0, Integer.parseInt(args[2])) +
                                      args[3].charAt(3) +
                                      args[0].substring(Integer.parseInt(args[2])+1, args[0].length())
                ) == ""){}

                if(args[3].charAt(2) == 'L'){
                    if((    args[2] = (Integer.parseInt(args[2])-1) + ""            ) != ""){}                    
                }else{
                    if((    args[2] = (Integer.parseInt(args[2])+1) + ""            ) != ""){}
                }
                
                // Update current state
                if((        args[1] = args[3].charAt(4) + ""                        ) != ""){}
                
            }else{
                // Cycle transition table
                if((args[3] = args[3].substring(5, args[3].length()) + args[3].substring(0,5)) != ""){}
            }
        }
        if(args[1].equals(args[4])){
            if(System.out.printf("REJECT: " + args[0]) == null){}
        }else if(System.out.printf("ACCEPT: " + args[0]) == null){}
    }
}
