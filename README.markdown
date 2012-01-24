# Stupid Machines
This repository contains a bunch of useless implementations of our favorite abstract machines, including Turing machines, the Rule 110 cellular automata, and cyclic tag systems.

## rule110/
Implements rule 110 in HTML and CSS3. This was the first proof ever that CSS is Turing-complete.

* `rule110-a.html` is a very simple demo of an individual cell
* `rule110-grid.html` and `rule110-full.html` are two different presentations of the cellular automaton.

## TuringMachineWithNoSemicolons.java
Implements a Turing machine in Java without using a single semicolon in the file. Languages like Ruby and Python don't use semicolons, so why should my Java?

## TuringMachineWithNoSyntax.java
Implements a Turing machine in Java without using control structures, variable declarations, method definitions, or anonymous classes. The `main2` method shows the code before I removed variables. Control structures are too controlling for this day and age. Us youth yearn for the unstructured hippie days of our parents' generations.

## short\_cyclic\_tag\_system.rb
This is the shortest implementation of an abstract machine that I could think of. If you have ideas to improve, send a pull request. Verbosity is a sin.