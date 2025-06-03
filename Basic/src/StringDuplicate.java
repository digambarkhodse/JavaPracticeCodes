import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class StringDuplicate {
    public static void main(String[] args){
        String[] strArray={"abc", "def", "fdg", "abc", "ngd", "dfe","jgj"};

        HashSet<String>hs=new HashSet<String>();
        for(String str:strArray){
            hs.add(str);
        }
        System.out.println(hs);
        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(1,"Null");
        hm.put(2,"hhjdf");
        hm.put(3,"hgdsjg");

        ArrayList<Integer>al=new ArrayList<>();
        al.add(1);
        al.add(4);
        al.add(8);
        al.add(3);
        al.add(3);
        Iterator itr= al.iterator();
        while (itr.hasNext()){
            int data = (Integer)itr.next();
            if(data==3){
                itr.remove();
            }


        }
        System.out.println(al);
    }
}
