package observer;
public class Application{

    public static void main(String[]args){
    
        Button button = new Button();

        butoon.addObserver(new Observer(){

            @Override
            public void update(Observable o, object arg){
                System.out.println(o+" is Clicked");
            }
        });
        button.onClick();
        button.onClick();
        button.onClick();

    }
}