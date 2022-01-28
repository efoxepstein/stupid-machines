# Stupid Machines
### Is bunch of useless implementations of our favorite abstract machines, including Turing machines, the Rule 110 cellular automata, and cyclic tag systems.
![image](https://user-images.githubusercontent.com/29699356/151624859-f7abc5b3-52e1-4e1a-881d-1bfac61e3832.png)

## rule110
Implements rule 110 in HTML and CSS3. This is a more correct "proof" that CSS is Turing-complete.

## rule110-old/
Implements rule 110 in HTML and CSS3. This was the first "proof" that CSS is Turing-complete. It is not a valid proof.

* `rule110-a.html` is a very simple demo of an individual cell
* `rule110-grid.html` and `rule110-full.html` are two different presentations of the cellular automaton.

## TuringMachineWithNoSemicolons.java
Implements a Turing machine in Java without using a single semicolon in the file. Languages like Ruby and Python don't use semicolons, so why should my Java?

<img src="https://user-images.githubusercontent.com/29699356/151625086-4e2924c4-59ac-408d-8d5b-dbfb7ea1f483.png" height="300">
## TuringMachineWithNoSyntax.java
Implements a Turing machine in Java without using control structures, variable declarations, method definitions, or anonymous classes. The `main2` method shows the code before I removed variables. Control structures are too controlling for this day and age. Us youth yearn for the unstructured hippie days of our parents' generations.

## short\_cyclic\_tag\_system.rb
```ruby
a='11001';%w[010 000 1111].cycle{|x|(p a)>'09'&&a<<x;a[0]=''}
```
This is the shortest implementation of an abstract machine that I could think of. If you have ideas to improve, send a pull request. Verbosity is a sin.
