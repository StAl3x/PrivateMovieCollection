package bll;

import java.util.Scanner;

public abstract class Menu
{
    // value used to exit the menu.
    // the value can be changed by the sub-class constructor.
    protected int EXIT_OPTION = 0;

    private final String header;

    private final String[] menuItems ;
    protected Scanner scn;

    protected abstract void doAction(int option);



    public Menu(String header, String[] menuItems)
    {
        this.header = header;
        this.menuItems = menuItems;
        scn = new Scanner(System.in);
    }


    public void run()
    {
        boolean done = false;
        while (!done)
        {

            showMenu();
            int option = getOption();
            doAction(option);
            if (option == EXIT_OPTION)
            {
                done = true;
            }
        }
    }

    private int getOption()
    {
        String input = scn.nextLine();
        int option  = Integer.parseInt(input);
        pause();
        if (option > menuItems.length || option < 0 ) {
            System.out.println("Out of range");
            return -1;
        }

        else {
            return option;
        }

    }


    private void showMenu() {
        for (String n : menuItems){System.out.println(n);}
    }
    protected void showHeader(){System.out.println(header);}

    protected void pause()
    {
        scn.nextLine();
    }

    protected void clear()
    {
        for(int i = 0; i < 40; i++)
            System.out.println();
    }
}
