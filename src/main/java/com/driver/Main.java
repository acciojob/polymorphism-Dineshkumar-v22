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
    double f=1.2,e=1.7;
  int k= p.product(x,y);
  int j= p.product(x,y,z);
   int q=p.product(f,e);
   System.out.print(k+" "+j+" "+q+" ");
}

}