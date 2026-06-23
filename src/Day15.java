public class Day15 {
    static void main() throws InterruptedException{
        Runnable chefTasks = () -> {
            String[] items = {"Burger","Dosa","Coffee"};
            for(int i = 0; i < items.length;i++){
                System.out.println("Cooking Items:"+items[i]);
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        };
        Thread chefThread = new Thread(chefTasks, "chef-thread");
        chefThread.start();
        chefThread.join();
    }
}