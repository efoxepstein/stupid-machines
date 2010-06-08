/**
 * @author Eli
 */
 public class TuringMachineWithNoSemicolons {
    /* ARGS:
     *  0: tape
     *  1: state
     *  2: current index
     *  3: transition table (prefix "ABCDE" means at state A, if read a B, move C, write D, go to state E)
     *  4: reject state
     *  5: accept state
     *  6: flag
     *  7: scratch
     * 
     * Example use:
     * java TuringMachineWithNoSemicolons 10011011011011X A 0 A0R1AA1R0AAXRX+ - +
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