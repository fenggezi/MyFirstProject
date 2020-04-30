package thred.xianchen;

public class TestShenchanxiaofei {

    public static void main(String[] args) {
        shenchanxiaofei sh = new shenchanxiaofei();
        new Thread(()->{
            for (int i = 0; i <6 ; i++) {
                sh.increment();
            }
        },"AA");


        new Thread(()->{
            for (int i = 0; i <6 ; i++) {
                sh.deIncrement();            }
        },"BB");
    }


}
