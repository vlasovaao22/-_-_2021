import java.util.Scanner;
class MyStack {
    private int a[];//хранение элементов
    private int cnt = 0;//сколько элементов
    public void push(int i) {
        a = new int[n];
        if (a[cnt] == null){
            a[cnt] = i;
        }
        else {
            a = new int[n*2];
        }
        cnt = cnt + 1;
    }
    public void pор() {
       a[cnt] = null;
       cnt = cnt - 1;
    }
    public boolean empty() {
        boolean b = false;
        if (cnt == 0){
            b = true;
        }
        return b;
    }
    public int size() {
       return cnt;
    }
}
