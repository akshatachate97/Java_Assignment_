   //Write a program in JAVA to input a single digit number and print a rectangular form of 4 columns and 6 rows



class print_rectangle {
	
	static void printRectangle(int h, int w)
	{
		for (int i = 0; i < h; i++)
		{
			System.out.println();
			for (int j = 0; j < w; j++)
			{
                     if (i == 0 || i == h-1 ||j== 0 || j == w-1)
		     System.out.print("5");
		     else
		     System.out.print(" ");
			}
		}
	}
	
	public static void main(String args[])
	{
		int h = 6, w = 4;
		printRectangle(h, w) ;
	}
}

