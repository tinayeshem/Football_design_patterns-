public class League_manager {

    private static  League_manager instance;

    private League_manager(){
        //private to prevent instantiation from outside sources
    }

    public static  League_manager getInstance(){
        if (instance==null){
            synchronized (League_manager.class){
                if(instance==null){
                    instance = new League_manager();
                }
            }

        }
        return instance;
    }

}
