public class Day14a {
    interface Notification {
        void send(String to,String Message);
    }
    static class EmailNotification implements Notification {
        @Override
        public void send(String to,String Message){
            System.out.println("sending Email:"+ Message + ",to" + to );
        }
    }
     static class WhatsappNotification implements Notification{
        @Override
        public void send(String to,String Message){
            System.out.println("sending WhatsApp:"+Message+",to"+to);
        }
    }
    static Notification getNotification(Day14a factory , String type){
        return switch (type){
            case "Email"-> new EmailNotification();
            case "WhatsApp"-> new WhatsappNotification();
            default -> throw new IllegalArgumentException("Invaild Notification type:" +type);

        };
    }
    static void main(){
        Day14a factory = new Day14a();
        String type = "WhatsApp";
        getNotification(factory,type).send("1233456789","Hello deepu");
    }
}