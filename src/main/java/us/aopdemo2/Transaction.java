package us.aopdemo2;

/**
 * @author zzr
 */
public class Transaction {

    public void beginTsaction(){
        System.out.println("beginTransaction");
    }

    public void commit(){
        System.out.println("commit");
    }

}
