package FirstPart;

public class FirstProgram {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int n=11;
        //i
        for(int i=0;i<n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 && i >= 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }

            }
            //n
            for (int j = 0; j < n; j++) {
                if (j == 0 && i >= 0 || i == j || j == n - 1 && i >= 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }

            }
            System.out.print("\t ");

            //e
            for (int j = 0; j < n; j++) {
                if (j == 0 && i >= 0 || i == 0 && j >= 0 || i == n - 1 && j >= 0 || i == (n - 1) / 2 && j >= 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }


            }
            System.out.print("\t ");
            //u
            for(int j=0 ; j<n; j++)
            {
                if(j==0 && i>=0 && i<n-1 || i==n-1 && j>0 && j<n-1 || j==n-1 && i<n-1  )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");

                }

            }
            System.out.print("\t ");

            //R
            for(int j=0 ; j<n; j++)
            {
                if(j==0 && i>0 && i<=n-1 ||  i==(n-1)/2 && j>0 && j<(n-1)/2 || j==(n-1)/2  && i>0 && i<(n-1)/2 || i==0 && j>0 && j<(n-1)/2 || i-j==(n-1)/2 )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");

                }

            }
            System.out.print("\t ");
            //o
            for(int j=0 ; j<n; j++)
            {
                if(j==0 && i>0 && i<n-1 || i==n-1 && j>0 && j<n-1 || j==n-1 && i<n-1 && i>0 || i==0 && j>0 && j<n-1 )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");

                }

            }
            System.out.print("\t ");
            //n
            for (int j = 0; j < n; j++) {
                if (j == 0 && i >= 0 || i == j || j == n - 1 && i >= 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }

            }
            System.out.println();
        }




    }

}



