/*
 * Class Name: RoachMotel
 * Purpose: To implement the singleton design pattern
 */
package designpatternsproject;

/**
 *
 * @author ericpalma
 */
public class RoachMotel {
    private static RoachMotel uniqueInstance;
    
    //private constructor
    private RoachMotel(){};
    
    public synchronized static RoachMotel getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new RoachMotel();
        }
        return uniqueInstance;
    }
}
