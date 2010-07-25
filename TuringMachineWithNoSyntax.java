/* Requirements:
 * - no if, try, method declarations, throws, while, for, anonymous classes
 *
 * ARGS:
 *  0: tape
 *  1: state
 *  2: current index
 *  3: transition table (prefix "ABCDE" means at state A, if read a B, move C, write D, go to state E)
 *  4: reject state
 *  5: accept state
 *  6: should be a String repr of an int until time to terminate, then some arbitrary String
 */
public class TuringMachineWithNoSyntax {
    public static void main(String[] args){
        args[6] = "" +Integer.parseInt(args[6]); System.out.print(new String[]{
        "", "REJECT"}[((int)"a00000000000000000000000000000000000000000000000"+
        "00000000000000000000000000000000000000000000000000000000000000000000"+
        "00000000000000000000000000000000000000000000000000000000000000".
        charAt((Math.abs((int)(args[1].charAt(0)) - (int)(args[4].charAt(0)))))
        )/97]); args[6] = "" + Integer.parseInt("a000000000000000000000000000"+
        "00000000000000000000000000000000000000000000000000000000000000000000"+
        "00000000000000000000000000000000000000000000000000000000000000000000"+
        "00000000000000".charAt((Math.abs((int)(args[1].charAt(0)) - (int)(
        args[4].charAt(0)))))+""); System.out.print(new String[]{"", "ACCEPT"}[
        ((int)"a0000000000000000000000000000000000000000000000000000000000000"+
        "00000000000000000000000000000000000000000000000000000000000000000000"+
        "000000000000000000000000000000000000000000000000".charAt(Math.abs((int
        )(args[1].charAt(0)) - (int)(args[5].charAt(0)))))/97]); args[6] = "" +
        Integer.parseInt("a00000000000000000000000000000000000000000000000000"+
        "00000000000000000000000000000000000000000000000000000000000000000000"+
        "00000000000000000000000000000000000000000000000000000000000".charAt(
        Math.abs((int)(args[1].charAt(0)) - (int)(args[5].charAt(0))))+"");
        args[0] = args[0].substring(0, Integer.parseInt(args[2])) + (args[0].
        charAt(Integer.parseInt(args[2])) + "" + args[3].charAt(3)).charAt((((
        int)"a000000000000000000000000000000000000000000000000000000000000000"+
        "00000000000000000000000000000000000000000000000000000000000000000000"+
        "0000000000000000000000000000000000000000000000".charAt((Math.abs(((int
        ) args[1].charAt(0)) - ((int) args[3].charAt(0)))))/97) * ((int)"a000"+
        "00000000000000000000000000000000000000000000000000000000000000000000"+
        "00000000000000000000000000000000000000000000000000000000000000000000"+
        "00000000000000000000000000000000000000".charAt((Math.abs(((int) args[
        0].charAt(Integer.parseInt(args[2]))) - ((int) args[3].charAt(1)))))/97
        ))) + args[0].substring(Integer.parseInt(args[2])+1, args[0].length());
        args[2] = "" + (Integer.parseInt(args[2]) + (((((int) args[3].charAt(2)
        ) - 76) / 3) - 1) * (((int)"a0000000000000000000000000000000000000000"+
        "00000000000000000000000000000000000000000000000000000000000000000000"+
        "00000000000000000000000000000000000000000000000000000000000000000000"+
        "0".charAt((Math.abs(((int) args[1].charAt(0)) - ((int) args[3].charAt(
        0)))))/97) * ((int)"a000000000000000000000000000000000000000000000000"+
        "00000000000000000000000000000000000000000000000000000000000000000000"+
        "0000000000000000000000000000000000000000000000000000000000000".charAt(
        (Math.abs(((int) args[0].charAt(Integer.parseInt(args[2]))) - ((int)
        args[3].charAt(1)))))/97))); args[1] = "" + (args[1] + args[3].charAt(4
        )).charAt((((int)"a00000000000000000000000000000000000000000000000000"+
        "00000000000000000000000000000000000000000000000000000000000000000000"+
        "00000000000000000000000000000000000000000000000000000000000".charAt((
        Math.abs(((int) args[1].charAt(0)) - ((int) args[3].charAt(0)))))/97) *
        ((int)"a0000000000000000000000000000000000000000000000000000000000000"+
        "00000000000000000000000000000000000000000000000000000000000000000000"+
        "000000000000000000000000000000000000000000000000".charAt((Math.abs(((
        int) args[0].charAt(Integer.parseInt(args[2]))) - ((int) args[3].
        charAt(1)))))/97))); args[3] = args[3].substring(5, args[3].length())+
        args[3].substring(0,5);main(args);
    }
    
    // Before minification:
    public static void main2(String[] args) {        
        args[6] = "" + Integer.parseInt(args[6]);
        
        String key = "a0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" +
                     "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" ;
        
        // Check if rej state
        int diff = Math.abs((int)(args[1].charAt(0)) - (int)(args[4].charAt(0)));
        char diffChar = key.charAt(diff);
        System.out.print(new String[]{"", "REJECT"}[((int)diffChar)/97]);
        args[6] = "" + Integer.parseInt(diffChar+"");
        
        // Check if accept state
        diff = Math.abs((int)(args[1].charAt(0)) - (int)(args[5].charAt(0)));
        diffChar = key.charAt(diff);
        System.out.print(new String[]{"", "ACCEPT"}[((int)diffChar)/97]);
        args[6] = "" + Integer.parseInt(diffChar+"");
        
        // Check if we're at right transition
        int stateDiff = Math.abs(((int) args[1].charAt(0)) - ((int) args[3].charAt(0)));
        int readDiff  = Math.abs(((int) args[0].charAt(Integer.parseInt(args[2]))) - ((int) args[3].charAt(1)));
        int dir       = ((((int) args[3].charAt(2)) - 76) / 3) - 1; // L = 76, R = 82; 82-76=6.../3=2...-1 = 1
        int isMatch   = ((int)key.charAt(stateDiff)/97) * ((int)key.charAt(readDiff)/97);
        
        // Write
        args[0] = args[0].substring(0, Integer.parseInt(args[2])) +
                 (args[0].charAt(Integer.parseInt(args[2])) + "" + args[3].charAt(3)).charAt(isMatch) +
                  args[0].substring(Integer.parseInt(args[2])+1, args[0].length());
           
        // Move ('a' is 97 so if diff is 0 then phrase'll be 1, otherwise 0)
        args[2] = "" + (Integer.parseInt(args[2]) + dir * isMatch);
        
        // Update current state
        args[1] = "" + (args[1] + args[3].charAt(4)).charAt(isMatch);
        
        // Cycle transition
        args[3] = args[3].substring(5, args[3].length()) + args[3].substring(0,5);
        
        main2(args);
    }
}