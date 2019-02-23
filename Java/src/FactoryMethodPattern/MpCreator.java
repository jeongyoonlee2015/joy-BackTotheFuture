package concrete;

import framework.ItemCreator;
public class MpCreator extends ItemCreator{
    @Override
    protected void requrestItemsInfo(){
        System.out.println("Retrieve information from the database of magic recovery potions.");   
    }
    @Override
    protected void createItemsInfo(){
        System.out.println("Created a new magic potion." + new Date());        
    }
    @Override
    protected void createItem(){ //Parameter required.
        //Work
        return new MpPotion();
    }
}
