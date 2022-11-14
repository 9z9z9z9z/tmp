import model.*;
import controller.*;

public class Main
{
    public static void main(String[] args)
    {
        WashingMachine machine = Controller.inputWS();
        int num = Controller.inputInt("Input number of linens");
        ColoredLinen[] basket = new ColoredLinen[num];
        for (int i = 0; i < num; i++)
        {
            basket[i] = Controller.inputLinen();
        }
        for (ColoredLinen linen : basket)
        {
            machine.Load(linen);
        }
        for (int i = 0; i < machine.linens.length; i++) 
        {
        	if (machine.linens[i] != null) 
        		System.out.println(machine.linens[i].toString());
        	else {
        		System.out.println("This machine is a void!");
        		break;
        	}
        }
    }
}
