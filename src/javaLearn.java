import java.util.*;

//请完成上传一份Java的代码，
// 代码包括
// Java Random，Math，String类相关成员函数的使用，
// ArrayList，Set，HashMap等各种容器类的使用。
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
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        Iterator iterator=list.iterator();
        int i=0;
        while ((iterator.hasNext())){
            print(i,iterator.next());
            i++;
        }
        while(i<20){
            print(i,list.toArray()[i-10]);
            i++;
        }
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
    public static void main(String[] args) {

//        print(1,"woaini");
//        randomLearn();
//       mathLearn();
//         stringLearn();
//
//     queueLearn();
//        listLearn();
        mapLearn();
    }
}
