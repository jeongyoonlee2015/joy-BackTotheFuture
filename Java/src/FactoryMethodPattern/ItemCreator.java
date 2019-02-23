package framework;
public abstract class ItemCreator{

    public Item create(){
        Item item;

        //step1
        requestItemsInfo();
        //step2
        item = createItem();
        //step3
        createItemLog();

        return item;
    }
    //Request item information from the database before creating the item.
    abstract protected void requestItemsInfo();
    //After the item is created, it is recorded in the database to prevent illegal copying of the item.
    abstract protected void createItemLog();
    //It is an algorithm to generate an item.
    abstract protected void createItem();

}

