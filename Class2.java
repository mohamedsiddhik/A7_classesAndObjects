
/*A class is a template or blueprint from which objects are created.
 So, an object is the instance(result) of a class.
 */

class  Rectange
{
    int length, width;

    void getDetails(int x , int y)
    {
        length = x;
        width = y;
    }

    int area(){
        int a = length * width;
        return  a;
    }

     double daigonal(){
        double b = Math.sqrt((length*length) + (width*width));
        return  b;
     }

     int perimeter(){
        int c = 2*(length + width);
        return  c;
     }
}




public  class Class2
{
    public static void main(String[] args) {

        Rectange r1 = new Rectange();
        r1.length = 5;
        r1.width = 7;
        System.out.println(r1.area());
        System.out.println("Area of Rectangle : " + r1.area());

        Rectange r2 = new Rectange();
        r2.getDetails(3,5);
        System.out.println("Area of Rectangle " + r2.area());

        Rectange r3 = new Rectange();
        r3.getDetails(3,4);
        System.out.println("Area of Daigonal : " + r3.daigonal());

        Rectange r4 = new Rectange();
        r4.getDetails(8,4);
        System.out.println("Area of Perimeter : " + r4.perimeter());

    }
}