public class Main {
    public static void main(String[] args) {
        //
        // задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("\nЗадача 1");
        System.out.println("dog = " + dog + ", cat = " + cat + ", paper = " + paper);
        //
        // задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("\nЗадача 2");
        System.out.println("dog = " + dog + ", cat = " + cat + ", paper = " + paper);
        //
        // задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("\nЗадача 3");
        System.out.println("dog = " + dog + ", cat = " + cat + ", paper = " + paper);
        //
        // задача 4
        var friend = 19;
        System.out.println("\nЗадача 4");
        System.out.print("friend 1st step = " + friend);
        friend = friend + 2;
        System.out.print(", friend 2nd step = " + friend);
        friend = friend / 7;
        System.out.print(", friend 3d step = " + friend);
        //
        // задача 5
        var frog = 3.5;
        System.out.println("\n\nЗадача 5");
        System.out.print("frog 1st step = " + frog);
        frog = frog * 10;
        System.out.print(", frog 2nd step = " + frog);
        frog = frog / 3.5;
        System.out.print(", frog 3d step = " + frog);
        frog = frog + 4;
        System.out.print(", frog 4th step = " + frog);
        //
        // задача 6
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var weightSum = firstBoxer + secondBoxer;
        var weightDifference = secondBoxer - firstBoxer;
        System.out.println("\n\nЗадача 6");
        System.out.println("Weight Sum = " + weightSum);
        System.out.println("Weight Difference = " + weightDifference);
        //
        // задача 7
        System.out.println("\nЗадача 7");
        System.out.println("Weight Difference (with ' - ' operation) = " + weightDifference);
        weightDifference = secondBoxer % firstBoxer;
        System.out.println("Weight Difference (with ' % ' operation) = " + weightDifference);
        //
        // задача 8
        var overallTime = 640;
        var personalTime = 8;
        var numberOfPeople = overallTime / personalTime;
        System.out.println("\nЗадача 8");
        System.out.println("Всего работников в компании " + numberOfPeople + " человек");
        var extraPeople = 94;
        numberOfPeople = numberOfPeople + extraPeople;
        overallTime = numberOfPeople * personalTime;
        System.out.println("Если в компании работает " + numberOfPeople + " человек, то всего " + overallTime + " часов работы может быть поделено между сотрудниками");

    }
}