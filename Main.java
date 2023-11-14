import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int marks[] = new int[10];
    int i;
    int b = 999;
    boolean exited = false;
    float total=0,avg;
    Scanner scanner = new Scanner(System.in);
    for(i=0; i<10; i++) {
        System.out.print("Enter Marks of Subject"+(i+1)+":");
        marks[i] = scanner.nextInt();
        total = total + marks[i];
        if(marks[i]==b)
        {
          exited = true;
        }

        if (exited) {
          System.out.print("Program quit\n");
          break;
        }
    }
    scanner.close();

    int sum = 0;
    float average = 0.0f;

    // Calculating the average in for loop
    for (i=0; i<marks.length;i++) {
        sum += marks[i];
    }
    average = (float) sum / marks.length;

    // Printing the calculating averated value
    System.out.print("The average of he given array: " + average);
    //Calculating the average
    avg = total/10;
    System.out.printf("%n");
    System.out.print("Average student grade out of the scores is: ");

    // Define variables for for loop

    if(avg>=90)
    {
        System.out.print("A");
    }
    else if(avg >= 80)
    {
        System.out.print("B");
    }
    else if(avg>=70)
    {
        System.out.print("C");
    }

    else if(avg>=60)
    {
        System.out.print("D");
    }
    else
    {
        System.out.print("F");
    }
  }
}