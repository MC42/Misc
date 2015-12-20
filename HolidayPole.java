public class HolidayPole {
public static void main(String[] args) {
	printPole();

	System.out.println(" H A P P Y   F E S T I V U S");
	}
	
	public static void printPole()
	{
for (int i = 0; i < 25; i++)
{System.out.println(finishLayer(13) + "||" + finishLayer(12));
}
}

public static void printTree()
	{
	
	for (int i = 25; i > 0; i--)
	{
		if ( i == 25)
		{
			System.out.println(finishLayer((i)/ 2) + "*" + finishLayer((i)/ 2));
		}
	else printTreeLayer(25 - i);
	}
	
}
public static void printTreeLayer(int layer) {
	String fullLayer =">>o>>>*>>>>o>>>*<<o>>*<<.";
	
	if (layer % 2 == 1)
	{
		fullLayer = new StringBuffer(fullLayer).reverse().toString();
		fullLayer = fullLayer.replace(">","G");
		fullLayer = fullLayer.replace("<",">");
		fullLayer = fullLayer.replace("G", "<");
		fullLayer = fullLayer.replace("*","o");
	}
	String currentlayer = finishLayer((25 - layer)/ 2) + fullLayer.substring(25 - layer) + finishLayer((25 - layer/ 2));
	System.out.println(currentlayer);
	
}


public static String finishLayer(int i)
{
	String output = "";
	for (int g = 0; g < i; g++)
		{
		output = (output + " ");
		}
	return output;
	}
}
