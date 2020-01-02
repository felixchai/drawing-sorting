
package drawingsorting;
import java.util.Scanner;
public class DrawingSorting 
{

    public static void main(String[] args) 
    {
    Scanner input = new Scanner(System.in);
    int menu,x,j,k,i,z,p,first;
    System.out.println("Welcome to Drawing and Sorting Application!");
    System.out.println("1. Drawing");
    System.out.println("2. Sorting");
    System.out.println("3. Exit");
    menu = 1;
    
        switch(menu)
        {
            case 1 :
                System.out.println("Choose which Shape you want to draw!");
                System.out.println("1. Pyramid");
                System.out.println("2. Diamond");
                menu = 1;
                
                    switch(menu)
                    {
                        case 1 :
                            System.out.println("Input How many Pyramid you want to make!");
                            x = 3;
                            for( z = x*2 ; x < z ; x++)
                            {
                                for(i=1;i<=5;i++)
                                {
                                    for(j=10;j>i;j--)
                                    {
                                       System.out.print(" ");
                                    }
                                for(k=1; k<(2*i);k++)
                                    { 
                                       System.out.print("*");
                                    }   
                                System.out.println();
                                }
                            }
                        break;
                        
                        case 2 :
                            System.out.println("Input size of the diamond!");
                            x = input.nextInt();
                            for(i=0;i<x;i++)
                            {
                                for(j=30;j>i;j--)
                                {
                                    System.out.print(" ");
                                }
                            for(k=1; k<(2*i);k++)
                            {
                                System.out.print("*");
                            }
                            System.out.println();
                            }

                            for(i=x;i>0;i--)
                            {
                               for(j=30;j>i;j--)
                                {
                                    System.out.print(" ");
                                }
                            for(k=1; k<(2*i);k++)
                            {
                                System.out.print("*");
                            }
                            System.out.println();
                            }
                        break;

                    }
            break;
            
            case 2 :
                System.out.println("Welcome to the Sorting Menu");
                System.out.print("Input The Size of the Value: ");
                p = input.nextInt();
                int array [] = new int [p];
    
                System.out.println("Input the Value of it");
                i = 0;
                while (i<p)
                {
                 array[i] = input.nextInt();
                 i++;
                }
                System.out.println("Choose the type of sorting!");
                System.out.println("1. Ascending");
                System.out.println("2. Descending");
                System.out.print("Your Choice: ");
                menu = input.nextInt();
                switch(menu)
                {
                    case 1 :
                        boolean fixed= false;
                        while(fixed==false)
                        {
                        fixed = true;
                        for(i=0; i< array.length - 1 ; i++)
                        {
                            if(array[i] > array[i+1])
                            {
                                first = array[i];
                                array[i] = array[i+1];
                                array[i+1] = first;
                                fixed = false;
                            }
                        }
                        }
                        for(i=0 ; i< array.length; i++)
                        {
                            System.out.println(array[i]);
                        }
                    break;
                    
                    case 2 :
                        boolean fix = false;
                        while(fix == false)
                        {
                        fix = true;
                        for(i=0; i< array.length - 1 ; i++)
                        {
                            if(array[i] < array[i+1])
                            {
                                first = array[i];
                                array[i] = array[i+1];
                                array[i+1] = first;
                                fix = false;
                            }
                        }
                        }
                        for(i=0 ; i < array.length; i++)
                        {
                            System.out.println(array[i]);
                        }
                    break;
                }
            break;
            
            case 3 :
                System.out.println("Exit Application!");
                System.exit(0);
            break;
        }
    
    }
    
}
