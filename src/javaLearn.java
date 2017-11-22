import java.lang.reflect.Field;
import java.util.*;

//请完成上传一份Java的代码，
// 代码包括
// Java Random，Math，String类相关成员函数的使用，
// ArrayList，Set，HashMap等各种容器类的使用。
class  A{
    protected  int i;

    A(int i){
        this.i=i;

    }
}
public class javaLearn {
    public static void print(int i,Object object){
        System.out.println(String.format("{%d}, %s",i,object));
    }
    public static void randomLearn(){
        Random random=new Random();
        random.setSeed(1);
        print(1,random.nextInt(10));
        print(2,random.doubles());

    }
    public static  void mathLearn(){
         print(1,Math.sqrt(4));
         print(2,Math.pow(4,2));
         print(3,Math.round(-4.5));
         print(4,Math.floor(4.5));
    }
    public static void stringLearn(){
        String str="bbc";
        String str1=new String("abc");
        String str2="abc";
        print(1,str.equals(str1));
        print(2,str.compareTo("bce"));
        print(3,str.concat("def"));
        print(4,str==str2);
        print(5,str.contains("a"));
        print(6,str.codePointAt(1));
        print(7,str.codePointBefore(1));
        print(8,str.getBytes());
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(1);
        stringBuilder.append("22");
        stringBuilder.append(true);
        print(9,stringBuilder);
        StringBuffer stringBuffer=new StringBuffer();//线程安全

    }
    public static void queueLearn(){
        Queue<Integer> queue=new LinkedList<Integer>();

        for(int i=11;i>0;i--)
        {
            queue.add(i);
        }
        print(10,queue.element());
        print(11,queue.remove());
        print(12,queue.element());
    }
    public static  void listLearn(){
        List<Integer> list=new LinkedList<Integer>();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(3);
        for(int i=0;i<4;i++) {
            print(1, list.get(i));
        }

//        for(int i=0;i<10;i++){
//            list.add(i);
//        }
        Iterator iterator=list.iterator();
        int i=0;
        while ((iterator.hasNext())){
            print(i,iterator.next());
            i++;
        }
//        while(i<20){
//            print(i,list.toArray()[i-10]);
//            i++;
//        }
//        int b=10;
//        while ((iterator.hasNext())){
//            print(b,iterator.next());
//            b++;
//        }

    }
    public static void mapLearn(){
        Map<String,String> map=new HashMap<String,String>();
        for(int i=0;i<10;i++){
            map.put(String.valueOf(i),String.valueOf(i*i));

        }
        print(1,map.get("1"));
        int i=0;
        for(Map.Entry entry:map.entrySet()){
            print(i,entry.getKey()+"|"+entry.getValue());
            i++;
        }

    }
    public static int _add(int i,int j){
        return  i+j;
    }
    public static void listIteratorLearn(){
        List<String> list=new LinkedList<>();
        list.add("amy");
        list.add("jack");
        list.add("wo");
        list.add("ai");
        int i=0;
        for(String s:list){
            print(i,s);
            i++;
        }
        ListIterator listIterator=list.listIterator();


    while(listIterator.hasNext()){
        print(1,listIterator.next());
//        print(2,listIterator.previous());
    }

    }
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//
//       A a =new A(15);
//       A b=new A(16);
//        System.out.println(a+" "+a.i);
//        System.out.println(b+" "+b.i);
//
//        swap(a,b);
//        System.out.println(a+" "+a.i);
//        System.out.println(b+" "+b.i);
//        对包装类装箱拆箱的理解 不可删
        Integer A=1;
        Integer B=2;
        Field field=Integer.class.getDeclaredField("value");
        field.setAccessible(true);
        field.set(A,B);
        Integer C=1;
        System.out.println(C.intValue());





    }
    public  static void swap(A numA,A numB){
//        System.out.println(numA);
//        System.out.println(numB);
        A temp=numA;
        numA=numB;
        numB=temp;
       System.out.println(numA);
       System.out.println(numB);

    }
    public  static void swap(int numA,int numB){
//        System.out.println(numA);
//        System.out.println(numB);
        int temp=numA;
        numA=numB;
        numB=temp;
//        System.out.println(numA);
//        System.out.println(numB);

    }

}
