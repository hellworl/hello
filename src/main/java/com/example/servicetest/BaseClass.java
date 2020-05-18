package com.example.servicetest;

import java.io.*;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.Calendar;

public class BaseClass  extends BaseType {


    @Override
    public String string(){

        String  a ="hello";
        a.replace("ll","rr");
        return  "";
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String  a ="hello";
        a.replace("ll","rr");
        System.out.println(a);
        System.out.println(  a.replace("ll","rr"));


        /* stringBuffer */
        StringBuffer  stringBuffer;
        stringBuffer= new StringBuffer();
        stringBuffer.append("hello");
        stringBuffer.append("  world");
        stringBuffer.append(" ");
        stringBuffer.append(" .");

        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuffer);

        String  encode = "世界真好";
        encode = new String(encode.getBytes("UTF-8"),"UTF-8");
        System.out.println(encode);


        String  string  =  "gyhiujokplubinomkl";
        System.out.println(string.substring(2,6));
        System.out.println(string.substring(2));

//        BaseClass.readWords();

        BaseClass.assersion();
    }


    public static void   assersion(){
        boolean is = 1>2;
        assert  is;
        System.out.println("程序异常");
    }
    public static void  readWords(){
         String  hello = "nihaoh中国";
         System.out.println(hello.charAt(6)+0);
        Calendar  time = Calendar.getInstance();
        time.get(Calendar.YEAR);
        System.out.println(time.get(Calendar.MONTH));


        System.out.println(Calendar.getInstance().getTimeInMillis());
        System.out.println(System.currentTimeMillis());

        System.out.println(time.getActualMaximum(Calendar.DATE));
        time.set(Calendar.MONTH,2);
        System.out.println(time.getActualMaximum(Calendar.DATE));
        System.out.println(time.get(Calendar.MONTH));
        System.out.println(time.getMinimum(Calendar.DAY_OF_MONTH));
        System.out.println(time.get(Calendar.YEAR));
        System.out.println(time.getActualMinimum(Calendar.YEAR));


        Calendar  calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE,-1);
        System.out.println(calendar.getTime());
    }

    public static void   assersion(int a){
        boolean is = 1>2;
        assert  is;
        System.out.println("程序异常");
    }
}



class  testSerialiable implements Externalizable {

    /**
     * The object implements the writeExternal method to save its contents
     * by calling the methods of DataOutput for its primitive values or
     * calling the writeObject method of ObjectOutput for objects, strings,
     * and arrays.
     *
     * @param out the stream to write the object to
     * @throws IOException Includes any I/O exceptions that may occur
     * @serialData Overriding methods should use this tag to describe
     * the data layout of this Externalizable object.
     * List the sequence of element types and, if possible,
     * relate the element to a public/protected field and/or
     * method of this Externalizable class.
     */
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    /**
     * The object implements the readExternal method to restore its
     * contents by calling the methods of DataInput for primitive
     * types and readObject for objects, strings and arrays.  The
     * readExternal method must read the values in the same sequence
     * and with the same types as were written by writeExternal.
     *
     * @param in the stream to read data from in order to restore the object
     * @throws IOException            if I/O errors occur
     * @throws ClassNotFoundException If the class for an object being
     *                                restored cannot be found.
     */
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}



class  p implements   Serializable{

}



class  test{
    public static void main(String[] args) {



        CharBuffer  buffer =  CharBuffer.allocate(1024);
//        buffer.put('c');
//        buffer.flip();
//        System.out.println(buffer.position());
//        System.out.println(buffer.get());
//        System.out.println(buffer.position());
//        buffer.rewind();
//        System.out.println(buffer.get());
//        System.out.println(buffer.position());


//        buffer.flip();
        buffer.put("b");
        buffer.put("b");
        buffer.put("b");
        buffer.put("b");
        buffer.mark();
        buffer.put("b");

        buffer.put("b");
        buffer.put("b");
        buffer.reset();



        buffer.flip();
//        buffer.flip();
        System.out.println("position  " + buffer.position());

    }
}