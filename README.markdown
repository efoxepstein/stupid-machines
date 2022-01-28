# ⚙️ Stupid Machines🦾
### Is bunch of useless implementations of our favorite abstract machines, including Turing machines, the Rule 110 cellular automata, and cyclic tag systems.
 <img src="https://user-images.githubusercontent.com/29699356/151624859-f7abc5b3-52e1-4e1a-881d-1bfac61e3832.png" height="300">

# Live demo:
#  [Github pages](https://efoxepstein.github.io/stupid-machines/rule110/)
 [Raw file](./rule110/)
## rule110
Implements rule 110 in HTML and CSS3. This is a more correct "proof" that CSS is Turing-complete.
<img src="https://user-images.githubusercontent.com/29699356/151625734-1a840406-1fe2-4664-95d2-861819d21336.png" height="300">

## rule110-old/
Implements rule 110 in HTML and CSS3. This was the first "proof" that CSS is Turing-complete. It is not a valid proof.

* `rule110-a.html` is a very simple demo of an individual cell
* `rule110-grid.html` and `rule110-full.html` are two different presentations of the cellular automaton.
 
<img src="https://user-images.githubusercontent.com/29699356/151626109-9e710813-80c1-445f-bf1c-d27dbae757c7.png" height="300">

## TuringMachineWithNoSemicolons.java
Implements a Turing machine in Java without using a single semicolon in the file. Languages like Ruby and Python don't use semicolons, so why should my Java?
```java
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

```
## TuringMachineWithNoSyntax.java
Implements a Turing machine in Java without using control structures, variable declarations, method definitions, or anonymous classes. The `main2` method shows the code before I removed variables. Control structures are too controlling for this day and age. Us youth yearn for the unstructured hippie days of our parents' generations.

<img src="https://user-images.githubusercontent.com/29699356/151625510-c42f5eda-b957-4038-9303-69167c0af036.png" height="300">

## short\_cyclic\_tag\_system.rb
```ruby
a='11001';%w[010 000 1111].cycle{|x|(p a)>'09'&&a<<x;a[0]=''}
```
This is the shortest implementation of an abstract machine that I could think of. If you have ideas to improve, send a pull request. Verbosity is a sin.
