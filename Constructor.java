
/*
 a constructor is a block of codes similar to the method it's called when an instance of the class is created.
 */
class  shapeConstructor
{

    int width, length;

    public  shapeConstructor()
    {
        System.out.println("Constructor called");
        length = 2;
        width = 4;
    }

     int area()
     {
         int a = length * width;
         return  a;
     }



}
public  class Constructor
{
    public static void main(String[] args)
    {
        shapeConstructor sr1 = new shapeConstructor();
        sr1.width = 5;
        sr1.length =4;
        System.out.println("Area of Rectangle is " + sr1.area());
    }
}