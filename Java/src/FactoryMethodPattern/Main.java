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

크리에이터의 크리에이트에서 다양한 단계로 나눠주고 차례대로 호출하는 방식: 팩토리메소드,
이 방식은 템플릿 메소드.

크리에이터와 아이템의 구조들... 그렇게 나눠서 구현한 것
장점: 아이템을 생성할 때 메인 클래스를 수정할 필요가 없다.

-> 유연성이 증가한다.(다른 많은 패턴들과 공통적인 이점)