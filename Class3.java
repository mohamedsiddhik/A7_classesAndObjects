

class  ShapeRectangle
{
    private  int length , width;

    int getLength()
    {
        return  length;
    }

    int getWidth()
    {
        return  width;
    }

    void  setLength(int l)
    {
        if (l > 0)
            length = l;
        else
            length =0;
    }

    void  setWidth(int w)
    {
        if (w > 0)
            width = w;
        else
            width = 0;
    }

    int area()
    {
        int a = length * width;
        return  a ;
    }

}

public  class Class3
{
    public static void main(String[] args)
    {
        ShapeRectangle sr1 = new ShapeRectangle();
        sr1.setLength(3);
        sr1.setWidth(8);
        System.out.println("Length of : " + sr1.getLength());
        System.out.println("Width of : " + sr1.getWidth());
        System.out.println("Area of Rectangle : " + sr1.area());
    }
}