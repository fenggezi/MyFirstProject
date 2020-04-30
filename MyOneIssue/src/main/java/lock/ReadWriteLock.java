package lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLock {

    Map<String ,Object> map = new HashMap<>();

    ReentrantReadWriteLock rw = new ReentrantReadWriteLock();
    public void put(String str,Object obj){
        rw.writeLock().lock();
        try {
            map.put(str,obj);

        }catch (Exception e){

        } finally {
            rw.writeLock().unlock();

        }

    }
    public void get(String str){
        rw.readLock().lock();
        try {
            map.get(str);

        }catch (Exception e){

        } finally {
            rw.readLock().unlock();

        }
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }
}
