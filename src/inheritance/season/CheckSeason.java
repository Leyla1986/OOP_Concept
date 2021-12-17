package inheritance.season;

public class CheckSeason {
    public static void main(String[] args) {


        Winter win = new Winter("Winter", 100, 45);
        System.out.println(win.toString());
        System.out.println(win.activity("FirePlace"));


        Summer sum = new Summer("Summer", 75, 25);
        System.out.println(win.toString());
        System.out.println(win.activity("Drink Lemonade"));

        Fall fall = new Fall("Fall", 55, 40);
        System.out.println(win.toString());
        System.out.println(win.activity("Read A Book"));

        Spring spring = new Spring("Spring", 98, 66);
        System.out.println(win.toString());
        System.out.println(win.activity("Go outside"));


    }
}
