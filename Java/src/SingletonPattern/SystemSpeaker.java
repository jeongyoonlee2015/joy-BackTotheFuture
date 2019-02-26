public class SystemSpeaker {
    static private SystemSpeaker instance; //static for only one.  
    private int volume; //Don't want external calling

    public SystemSpeaker(){
        volume = 5;
    }
    public static SystemSpeaker getInstance(){ //static
        if(instance == null){// Check null
            //System Speaker
            instance = new SystemSpeaker();
            System.out.println("새로 생성");
        }else{
            System.out.println("이미 생성");
        }
        return instance;
    }
    public int getVolume{
        return volume;
    }
    public void setVolume(int volume){
        this.volume = volume; 
    }
}