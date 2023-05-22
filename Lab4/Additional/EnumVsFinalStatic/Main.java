package Additional.EnumVsFinalStatic;

public class Main {
    public enum Size {
        Small, Medium, Big
    }
    public final class Size1 {
        public final static byte Small = 0;
        public final static byte Medium = 1;
        public final static byte Big = 2;
        public final static byte ExtraBig = 2;//!!!!!
    }
    static void doSmthWithColor(Size size){
        System.out.println(size);
    }
    static void doAnotherWithColor(int weightOfSize){
        System.out.println(weightOfSize);
    }
    public static void main(String[] Args){
        doSmthWithColor(Size.Small);
        doAnotherWithColor(Size1.Big);
        doAnotherWithColor(3);
        Size[] sizes = Size.values();
        for(Size size: sizes){
            System.out.println(size.name());
        }
        Size size = Size.Small;
        //size = 6; is illigal
        byte size1 = Size1.Small;// "Size1 size1 = Size1.Small" is illegal
        size1 = 6;

    }

}
