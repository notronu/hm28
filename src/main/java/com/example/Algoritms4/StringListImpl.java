package com.example.Algoritms4;

import java.util.Arrays;

public class StringListImpl implements StringList {


    private final String[] storage;

    private int size;

    public StringListImpl() {

        storage = new String[10];

    }

    public StringListImpl(int initSize) {

        storage = new String[initSize];

    }


    @Override

    public String add1(String item) {

        validateSize();

        validateItem(item);

        storage[size++] = item;

        return item;


    }


    @Override

    public String add2(int index, String item) {

        validateSize();

        validateItem(item);


        validateIndex(index);

        if (index == size) {

            storage[size++] = item;


            return item;
        }



        System.arraycopy(storage, index, storage, index + 1, size - index);

        storage[index] = item;

        size++;

        return item;


    }





    @Override

    public String set(int index, String item) {


        validateIndex(index);

        validateItem(item);


        return item;

    }


    @Override

    public String remove1(String item) {

        validateItem(item);


        int index = indexOf(item);

        if (index == -1) {

            throw new ItemNotFoundException();


        }

        if (index != size) {


            System.arraycopy(storage, index + 1, storage, index, size - index);




        }

        size--;

        return item;
    }

    @Override

    public String remove2(int index) {

        validateIndex(index);


        if (index == -1) {

            throw new ItemNotFoundException();


        }

        String item = storage[index];

        if (index != size) {


            System.arraycopy(storage,index+1,storage,index,size-index);


        }

        size--;
        return item;
    }




    @Override


    public boolean contains(String item) {
        return indexOf(item)!=-1;
    }

    @Override

    public int indexOf(String item) {

        for (int i = 0; i < size; i++) {

            if(storage[i].equals(item)){ /*  если найден элемент*/

                return i; /*   возвратим его индекс*/

            }


        }


        return -1;

    }


    @Override

    public int lastIndexOf(String item) {

        for (int i = size-1 ; i >=0 ; i--) {

            if(storage[i].equals(item)){ /*  если найден элемент*/

                return i; /*   возвратим его индекс*/

            }


        }

        return -1;

    }


    @Override

    public String get(int index) {

        validateIndex(index);



        return storage[index];
    }


    @Override

    public boolean equals(StringList otherList) {


        return Arrays.equals(this.toArray(),  otherList.toArray() ) ;


    }


    @Override

    public int size() {
        return 0;
    }


    @Override

    public boolean isEmpty() {


        return size == 0;

    }


    @Override

    public void clear() {


        size = 0;


    }


    @Override

    public  String[] toArray() {


        return Arrays.copyOf(storage,size); /* воэвращаем копию нашего массива по размеру сайз без пустых ячеек*/

    }




    private   void validateItem(String item){

        if(item==null){

            throw new NullItemException();

        }

    }


    private void validateSize(){

        if(size==storage.length){

            throw new  NoFreeCellsArrayIsFullException();

        }

    }


    private void validateIndex(int index){

        if(index<0|| index> size){

            throw new IndexValueIsInvalidException();

        }
    }



}
