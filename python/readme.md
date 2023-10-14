# Computer Science II
## Lab 2.0 - Conditionals & Loops
### Python Version
[School of Computing](https://computing.unl.edu)  
[College of Engineering](https://engineering.unl.edu/)  
[University of Nebraska-Lincoln](https://unl.edu)  
[University of Nebraska-Omaha](https://unomaha.edu)  

An introduction to using conditionals and loops in the Python programming language.

### Resources

Prior to lab you should read/review Sections 4.1 - 4.3
in the Python documentation:

https://docs.python.org/3/tutorial/controlflow.html


### Lab Objectives & Topics

Following the lab, you should be able to:
* Use `if-else` statements to control the logical flow of a
  program.
* Use `for`, `while` loops and comprehensions in a Python
  program.
* Write complex programs that require conditional logical statements
  and loops.

### Peer Programming Pair-Up

To encourage collaboration and a team environment, labs will be
structured in a *pair programming* setup.  At the start of
each lab, you may be randomly paired up with another student by
a lab instructor.  One of you will be designated the *driver*
and the other the *navigator*.  

The navigator will be responsible for reading the instructions
and telling the driver what is to be done.  The driver will be
in charge of the keyboard and workstation.  Both driver and
navigator are responsible for suggesting fixes and solutions
*together*.  Neither the navigator nor the driver is "in charge."  
Beyond your immediate pairing, you are encouraged to help and
interact and with other pairs in the lab.

Each week you should try to alternate: if you were a driver
last week, be a navigator next, etc.  Resolve any issues (you
were both drivers last week) within your pair.  Ask the lab
instructor to resolve issues only when you cannot come to a
consensus.  

Because of the peer programming setup of labs, it is absolutely
essential that you complete any pre-lab activities and familiarize
yourself with the handouts prior to coming to lab.  Failure to do
so will negatively impact your ability to collaborate and work with
others which may mean that you will not be able to complete the
lab.  

## 1. Getting Started

Clone this project code for this lab from GitHub using the
URL: https://github.com/cbourke/CSCE156-Lab02. Refer to Lab 1.0 for
instructions on how to clone a project from GitHub.

## 2. Conditionals & Loops

Python provides standard control structures for conditionals and
repetition. Specifically, the usual if-else-if statements
and while and for loops are supported but the syntax, keyword and
style may differ from what you are familiar with.  Python encourages
users to do things the "pythonic" way.  

### Basic Conditionals

Conditional statements will look familiar but will use different
syntax.

```python
if x > 0:
  print("x is positive!")
  x += 1
```

Observe:
  * Conditions are not generally enclosed in parentheses
  * There is a colon after the if statement indicating the code block
  * Indentation is used to denote code blocks instead of curly brackets

```python
if x > 0:
  print("x is positive!")
  x += 1
elif x == 0:
  printf("x is zero!")
  x += 10
```

  * For else-if conditions you use the keyword `elif`

```python
if x > 0:
  print("x is positive!")
  x += 1
elif x == 0:
  printf("x is zero!")
  x += 10
else:
  printf("x is negative!")
```

  * As with other languages, the else-if and `else` blocks are optional
  * Any number of `elif` blocks can be defined


### Basic Loops

Python supports the usual `while` loops.

```python
numDigits = 0
while n > 0:
  n // 10
  numDigits += 1
```

Note: Python does *not* support the usual single increment/decrement
operators such as `i++` and `i--`!

Instead of "idiomatic" for loops (with the three elements of
initialization, continuation and iteration), you generally
use a `for` loop with the the `range()` function:

```python
for i in range(10):
  print(i)
```

The `range(n)` function produces a sequence that by default
  * Starts at zero
  * Increments by 1 and
  * ends at `n-1`
Thus the above loop will print out integers 0 thru 9.  

You can provide additional *optional* arguments to `range()`
to changes its behavior:
  * `range(5, 10)` iterates from 5 to 9
  * `range(0, 10, 2)` iterates from 0 to 9 but by increments of 2 and so
  produces the sequence 0, 2, 4, 6, 8

When iterating over elements in a list or set, you use a
simple for (each) loop.  

```python
primes = [2, 3, 5, 7, 11, 13, 17, 19]
for x in primes:
  print(x)
```

To iterate over elements in a dictionary, there are several options.

```python
rgb = {
  "green":  (0, 255, 0),
  "orange": (255, 165, 0),
  "blue":   (70, 130, 180)
}

# iterate over the keys and get the values:
for key in rgb:
    print(f"{key} has value {rgb[key]}")

# iterate over just the values:
for value in rgb.values():
    print(f"{value}")

# iterate over pairs using .items():
for key, value in rgb.items():
    print(f"{key} maps to {value}")
```

### Comprehensions

If your intent is to create a new collection, often it is better and
more "pythonic" to utilize *comprehensions* which are similar to set
builder notation in math.

```python
numbers = [3, 5, 2, 7, 9, 1, 4, 2, 8]

# new (sub) lists:
evens = [x for x in numbers if x % 2 == 0]
print(evens)

small = [x for x in numbers if x < 5]
print(small)

# entirely new lists from another:
double = [2*x for x in numbers]
print(double)

# a double comprehension similar to nested loops
# the result is a list of *pairs* or tuples
pairs = [ (x, y) for x in numbers for y in numbers]
print(pairs)
```

## 3. Activities

### 3.1 Sum of Natural Numbers

Natural numbers are the usual counting numbers; 1, 2, 3, ... In this
exercise you will write several loops to compute the sum of natural
numbers 1 thru `n` where `n` is read from the command line.

1.  Open the `natural.py` source file. The code to read in `n` as a
    command line argument has been provided for you.

2.  Write a `for`-loop and a `while`-loop in the relevant functions to
    compute the sum of natural numbers 1 thru `n` and return the
    result.  In the `main` function call your functions and output
    the results.  Use this program as an ad-hoc tester to make sure
    you functions work.

3.  Once you are reasonably sure your functions are correct, run the
    provided unit test suite: `python test_natural.py`  

### 3.2 Child Tax Credit

When filing for federal taxes, a credit is given to tax payers with
dependent children according to the following rules. The first dependent
child younger than 18 is worth a $1,000.00 credit. Each dependent child
younger than 18 after the first child is worth a $500 tax credit each.
You will complete a Python script to output a table of dependent children,
how much each contributes to a tax credit, and a total child tax credit.
Your table should look *something* like the following.

```text
Child            Amount
Tommy (14)       $ 1000.00
Richard (12)     $  500.00
Harold (21)      $    0.00
Total Credit:    $ 1500.00
```

1.  Open the `child.py` and `child_credit.py` script files

2.  A `Child` class has already been defined and included in the
    `child_credit.php` script. Observe how the `Child` class is used.
    Several instances of children have been created and placed
    into a list.

3.  Implement the `generateReport` function: it should take a list
    of children, iterate over it and output output a table similar to
    the one above.  Your function should then return the total credit.
    Note: to access a member variable, use the dot operator; example:
    `tom.age` (Python does not have private member variables)

4.  Test your implementation by the provided unit test suite:
    `python test_natural.py`  

### 4. Testing, Submitting & Grading

* Test your programs, fix any errors, and completely debug your programs
* Submit the following files:
  * `natural.py`
  * `child_credit.py`
* Run the grader and verify the output to complete your lab

### Advanced Activity (Optional)

Add your own test cases to both test suites to learn how Python's
`unittest` works.
