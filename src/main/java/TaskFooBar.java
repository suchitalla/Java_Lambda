public class TaskFooBar{

    int n=0;
    TaskFooBar(int n){
        this.n = n;
    }
    public void foo()  {
        for (int i = 0; i < n; i++) {
            System.out.print("foo");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void bar() {
        for (int i = 0; i < n; i++) {
            System.out.print("bar");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
