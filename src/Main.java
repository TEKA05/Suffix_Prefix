public class Main {
    private static final int LIMIT = 13;

    public static void main(String[] args)
    {
        int sayi1 = 0;
        int sayi2 = 0;
        int num1 = 0;
        int num2 = 0;

        for (int i = 0 ; i < LIMIT; i++)
        {
            sayi1 = num1++; // suffix
            sayi2 = ++num2  ; //prefix


            /*
            * çıktı örneği şu şekildedir
            * i = 0 için
            * sayi1=0 num1 =1  // suffix
            * sayi2 = 1 num2 =1 //prefix
            *
            * i=1 için
            * sayi1 =1 num1=2 // suffix
            * sayi2 =2 num2=2 //prefix
                  ... şeklinde limit max değerine kadar devam eder.  */

        }
        System.out.println( " sayi1 : " + sayi1 + " ve sayi2 : "+ sayi2);
        System.out.println(" num1 : "+ num1 + " ve num2 "+ num2);

    }
}