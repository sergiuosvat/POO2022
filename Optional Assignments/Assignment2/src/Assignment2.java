import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Assignment2 {

    /* Since we are prohibited from using loops, it seems pointless to use StringBuilder when you can use streams.
    The variables should be named in a suggestive way but i decided to use random names in order to prove that the code works as intended.
    */

    public static List<Character> getFirstLetter(String str) {
        return Arrays.stream(str.split("[, ]+")).filter(Objects::nonNull).map(string -> string.charAt(0)).collect(Collectors.toList());
    }

    public static List<String> removeOddLengths(String str) {

        return Arrays.stream(str.split("[, ]+")).filter(s -> s.length() % 2 == 0).collect(Collectors.toList());
    }

    public static String capitalizeWords(String str) {
        return Arrays.stream(str.split("[, ]+")).map(s -> s.substring(0, 1).toUpperCase() + s.substring(1)).collect(Collectors.joining(" "));
    }

    public static String appendToString(Map<String, String> strMap) {
        return strMap.entrySet().stream().map(entry -> entry.getKey() + entry.getValue()).collect(Collectors.joining());
    }

    public static String toLowerCase(String str) {
        return str.toLowerCase();
    }

    public static String toLowerCaseOdd(String str) {
        str = str.toLowerCase();
        return Arrays.stream(str.split("[, ]+")).filter(s -> s.length() % 2 == 1).collect(Collectors.joining(" "));
    }

    public static String joinIndex(List<String> str) {
        return str.get(1) +
                "-" +
                str.get(2) +
                "-" +
                str.get(3);
    }

    //limited for testing the other methods as well, it can run until there is no more RAM memory available
    public static void powersOfTwo() {
        Stream.iterate(BigInteger.TWO, n -> n.multiply(BigInteger.TWO)).limit(30).forEach(System.out::println);
    }

    public static Optional<Integer> palindrome(int number) {
        if ((String.valueOf(number).equals(new StringBuilder(String.valueOf(number)).reverse().toString())))
            return Optional.of(number);
        else {
            return Optional.empty();
        }
    }

    //A workaround for finding how many palindromes are while also sticking to the requirements of the given task
    public static int countPalindrome(List<Integer> myList) {
        List<Optional<Integer>> x = Stream.iterate(0, n -> n + 1).limit(myList.size()).map(n -> palindrome(myList.get(n))).filter(Optional::isPresent).toList();
        return x.size();
    }

    public static Double averageSalary(List<Employee> myList) {
        return myList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
    }

    public static Map<String, Integer> mapStudents(List<Student> myList) {
        return myList.stream().collect(Collectors.toMap(Student::getName, Student::getCourseList));
    }

    public static List<Car> sortCarsDescending(List<Car> myList) {
        return myList.stream().sorted(Comparator.comparingDouble(Car::getPrice).reversed()).collect(Collectors.toList());
    }

    public static long fibonaciSum(long limit) {
        return Stream.iterate(new long[]{0, 1}, p -> new long[]{p[1], p[0] + p[1]}).limit(limit).map(t -> t[0]).mapToLong(Long::longValue).sum();
    }

    public static void main(String[] args) {

        System.out.println();
        System.out.println("First letter:");
        System.out.println(getFirstLetter("Amazon, Lol, Dumb, close") + "\n");
        System.out.println("Remove odd lengths:");
        System.out.println(removeOddLengths("writer, efficiency, cat, dog, even, odd") + "\n");
        System.out.println("Capitalize each letter:");
        System.out.println(capitalizeWords("dog, cat, hot, cold, can, whatever") + "\n");
        System.out.println("Pair of key-value to concatenated string");
        Map<String, String> test = new LinkedHashMap<>();
        test.put("Java", "IsFun");
        test.put("NotSoFun", "Anymore");
        System.out.println(appendToString(test) + "\n");
        System.out.println("To Lower Case:");
        System.out.println(toLowerCase("ABCD, DOG, CAT, lol") + "\n");
        System.out.println("To Lower Case Odd:");
        System.out.println(toLowerCaseOdd("EVEN, ODD, CAT, LOL, can, trash, abcd") + "\n");

        System.out.println("Join the second, third and forth element with a -:");
        List<String> str = new ArrayList<>();
        str.add("Test");
        str.add("Test2");
        str.add("Test3");
        str.add("Test4");
        str.add("Test5");
        System.out.println(joinIndex(str) + "\n");

        System.out.println("Powers of two:");
        powersOfTwo();
        System.out.println();

        System.out.println("How many palindromes are in the given list:");
        List<Integer> integerList = new ArrayList<>();
        integerList.add(121);
        integerList.add(343);
        integerList.add(123);
        System.out.println(countPalindrome(integerList) + "\n");

        System.out.println("Average salary of the given employees:");
        Employee a = new Employee("Ionut", 20, 4000.5);
        Employee b = new Employee("Vlad", 29, 3500.6);
        Employee c = new Employee("Petru", 30, 2000.7);
        List<Employee> myList = new ArrayList<>();
        myList.add(a);
        myList.add(b);
        myList.add(c);
        System.out.println(averageSalary(myList) + "\n");

        System.out.println("Map of students: ");
        List<String> cursuri = new ArrayList<>();
        cursuri.add("Istorie");
        cursuri.add("Matematica");
        List<String> cursuri2 = new ArrayList<>();
        cursuri2.add("Romana");
        cursuri2.add("Engleza");
        cursuri2.add("Desen");
        List<String> cursuri3 = new ArrayList<>();
        cursuri3.add("Romana");
        cursuri3.add("Engleza");
        cursuri3.add("Desen");
        cursuri3.add("Informatica");
        Student d = new Student("Sergiu", 7.5, cursuri);
        Student e = new Student("Radu", 8.5, cursuri2);
        Student f = new Student("Ion", 10.0, cursuri3);
        List<Student> studentList = new ArrayList<>();
        studentList.add(d);
        studentList.add(e);
        studentList.add(f);
        System.out.println(mapStudents(studentList) + "\n");

        System.out.println("List of sorted cars in descending order based on price:");
        List<Car> carList = new ArrayList<>();
        Car c1 = new Car("Toyota", 2002, "red", 2000.5);
        Car c2 = new Car("Renault", 2010, "grey", 5000.7);
        Car c3 = new Car("Ford", 2012, "blue", 6000.9);
        Car c4 = new Car("Audi", 2020, "black", 15000.5);
        carList.add(c1);
        carList.add(c2);
        carList.add(c3);
        carList.add(c4);
        System.out.println(sortCarsDescending(carList) + "\n");

        System.out.println("The sum of fibonacci numbers up to a given limit:");
        System.out.println(fibonaciSum(10));

    }
}