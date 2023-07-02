https://blog.csdn.net/yamaxifeng_132/category_6687061.html

同一个类的对象使用不同的内存段，但静态成员共享相同的内存空间

属性可以是简单变量，也可以是一个对象

抽象方法不能是static，静态方法不能被重写、继承、实现

this 和 super 不能使用在main方法中

字符串与基本数据类型链接的问题,如果第一个是字符串那么后续就都按字符串处理，比如上边例子要是System.out.println(“(Result)”+6 + 6 );那么结果就是(Result)66，如果第一个和第二个。。。第n个都是基本数据第n+1是字符串类型，那么前n个都按加法计算出结果在与字符串连接

父类的引用指向子类的实例，则调用子类的方法

通过String bStr = aStr;这句代码使bStr和aStr指向同一个地址空间，所以最后aStr和bStr的结果应该是一样，String类是定长字符串，调用一个字符串的方法以后会形成一个新的字符串。

方法加载的时候创建局部变量

三目运算符中：第二个表达式和第三个表达式中如果都为基本数据类型，整个表达式的运算结果，由容量高的决定。99.9是double类型 而9是int类型，double容量高。

实例方法不可直接调用超类的私有实例方法

````java
for(Short i=0;i<100;i++)
{
    s.add(i);
    s.remove(i-1);
}
````
i是Short类型 i-1是int类型,其包装类为Integer，所以s.remove(i-1);不能移除Set集合中Short类型对象。

````java
    //null应该小写
    String str = NULL;
````

多线程共享相同的数据，使用synchronized实现数据同步。

````java
public class OuterClass {
private double d1 = 1.0;
//insert code here
}

You need to insert an inner class declaration at line2. Which two inner class declarations are valid? (Choose Two)
A. static class InnerOne { public double methoda() {return d1;} }
B. static class InnerOne { static double methoda() {return d1;} }
C. private class InnerOne { public double methoda() {return d1;} }
D. protected class InnerOne { static double methoda() {return d1;} }
E. public abstract class InnerOne { public abstract double methoda(); }

/*
解答：CE

        AB.内部类可以声明为static的，但此时就不能再使用外层封装类的非static的成员变量；

        D.非static的内部类中的成员不能声明为static的，只有在顶层类或static的内部类中
 */
````

修饰接口可以是public和默认








