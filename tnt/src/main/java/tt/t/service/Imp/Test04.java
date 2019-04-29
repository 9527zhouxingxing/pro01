package tt.t.service.Imp;

import java.lang.reflect.Array;
import java.util.*;

public class Test04 {
    private String[] myArr;
    private List<String> myList;
    private Set<String> mySet;
    private Map<String,String> myMap;
    private Properties myPro;

    public void setMyArr(String[] myArr) {
        this.myArr = myArr;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyPro(Properties myPro) {
        this.myPro = myPro;
    }

    public void listAll(){
        System.out.println(Arrays.toString(myArr));
        System.out.println(myList);
        System.out.println(myMap);
        System.out.println(mySet);
        System.out.println(myPro);
    }
}
