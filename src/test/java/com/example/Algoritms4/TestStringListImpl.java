package com.example.Algoritms4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestStringListImpl {


    private List list1;

    private List list2;

    private List list3;

    private List list4;


    private List list5;

    private Integer[] numbers1 = new Integer[] {1,2,3,4};

    private Integer[] numbers2 = new Integer[] {1,4,3,2};


    private StringListImpl stringListImpl = new StringListImpl();



    @BeforeEach

    public void setUp() {

        list1 = new ArrayList<>(Collections.singleton("one"));

        list2 = new ArrayList(Collections.singleton("two"));

        list3 = new ArrayList<>(Collections.singleton("three"));

        list4 = new ArrayList(Collections.singleton("four"));

        list5 = new ArrayList(Collections.singleton("one"));


    }



    @Test

    public void containsTest4() {

        ArrayList List = new ArrayList();

        ArrayList list2 = new ArrayList<>();


        list2.add("two");

        Boolean expected = list1.contains("one");

        Boolean actual = true;




        Boolean expected2 = list2.contains("two");

        Boolean actual2 = true;



        Boolean expected3 = list3.contains("three");

        Boolean actual3 = true;


        Boolean expected4 = list4.contains("four");

        Boolean actual4 = true;



        assertEquals(expected, actual);



        assertEquals(expected2, actual2);


        assertEquals(expected3, actual3);



        assertEquals(expected4, actual4);




    }


    @Test

    public void iTest4() {



        Integer expected = list1.indexOf("one");

        int actual = 0;


        assertEquals(expected, actual);



        Integer expected2 = list2.indexOf("two");

        int actual2 = 0;


        assertEquals(expected2, actual2);


        Integer expected3 = list3.indexOf("three");

        int actual3 = 0;


        assertEquals(expected3, actual3);


        Integer expected4 = list4.indexOf("four");

        int actual4 = 0;


    }



    @Test

    public void lITest4() {



        Integer expected = list1.lastIndexOf("one");

        int actual = 0;


        assertEquals(expected, actual);


        Integer expected2 = list2.lastIndexOf("two");

        int actual2 = 0;


        assertEquals(expected2, actual2);


        Integer expected3 = list3.lastIndexOf("three");

        int actual3 = 0;


        assertEquals(expected3, actual3);


        Integer expected4 = list4.lastIndexOf("four");

        int actual4 = 0;


    }


    @Test

    public void getTest4() {



        String expected = (String) list1.get(0);

        String actual = "one";


        String expected2 = (String) list2.get(0);

        String actual2 = "two";


        String expected3 = (String) list3.get(0);

        String actual3 = "three";


        assertEquals(expected, actual);

        assertEquals(expected2, actual2);

        assertEquals(expected3, actual3);


    }


    @Test

    public void booleanEqualsTest() {



        Boolean expected = list1.equals(list2);

        boolean actual = false;



        assertEquals(expected, actual);


    }


    @Test

    public void booleanEqualsTest2() {


        ArrayList list = new ArrayList();

        ArrayList list2 = new ArrayList();

        list.add(0, "one");

        list2.add(0, "one");


        Boolean expected = list1.equals(list2);

        boolean actual = true;


        assertEquals(expected, actual);

    }


    @Test

    public void sizeTest2() {



        int expected = list1.size();

        int actual = 1;


        int expected2 = list2.size();

        int actual2 = 1;



        assertEquals(expected, actual);


        assertEquals(expected2, actual2);

    }


    @Test

    public void isEmptyTest2() {



        boolean expected = list1.isEmpty();

        boolean actual = false;


        boolean expected2 = list2.isEmpty();

        boolean actual2 = false;



        assertEquals(expected, actual);


        assertEquals(expected2, actual2);


    }


    @Test

    public void clearTest2() {

        list1.clear();


        list1.size();

    }


    @Test

    public void toArrayTest2() {



        String expected = Arrays.toString(list2.toArray());


        String actual = "[two]";


        assertEquals(expected, actual);
    }


    @Test

    public void shouldInvalidException() {

        assertThrows(IndexValueIsInvalidException.class, () -> stringListImpl.add2 (-1,"one" )
        ) ;
    }




    @Test

    public void shouldInvalidException2() {

        assertThrows(IndexValueIsInvalidException.class, () -> stringListImpl.remove2 (-1 )
        ) ;
    }


    @Test

    public void shouldInvalidException3() {


        assertThrows(IndexValueIsInvalidException.class, () -> stringListImpl.set(-1 , "two")
        ) ;
    }

    @Test

    public void ItemNotFoundException() {

        assertThrows(ItemNotFoundException.class, () -> stringListImpl.remove1("-1" )
        ) ;
    }


    @Test

    public void addTest () {



        ArrayList List = new ArrayList();

        ArrayList list2 = new ArrayList<>();

        list1.add("two");

        list2.add("two");

        list1.get(0);

        list2.get(0);
    }


    @Test

    public void setTest () {



        ArrayList List = new ArrayList();

        ArrayList list2 = new ArrayList<>();

        list1.add("two");

        list2.add("two");




        String expected= (String) list1.set(0, "one");

        String actual = new String("one");




        assertEquals(expected, actual);



        list1.get(0);

        list2.get(0);


        list1.size();

        System.out.println(list1.size());

        System.out.println( list1.get(0));

        System.out.println( list1.get(1));

        list1.remove(0);

        System.out.println(list1.size());

        System.out.println( list1.get(0));

        list1.remove(0);

        System.out.println(list1.size());



    }

    @Test

    public void removeTest () {



        ArrayList List = new ArrayList();

        ArrayList list2 = new ArrayList<>();

        list1.add("one");

        list1.add("two");

        list1.add("three");




        String expected= (String) list1.remove(0);

        String actual = new String("one");



        assertEquals(expected, actual);



        list1.get(0);

        list1.get(0);


        list1.size();

        System.out.println(list1.size());

        System.out.println( list1.get(0));

        System.out.println( list1.get(1));

        list1.remove(0);

        System.out.println(list1.size());

        System.out.println( list1.get(0));

        list1.remove(0);

        System.out.println(list1.size());


    }

}
