package arraylist;

class arraylist{
    private Object []a = new Object[5];
    private int count = 0;

    public void increasearraysize(){
        Object [] temp = new Object[a.length + 3];
        System.arraycopy(a,0,temp,0,a.length);
        a = temp;
    }
    public int size(){
        return count;
    }
    public void add(Object e){
        if (count >= a.length){
            increasearraysize();
        }
        a[count++] = e;
    }
    public void add(Object e , int index){
        if (index <= -1 || index >= size())
            throw new IndexOutOfBoundsException();
        count++;
        if (count >= a.length)
            increasearraysize();
        for (int i = size() - 1 ; i >= index; i--){
            a[i + 1] = a[i];
        }
        a[index] = e;
    }
    public Object get(int index){
        if (index <= -1 || index >= size())
            throw new IndexOutOfBoundsException();
        return a[index];
    }
    public void remove(int index){
        if (index <= -1 || index >= size())
            throw new IndexOutOfBoundsException();
        for (int i = index + 1; i < size(); i++){
            a[i - 1] = a[i];
        }
        count--;
    }
}
public class Implementation {
    public static void main(String[] args) {
        arraylist a = new arraylist();
        a.add(10);
        a.add(20);
        //a.remove(0);
        a.add(30,1);
        a.add(40);
        a.remove(0);
      //  a.add(50);
        System.out.println(a.size());
        for (int i = 0; i < a.size(); i++){
            System.out.println(a.get(i));
        }
        System.out.println("_____________________");
       // a.remove(4);
        for (int i = 0; i < a.size(); i++){
            System.out.println(a.get(i));
        }
    }
}
