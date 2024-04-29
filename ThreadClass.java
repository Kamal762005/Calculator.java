//Demonstrate creation of threads using Thread class.
class ThreadClass extends Thread{
    public 
    int a,b;
    ThreadClass(int a,int b){
        this.a=a;
        this.b=b;
    }
    void add(){
        System.out.println("addition of two numbers is : "+(a+b));
    }
    public void run(){
        add();
    }
    public static void main(String[] args) {
        ThreadClass x= new ThreadClass(12, 32);
        ThreadClass x1= new ThreadClass(652, 32);
        x.start();
        x1.start();
    }
}
