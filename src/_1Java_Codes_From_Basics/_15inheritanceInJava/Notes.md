#Note Must Remember While Using Inheritance
1. In order to relate two classes we can use extends keywords.
2. Inheritance promotes  IS- A  relationship.
3. Whenever the object of child class is created the memory is allocated for the instance variable of both parent and child class.
4. Private members will not participate in the inheritance. This rule is made to promote ENCAPSULATION.
5. Child class can call the instance method of parent class directly.
6. The child class can call the inherited static methods directly.
7. Unlike the private members constructors are also doesn't participate in the inheritance.
    - for 'default constructor'
    - for 'parameterized constructor'
8. Even though the parameterized constructor of a sub-class is called yet, the default constructor in the super class is executed first then the parameterized constructor of the sub-class is executed.
9. If the parameterized constructor of the super class has to be executed then parameter super should be used in the sub-class
