package Singleton;

public class League_manager {

    private static  League_manager instance;

    private League_manager(String name){
        //private to prevent instantiation from outside source
        System.out.print("Manager Name: " + name);
    }

    public static  League_manager getInstance(String name){
        if (instance==null){
            synchronized (League_manager.class){
                if(instance==null){
                    instance = new League_manager(name);
                }
            }

        }
        return instance;
    }

}
