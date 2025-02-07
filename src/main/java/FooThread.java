public class FooThread implements Runnable{

    TaskFooBar tfb;
    FooThread(TaskFooBar tfb){
        this.tfb = tfb;
    }

    @Override
    public void run() {

        tfb.foo();


    }
}
