
public class Uebung2_0212 {

private char[] internalArray; 
public int countObjects; 

public void CharArray(char[] param)
{internalArray =param; 

}

public void pring()
{
	for (int i =0; 1 < internalArray.length; i++)
			System.out.print( internalArray[i]);
			System.out.print("");
}
	public void print (int start, int end)
	{
		
		if (start >= 0 
				&& end >= start
				&& end <= internalArray.length) {
		for (int i = start; 1< end; i++) {
			System.out.print(internalArray[i]);
			System.out.println();
		}
		}
	}

	
}
