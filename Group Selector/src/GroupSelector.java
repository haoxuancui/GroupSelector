import java.util.*;
import java.io.*;
public class GroupSelector
	{

	public static void main(String[] args)
		{
		makeRoster();
		makeGroups();
		sortGroupsAlphabetically();
		printGroups();
		}

	private static void makeRoster()
		{
		
		}

	private static void makeGroups()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Hello how many groups would you like?");
		int name = userInput.nextInt();
		for(int i = 1; i <= name; i++)
			{
				System.out.println(i);
			}
		}

	private static void sortGroupsAlphabetically()
		{
		//dimitris sort out names by last name in alphabetical order 
		}

	private static void printGroups()
		{
		// TODO Auto-generated method stub
		
		}

	}
