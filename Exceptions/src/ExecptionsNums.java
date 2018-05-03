import java.util.InputMismatchException;

public class ExecptionsNums {

	public static void main(String[] args) {
		
		int a= 10;
		int b =10;
		
		try {
			
			if (a == b) {
				System.out.println(0);
			}
			else {
				throw new InputMismatchException();
				}
			
			
		} catch (InputMismatchException  ea) {
			
			/* Will only execute if exception above 
	          * occurs in try block
	          */
		
			System.out.println("Number 'A' should be equal to number 'B' "); 
			System.out.println(ea.toString()); 
			
		}
		finally {
			/* This block will always execute regardless whether exception was thrown or not*/
			System.out.println("Numbers should always be equal");
		}
		

	}

}



/*
 * Arithmetic Exception
 It is thrown when an exceptional condition has occurred in an arithmetic operation.
 
ArrayIndexOutOfBoundException
It is thrown to indicate that an array has been accessed with an illegal index. The index is either negative or greater than or equal to the size of the array.

ClassNotFoundException
This Exception is raised when we try to access a class whose definition is not found

FileNotFoundException
This Exception is raised when a file is not accessible or does not open.

IOException
It is thrown when an input-output operation failed or interrupted

InterruptedException
It is thrown when a thread is waiting , sleeping , or doing some processing , and it is interrupted.

NoSuchFieldException
It is thrown when a class does not contain the field (or variable) specified

NoSuchMethodException
It is thrown when accessing a method which is not found.

NullPointerException
This exception is raised when referring to the members of a null object. Null represents nothing

NumberFormatException
This exception is raised when a method could not convert a string into a numeric format.

RuntimeException
This represents any exception which occurs during runtime.

StringIndexOutOfBoundsException
It is thrown by String class methods to indicate that an index is either negative than the size of the string*/
