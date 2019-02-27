public class Shape implements Cloneable{
    
    private String id;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    
}   
/**
 * @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
 */