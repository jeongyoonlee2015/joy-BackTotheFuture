package observer;
public class Button{
    public void onClick(){
        //Event Handling
        if(onClickListener != null)
        onClickListener.onClick();
    
    } 

    public interface OnClickListener{
        public void onClick(Button button); //Point: Who is Called

    }
    private OnClickListener onClickListener;

    public void setOnClickListener(OnClickListener onClickListener){
        this.onClickListener = onClickListener;
    }
}