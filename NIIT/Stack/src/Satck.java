
class Sta {
    int stck[]=new int [10];
    int temp;
    Sta()
    {
        temp--;
    }
    void push(int item)
    {
        if (temp==9)
        {
            System.out.println("Stack is full");
        }
        else
            stck[++temp]=item;
    }
    int pop()
    {
        if (temp<0)
        {
            System.out.println("Stack out of flow");
            return 0;
        }
        else
            return stck[temp--];
    }
    public class Satck {
        public static void main(String args[]) {
            Sta st = new Sta();

            for (int i = 0; i <= 10; i++) st.push(i);
            {
                System.out.println("st");
            }
            int j = 0;
            for (j = 0, j < 10, j++)
            {
                System.out.println(st.pop());
            }


        }
    }
}
