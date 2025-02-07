public class BarThread implements Runnable{

        TaskFooBar tfb;
    BarThread(TaskFooBar tfb){
        this.tfb = tfb;
    }

        @Override
        public void run() {

            tfb.bar();

        }

}
