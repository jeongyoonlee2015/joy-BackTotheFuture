package concrete;

import framework.ItemCreator;
public class HpCreator extends ItemCreator{
    @Override
    protected void requrestItemsInfo(){
        System.out.println("Retrieve information from the database of health recovery potions.");   
    }
    @Override
    protected void createItemsInfo(){
        System.out.println("Created a new health recovery potion." + new Date());        
    }
    @Override
    protected void createItem(){ //Parameter필요
        return new HpPotion();
    }
}


