class Animal {
    protected String habitat;
    protected String name;

    public Animal(String name , String habitat){
        this.habitat = habitat;
        this.name = name;
    }

    public void eat(){
        System.out.println(name + " eating a food");
    }

    public void sleep(){
        System.out.println(name + " sleeping in a quiet place");
    }

    public void printinfo(){
        System.out.println("Name            :" + name);
        System.out.println("Natural Habitat :" + habitat);
    }
}

class fish extends Animal {
    private String moved;
    private String size;
    private String food;
    private String sound;

    public fish(String name , String habitat , String moved , String size, String food , String sound){
        super(name, habitat);
        this.size = size;
        this.moved = moved;
        this.food = food;
        this.sound = sound;
    }

    public void moves() {
        System.out.println(name + " can move by mean of " + moved);
    }

    public void food(){
        System.out.println(name + " unsually have food " + food);
    }

    public void habitat(){
        System.out.println(name + " have habitat in the " + habitat);
    }
    public void sound(){
        System.out.println(name + " this sound like a " + sound);
    }
 
    @Override
    public void printinfo(){
        System.out.println("----- info fish -----");
        super.printinfo();
        System.out.println(" have size : " + size);
        System.out.println("Food : " + food);
        System.out.println("moved : " + moved);
    }
}

class cat extends Animal{
    private String moved;
    private String food;
    private String kind;
    private double speedwalk;

    public cat ( String habitat , String name , String moved , String food , String kind , double speedwalk){
        super(name, habitat);
        this.moved = moved;
        this.food = food;
        this.kind = kind;
        this.speedwalk = speedwalk;
    }
    public void moves(){
        System.out.println(name + " can move by mean of " + moved);
    }
    public void food(){
        System.out.println(name + " unsually have food " + food);
    }

    public void habitat(){
        System.out.println(name + " have habitat in the " + habitat);
    }
    
    public void kinds(){
        System.out.println(name + " the kind is " + kind);
    }
    public void speedwalk(){
        System.out.println(name + " have speed walk in range " + speedwalk);
    }
    public void printinfo(){
        System.out.println("---- Print Info ------");
        super.printinfo();
        System.out.println("food : " + food);
        System.out.println("moved : " + moved);
        System.out.println("kind : " + kind);
        System.out.println("speed walk : " + speedwalk );
    }
}