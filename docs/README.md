#### Exercise Inh.1

a. Which of the following assignments are legal, and why or why not?

```java
Person p1 = new Student(); //legal
Person p2 = new PhDStudent(); //legal
PhDStudent phd1 = new Student(); //illegal cannot store general (super class) in sub class PhDStudent
Teacher t1 = new Person(); //illegal cannot store super class in type person of sub class of teacher
Student s1 = new PhDStudent(); //legal
```

b. Suppose that we have the following legal declarations and assignments:

```java
Person p1 = new Person(); 
Person p2 = new Person();
PhDStudent phd1 = new PhDStudent();
Teacher t1 = new Teacher();
Student s1 = new Student();
```

Based on those just mentioned, which of the following assignments are legal,
and why or why not?

```java
s1 = p1; //illegal
s1 = p2; //illegal
p1 = s1; //legal
t1 = s1; //legal
s1 = phd1; //illegal
phd1 = s1; //legal
```

#### Exercise Inh.3

- What behaviour happens if you removed the `extends Post` from the class definition of `EventPost` then call `NewsFeed.addPost`? Explain why you think this happens.

the class doesnt compile because there are some varaibles like "author" which were inhereted from post, that is uncompileable when the extends post is removed. 
- What behaviour happens if you removed `super()` from the constructor of `EventPost` then call `NewsFeed.show`? Explain why you think this happens.

we get an exception of unresolved compilation problem
- What behaviour happens if you removed `super.display()` from the display methods `EventPost`? then call `NewsFeed.show`? Explain why you think this happens.

a lot of information is missing because the some fields are missing.
- When we have two classes with an inheritance relationship and they have a method with the same signature, what is this called?

overriding.



#### Exercise Ind.2


**a.** Argue the correctness of the algorithms using a loop invariant or proof
by induction.

Iteratively: we have the invariant res = 1, x^1, x^2, x^3 ... x^i.

Recursively: Lets assume that the base X = 2. then the base case is P(0) = 1 which is true because X^0 = 1, and we have P(1) = 2 and
P(2) = 4 which are also true(x^1 och x^2), which means that the method is correct for all  i < n and n can be infinate. which proves the correctness of the algorithm for all positivie i values when X = 2. Then we just repeat the process but with other bases like X = 3, X = 4....., and then we prove the correctness of the algorithim for all positive i and alla positive X bases.

**b.** Calculate the time-complexity as a function of n for both algorithms.
Give the result using Big-O notation.

the iterative algorithm has one for each loop which gives it a linear time complexity  Θ(n).

we will use the master theorem to determine the time complexity of the recursive algoritthm
T(n) = aT(n/b) + f(n).

f(n) = n^c, and c ≥ 0,

a is the number of the recursive branches.
b is the fractional size of the subproblem.
c is expontant of additional work to be done.

the time complexity of the algorithm is:

T(n) = Θ(n^c) if a < b^c,

T(n) = Θ(n^clog n) if a = b^c,

T(n) = Θ(nlog(b)a) if a > b^c.

the recursive algorithim is called two times which means that a=2, the size of the problem becomes half as big for every call which means that b=2, and the cost of making a guess is 1 which means thatt n^c=1 and therefore c=0.
a=2
b^c= 2^0=1 which means
a > b^c and the time complexity is T(n) = Θ(nlog(b)a)=T(n) = Θ(nlog(2)2)=Θ(n).
