package concrete;
public class Main{
    public static void main(String[] args){
        ItemCreator creator;
        Item item;

        creator = new HpCreator();
        item = creator.create();
        
        item.use();

        creatror = new MpCreator();
        creator.create();
        
        item.use();
    }
}
