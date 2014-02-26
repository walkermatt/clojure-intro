# Intro to Clojure

## Clojure is a dialect of Lisp

* Shares with Lisp the code-as-data philosophy and a powerful macro system.

## A functional programming language

* Favours immutable, persistent data structures (values don't change)
* Not a strictly pure language which makes it practical

Sum a list of numbers in Python:

    >>> sum = 0
    >>> for n in [1, 2, 3]:
    ...   sum = sum + n
    ... 
    >>> sum
    6

Sum a list of numbers in Clojure:

    user=> (reduce + [1 2 3])
    6

## Enables concurrency and shared state

* Offers a software transactional memory system (think transactions in a database) and reactive Agent system that ensure clean, correct, multithreaded designs.

## Dynamic and encourages iterative development

* Compiled at runtime allowing runtime access to all features
* Favours developing with a Read Eval Print Loop (REPL)

## Examples

A basic set of examples can be found in `src/intro/core.clj` and ran in a REPL.

### Setup

To run the examples:

* Clone this repository,
* [Install Leiningen](https://github.com/technomancy/leiningen#installation)
* Change to the project directory and run `lein repl` to open a REPL that you can copy the examples into

## Attribution and License

The examples are taken from [http://learnxinyminutes.com/docs/clojure/](http://learnxinyminutes.com/docs/clojure/) (licensed under [CC BY-SA 3.0](http://creativecommons.org/licenses/by-sa/3.0/deed.en_US)). This project is also licensed under [CC BY-SA 3.0](http://creativecommons.org/licenses/by-sa/3.0/deed.en_US).
