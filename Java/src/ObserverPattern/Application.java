package observer;
import observer.Button.onClickListener;

public class Application{
    public static void main(String[] args){
        Button button =  new Button();

        button.setOnClickListener(new onClickListener(){
            @Override
            public void onClick(Button button){
                System.out.println(button+" is Clicked");
            }
        }
        button.onClick();    
    }

}
