/*
21

x x+1
x+x+1 = 21
2x+1= 21
2x = 20
x = 20/2
x = 10

306
x x+1 x+ 2;
x+x+1+x+2
3x + 3 = 306
3x = 306 - 3
3x = 303
x = 303/3
  = 101




 128 64 32 16 8 4 2 1
   0  1  0  0 0 0 0 1
   1  1  1  1 0 1 0 0
   0  0  0  0 0 0 1 1
   0  0  0  0 0 0 0 0












*/








import java.util.Scanner;
// 11:50
// char * name = "Bala";
// ptr_func = printf;


class PolyDivisible
{
    public static void polyDivisible ( int base )
    {
        // arms length - validation , trivia, edge cases
        if ( ( base & 1 ) == 1 )
            return ;
        // set an environment
        boolean [] used = new boolean [ base ];
        // call helper - recursive, pass the environment, initiate
        pd_helper ( used, base , 0, 1);

    }
    private static int anyBase_2_10 ( int valOtherBase, int whichBase )
    {
        // 325 ,8
        // 5*8^0 + 2* 8^1 + 3 * 8^2
        int otherBasePower;
        int copy_valOtherBase;
        int digit;
        int decValue;
        decValue = 0;
        otherBasePower = 1;
        copy_valOtherBase = valOtherBase;
        while ( copy_valOtherBase != 0 )
        {
            digit = copy_valOtherBase % 10;
            decValue += ( digit * otherBasePower );
            otherBasePower *= whichBase;
            copy_valOtherBase/=10;
        }
        return decValue;










    }
    private static void pd_helper ( boolean [] used, int base, int currValue,int pos)
    {
        // check if solved
        if ( pos == base )
        {
            System.out.println( currValue );
            return;
        }


        // enumerate all the choices
        // 1,2,3,4,5,.....base - 1
        int myTestValue;
        int checkInBase10=0;
        for( int digit = 1; digit < base; digit++)
        {
            if ( used [ digit ] == false )
            {
                myTestValue = currValue * 10 + digit;
                if ( base != 10 )
                {
                    checkInBase10 = anyBase_2_10( myTestValue, base );
                }
                else checkInBase10 = myTestValue;
                if ( checkInBase10 % pos == 0 )
                {
                    used [ digit ] = true;
                    pd_helper ( used, base, myTestValue, pos+1);
                    used [ digit ] = false;
                }
            }
        }

    }
    public static void main( String [] parameters )
    {
        Scanner kbrd = new Scanner ( System.in );
        int base;
        base = kbrd.nextInt();
        polyDivisible( base );
    }
}
