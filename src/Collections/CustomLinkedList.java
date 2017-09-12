package Collections;

/**
 * Created by ankur on 24/7/17.
 */
public class CustomLinkedList {
    int data;
    CustomLinkedList next;

    CustomLinkedList(int data, CustomLinkedList next) {
        this.data = data;
        this.next = next;

    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}
