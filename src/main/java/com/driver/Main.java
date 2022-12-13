package com.driver;

public class Main {

    public class Product{
        public int product(int x, int y)
        {
return x*y;
        }
        public int product(int x, int y, int z) {
return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }
public void main(String [] args)
{
    Product p = new Product();
    int x=1,y=1,z=1;
    double f=1,e=1;
   p.product(x,y);
   p.product(x,y,z);
   p.product(f,e);
}

}