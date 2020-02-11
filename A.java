public class A extends B{
    private int data;

    public A(int data){
        super();
        this.data = data;
    }

    @Override
    public String toString(){
        return new String("Value of data in A is: " + Integer.toString(data));
    }
}