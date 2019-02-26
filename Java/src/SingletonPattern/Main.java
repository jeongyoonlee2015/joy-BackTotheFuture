public class Main{
    public static void main(String[] args){
        SystemSpeaker speaker1 = SystemSpeaker.getInstance();
        SystemSpeaker speaker2 = SystemSpeaker.getInstance();
        

        speaker1. setVolume(11);
        System.out.println(Speaker1.getVolume());
        System.out.println(Speaker2.getVolume());

        speaker2. setVolume(22);
        System.out.println(Speaker1.getVolume());
        System.out.println(Speaker1.getVolume());
 
        //Can see that it is the same instance
    }
}