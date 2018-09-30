import java.util.ArrayList;

public class Temp {

    class Inner {
        @Override
        public String toString() {
            return super.toString();
        }
    }

    public static void main(String[] args) {

        ArrayList<Object> arraylist = new ArrayList<>();
        arraylist.add("Hello");

        System.out.println(Temp.Inner.class);
        int i = 0;
        Temp temp = new Temp();
        System.out.println(Temp.class);


        String s = "test";
        String s1 = new String("test") ;
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

        StringBuilder stringBuilder = new StringBuilder("abc") ;
        StringBuilder sb = stringBuilder.append("def");
        stringBuilder.append("ghi");
        System.out.println(stringBuilder);
        System.out.println(sb);

    }

}
