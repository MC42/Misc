public class Holidays {
public static void main(String[] args) {
	printTree();

	System.out.println(" H A P P Y   H O L I D A Y S");
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
