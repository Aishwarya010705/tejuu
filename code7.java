public class code7{
    public static void main(String[] args) {
        int a,b,res;
        a=10;
        b=10;
        if(a > b)
            System.out.println("a is greater than b");
        else if(a==b)
            System.out.println("a is equal to b");
        else
            System.out.println("a is less than b");
        res=(a<b)? 1:0;
        System.out.println("res="+res);
    }
}