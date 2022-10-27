public class Main {
    public static void main(String[] args) {

        var dog = 8;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);


        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var weightOfTheFirstBoxer = 78.2;
        var weightOfTheSecondBoxer = 82.7;
        var totalWeight = weightOfTheFirstBoxer + weightOfTheSecondBoxer;
        System.out.println("Общий вес двух бойцов " + totalWeight + "кг ");
        var weightDifference = weightOfTheSecondBoxer - weightOfTheFirstBoxer;
        System.out.println("Разница веса бойцов " + weightDifference + "кг ");

        var totalHours = 640;
        var employeeHours = 8;
        var numberOfEmployees = totalHours / employeeHours;
        System.out.println("Всего работников в компании - " + numberOfEmployees + " человек ");

        var newEmployees = 94;
        var theNumberOfPeopleWithAnIncrease = numberOfEmployees + newEmployees;
        var newOpeningHours = totalHours / theNumberOfPeopleWithAnIncrease;
        System.out.println(" Если в компании работает " + theNumberOfPeopleWithAnIncrease +
                " сотрудника, то всего " + newOpeningHours + " часа работы может быть поделено между сотрудниками");
    }
}