package gui.console;


import be.*;
import bll.Menu;

import java.util.Scanner;


public class Main extends Menu {
   static PersonManager  pm = new PersonManager();
    Scanner scn = new Scanner(System.in);

    public Main(String header, String[] menuItems) {
        super(header, menuItems);

    }

    public static void main(String[] args) {
        Main mainMenu = new Main("This is a shitty school system",
                new String[]{"(0)Exit",
                        "(1)Add Student",
                        "(2)Add Teacher",
                        "(3)Show all students",
                        "(4)Show all teachers",
                        "(5)Show all persons",
                        "(6)Get Person by id",
                        "(7)Remove person",
                        "(8)Clear"} );
        mainMenu.showHeader();
        mainMenu.run();
    }

    @Override
    protected void doAction(int option) {



        switch (option){
            case 1 -> {
                int id;
                String name;
                String email;
                String education;
                System.out.println("gimme a  id");
                id = Integer.parseInt(super.scn.nextLine());
                System.out.println("name:");
                name = super.scn.nextLine();
                System.out.println("email:");
                email = super.scn.nextLine();
                System.out.println("education:");
                education = super.scn.nextLine();
                pm.addPerson(new Student(id, name, email, education));
            }

            case 2 -> {
                int id;
                String name;
                String email;
                String initials;
                double salary;
                System.out.println("gimme a id");
                id = Integer.parseInt(super.scn.nextLine());
                System.out.println("name:");
                name = super.scn.nextLine();
                System.out.println("email:");
                email = super.scn.nextLine();
                System.out.println("intials:");
                initials = scn.nextLine();
                System.out.println("saraly:");
                salary = Double.parseDouble(super.scn.nextLine());
                pm.addPerson(new Teacher(id, name, email, salary, initials));
            }

            case 3 -> {
                for (Person n : pm.getAllStudents()){
                    System.out.println(n.toString());
                }
            }

            case 4 ->{
                for (Person n : pm.getAllTeachers()){
                    System.out.println(n.toString());
                }
            }

            case 5 -> {
                for (Person n : pm.getAllPersons()){
                    System.out.println(n.toString());
                }
            }

            case 6->{

                System.out.println("Gimme id to search");
                int id = Integer.parseInt(super.scn.nextLine());

                System.out.println(pm.getPerson(id));
            }

            case 7 -> {
                System.out.println("Gimme id to remove");
                int id = Integer.parseInt(scn.next());
                System.out.println(pm.getPerson(id ) + "Removed");
                pm.removePerson(id);
            }

            case 8 -> {clear();}
        }
    }
}
