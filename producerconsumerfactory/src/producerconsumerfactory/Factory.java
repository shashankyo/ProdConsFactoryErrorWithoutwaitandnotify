package producerconsumerfactory;

public class Factory {
int x;
void setValue(int j)
{
	x=j;
	System.out.println("I have value" + x + "from x");
}

void getValue()
{
	System.out.println("I have the value" + x + "from x");
}
}
