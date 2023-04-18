# Java_Shapes

The purpose of this program is to allow the user to calculate various statistical measures for one of the following shapes: Circle, Rectangle, Square, Sphere, Cylinder, Pyramid. For the 2D shapes, area and perimeter is calculated. For the 3D shapes, the surface area, total length of edges, and volume is calculated.

The Main class acts as a user interface, where the user can
- see a menu displaying all 6 shapes
- select one shape to calculate its statistical features
- choose to run the program again

The Main class has an object for the class of each shape.

Shape is an abstract class with one defined method: stateShape(String shape) -> displays the selected shape's name, and two abstract methods: calculateArea() and calculatePerimeter(). The abstract methods are designed to be overwritten in each shape's class in accordance with the respective formula required for calculation.

Volume is an interface with one abstract method: calculateVolume(), designed to be overwritten in each of the 3D shapes' class. The difference is that interfaces can only have abstract methods and allows java programs to support multiple inheritance. This is crucial as the classes for 3D shapes require methods from both Shape and Volume. 

This is achieved by defining each class as: public class (3D shape name) extends Shape implements Volume{...}.

Each shape's class accepts user input within a constructor. Private variables of type double are used for storing the entered numbers with the help of Scanner. This allows the same input value to be used in calculations across multiple methods within the same class.
