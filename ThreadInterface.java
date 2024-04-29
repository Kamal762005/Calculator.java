//Demonstrate creation of threads using Thread interface.
class ThreadInterface implements Runnable{
    public int a,b;
    ThreadInterface(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void run(){
        add();
    }
    void add(){
        System.out.println("addition of two numbers is : "+(a+b));
    }
    public static void main(String[] args) {
        ThreadInterface x=new ThreadInterface(12, 25);
        ThreadInterface x1=new ThreadInterface(154, 295);
        x.run();
        x1.run();
    }
}
