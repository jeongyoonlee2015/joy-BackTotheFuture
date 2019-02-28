public class Main{
    public static void main(String[] args){
     
        Cat navi = new Cat();
        navi.setName("navi");
        navi.setAge(new Age(2012, 3));

        Cat yo = navi.copy();
        yo.setName("yo");
        yo.getAge().setYear(2013);
        yo.getAge().setValue(2);

        System.out.println(navi.getName());
        System.out.println(yo.getName());

        System.out.println(navi.getAge().getYear());
        System.out.println(yo.getAge().getYear()); 

        Sytem.out.println(navi.getAge().getValue());
        System.out.println(getAge().getValue());
    }
}