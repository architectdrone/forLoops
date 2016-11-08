import java.util.Scanner;
public class oyeah

{
    
    public static void program1()
    {
        for ( int i = 1; i <= 10; i++ )
        {
            System.out.print( i + "\t" );
        }
        System.out.print( "\n" );
    }
    public static void program2()
    {
        for ( int i = 2; i <= 20; i=i+2 )
        {
            System.out.print( i + "\t" );
        }
        System.out.print( "\n" );
    }
    public static void program3()
    {
        for ( int i = 10; i >= 0; i-- )
        {
            System.out.print( i + "\t" );
        }
        System.out.print( "\n" );
    }
    public static void program4()
    {
        for ( int i = 1; i <= 10; i++ )
        {
            
            System.out.print( "\n" );
            for (int x = 1; x <=10; x++)
            {
                int answer = i*x;
                System.out.print( i +"*"+x+"="+answer+ "\t" );
            }
            
        }
        
        
    }
    public static void program5()
    {
        Scanner scanner = new Scanner( System.in );
        int l = scanner.nextInt();
        scanner.close();
        for ( int i = 1; i <= l; i++ )
        {
            System.out.print( "-");
        }
        System.out.print( "\n" );
    }

    public static void program7()
    {
        Scanner scanner = new Scanner( System.in );

        int numberCount;
        double sum = 0;
        
        System.out.println( "Give me the number of numbers");
        numberCount = scanner.nextInt();
        for (int i = numberCount; i > 0; i--)
        {
            System.out.println( "Number "+i);
            sum = sum+scanner.nextInt();
        }
        double result = sum / numberCount;
        System.out.println( "Result "+result);
        scanner.close();
    }
    
    
    

}
