package review;  

public class Sequence {
    private Object[] objects;
    private int next = 0;

    public Sequence(int size) {
        objects = new Object[size];
    }

    public void add(Object x) {
        if (next < objects.length) {
            objects[next] = x;
            next++;  // nhớ dấu chấm phẩy
        }
    }

    // inner class SSelector implements Selector interface
    private class SSelector implements Selector {
        int i = 0;

        public boolean end() {
            return i == next;  // so sánh với next (số phần tử đã thêm)
        }

        public Object current() {
            return objects[i];
        }

        public void next() {
            if (i < next) i++;
        }
    }

    public Selector getSelector() {
        return new SSelector();
    }
}
