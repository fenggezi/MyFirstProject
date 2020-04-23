package designpatterns;

public class SingleTon {
    private static volatile SingleTon singleTon;

    private SingleTon(){}

    public static SingleTon getSingleTon(){ // 获取对象的金泰方法
        if(singleTon!=null){ // 这里判断对象是否存在 如果存在不必取获取锁
            synchronized (SingleTon.class){//获取重量锁
                if(singleTon!=null){
                    singleTon = new SingleTon();// 创建对象
                }
            }
        }
        return singleTon;// 返回对象
    }
    // 这个方法可能会呗序列化破坏 所以需要加航一个方法

    private Object readResolve(){
        return singleTon;
    }
}
