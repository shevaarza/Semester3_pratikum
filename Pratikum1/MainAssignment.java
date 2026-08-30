public class MainAssignment{
       public static void main(String[] args) {

        //object car 
        
        car car1 = new car("Toyota Avanza", 60 );
        System.out.println("---------- this is car object ----------");
        car1.running();
        car1.printinfo();
        System.out.println();

        
        // object handphone 
        hp hp1 = new hp("13 pro max", "this is expensive phone", 12000000, "iphone");
        System.out.println("---------- this is handphone object -------------------");
        hp1.describes();
        hp1.printinfo();
        System.out.println();


        // object Animal cat 
        cat cat1 = new cat("Nature", "Sican", "walk", "Pindang Food", "Anggora", 5);
        System.out.println("------------- this is Animal Object --------------");
        cat1.eat();
        cat1.food();
        cat1.habitat();
        cat1.kinds();
        cat1.moves();
        cat1.printinfo();
        System.out.println();

        // object Animal fish 

        fish fish1 = new fish("sudar", "Sea", "Swim", "small", "small fish", "blug blug blug");
        System.out.println("-------- this is Animal Objet --------------------");
        fish1.habitat();
        fish1.moves();
        fish1.eat();
        fish1.printinfo();
        System.out.println();

       }
}