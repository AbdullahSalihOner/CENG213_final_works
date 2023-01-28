public class TestClass {
    public  static  void main(String args[])
    {
        Living livingObjects[] = new Living[3];

        livingObjects[0] = new Dog("Köpek1","karabas");
        livingObjects[1] = new Cat("kedi1","catt","tür1");
        livingObjects[2] = new AnkaraCat("pursaklar","cat1","tür2");
        //polymorphism
        Animal cat1 = new Cat("Kedi","cat","tekir");
        System.out.println(cat1.toString());

        Dog dog2 = new Dog("köpek yeni",   "mormal");
        Animal dog1 =  dog2;

        System.out.println(dog2);
        System.out.println("*******");
        //Polymorphic call
        System.out.println(dog1.toString());
        System.out.println("*******");


        Cat cat2 = new Cat("kedim","siyah","güzel");

        if (cat1 instanceof Animal)
        {
            //Downcasting
            Cat newCat1 = (Cat)cat1;
        }

        //overloading

        cat2.Sound("meow");

        for (Living currentLiving : livingObjects)
        {
            System.out.printf("%s\n",currentLiving.toString());
        }

    }
}
