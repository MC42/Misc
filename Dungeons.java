public class Dungeons {
	public static void main(String[] args) {
		for (int i=0;i < args.length;i++)
		{
			String temp = args[i].substring(1);
			System.out.println("Die : " + args[i]);

			System.out.println(rollDie(Integer.parseInt(temp)));
		}

	}
	public static int rollDie(int dieType)
	{
	int ret = (int)(Math.random()*dieType) + 1;
	return ret;
	}
}