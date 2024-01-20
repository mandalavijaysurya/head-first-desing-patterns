### This is the place where I update about the exercise and write the notes here

As per the Chapter 1, Joe needs to create a _DuckSumApp_ which just display about the information about duck

This creating of subclasses and overriding the functionality I would not achieve code re-usability.


What if we need to add new functionality to duck class . let's say run() method? 
* We can come up with an idea that we add the _run()_ method into duck class
* But for every different type of class we need to modify the method. This is doable but maintaining this would be hectic 

So what do we need to do? 

* If you think we can ues interface here, would solve the issue. But it is not to full extent
* A Design principle would solve the issue and Design pattern is **Separating what changes from what stays same**
* We know that _display()_, _fly()_, _quack()_ and _run()_ methods change in between the classes. We need to differentiate these things

For the things which are getting changed sometimes, we need to create an interface and implementation to this interface will be given in its subclass.
See code 