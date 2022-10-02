public class prac1oops {
    public static void main(String args[]){  
        complex c= new complex(3,5);// first input 
        complex d= new complex(2, 6);//second input
        complex e=complex.add(c,d);
        complex f= complex.diff(c, d);
        complex g= complex.product(c, d);

        e.print();
        f.print();
        g.print();
    }    
}
class complex{
    int real;
    int imag;
    complex(int r,int i ){
        real=r;
        imag=i;
    }

    public static complex add(complex a, complex b){
        return new complex((a.real+b.real),(a.imag+b.imag));
    }

    public static complex diff(complex a, complex b){
        return new complex((a.real-b.real),(a.imag-b.imag));
    }

    public static complex product(complex a, complex b){
        return new complex(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag+b.real)));
    }

    public void print(){
        if(real==0  &&  imag!=0){
            System.out.println(imag+"i");
        }
        else if(imag==0 && real!=0){
            System.out.println(real);

        }
        else{
            System.out.println(real+"+"+imag+"i");
        }
    }

}


