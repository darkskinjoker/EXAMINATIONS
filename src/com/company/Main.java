package com.company;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// create 19 student objects in your class
        Student s1 = new Student("Marit", 245678210, 2021,"Estonia", "10 Suur Sojamae", 240046753, 54673219,"Software Development" );
        Student s2 = new Student("Dele", 278902340, 2019, "Nigeria", "13 Vageva Tee", 547783902, 54678930, "Business");
        Student s3 = new Student("Jamal", 345789020, 2018, "Iran", "7 Majaka tanav", 56478932, 54678903, "Finance");
        Student s4 = new Student("Malek", 345479263, 2022, "India", "14 Pirita tee", 657890234, 76890345, "Business");
        Student s5 = new Student("Jana", 268406867, 2021, "Estonia", "35 Randvere tee", 34567892, 43567832, "Software Development");
        Student s6 = new Student("Malcolm", 368409267, 2017, "U.S.A", "4 Peterburi tee", 54667899,34678902, "Finance");
        Student s7 = new Student("Maria", 224567846, 2020, "Greece", "52 Tartu Mnt", 432783467, 54678902, "Game Design");
        Student s8 = new Student("James", 234567890, 2021, "Ireland", "12 Reidi Tee",234567890, 45638234, "Game Design");
        Student s9 = new Student("Vladislav", 256378902, 2018, "Spain", "43 Narva Mnt",65783904,45678923, "Business"  );
        Student s10 =new Student("Janik", 345679120, 2018, "Slovenia", "1 Lootsi", 34567892, 54679021,"Finance");
        Student s11= new Student("German", 336789034, 2021, "Germany", "15 Vimsi Tanav", 256789034, 54670782, "Finance");
        Student s12= new Student("Yala", 345970567, 2017, "Sweden", "12 Moigu Tee", 543678902, 456708993,"Fashion");
        Student s13= new Student("Madis", 243567894, 2022, "Estonia", "34 Jarvevana Tee", 456789034, 34678927, "Management");
        Student s14= new Student("Rafael", 234566980, 2021, "Mexico", "5 Laike Tanav", 435680902, 78023567, "Software Development");
        Student s15= new Student("Moses", 334960456, 2022, "Nigeria", "23 Meera tee", 435678901, 56235690, "Business");
        Student s16= new Student("Inna", 234079835, 2021, "Estonia", "6 Kivumurru", 345798345, 35660891, "Business");
        Student s17= new Student("Anne Marie", 23478905, 2018, "Denmark", "2 Veesaare", 54378904, 98712340, "International Relations");
        Student s18= new Student("Victoria", 456378923, 2016, "Nigeria", "67 Cr Jakobsoni", 97126589, 52860752, "Finance");
        Student s19= new Student("Johann", 923567890, 2021, "Russia", "25 Nurme", 456789032, 65790234, "Business");
    //create an array of students
        Student[] group = {s1, s2, s3, s4, s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19};
    //Print all students' data in a format NAME ADMISSION_YEAR COUNTRY
        printAllStudents(group);

    //Calculate, how many students are originally from your country.
        studentsFromMyCountry(group);

    //Calculate, how many students are originally NOT from Estonia.
        studentsNotFromEstonia(group);

     //Calculate, how many male students.*****************not finished
        maleStudents(group);

    //Find the student(s), who has the earliest admission year.
        earliestAdmissionYear(group);

    ///Find the student(s), who has the latest admission year.
        latestAdmissionYear(group);




    //Create 2 arrays group01 and group02.
        Student[] group01 = {s3, s4, s7,s9,s10,s13,s15,s17,s18};
        Student[] group02 = {s1, s2,s5,s6,s8,s11,s12,s14,s16,s19};

    //Print all students' data in a format
        //Group 01
        //NAME ADMISSION_YEAR  CURRICULUM_NAME COUNTRY

        try {
            FileWriter myWriter = new FileWriter("group01.csv");
            myWriter.write(String.valueOf(group01));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        //Group 02
        //NAME ADMISSION_YEAR  CURRICULUM_NAME COUNTRY
        try {
            FileWriter myWriter = new FileWriter("group02.csv");
            myWriter.write(String.valueOf(group02));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void printAllStudents (Student[] group) {
        for (Student s : group) {
            System.out.println(s.getName() + ", " + s.getAdmissionYear() +", " + s.getOriginCountry());}
    }

    public static void studentsFromMyCountry (Student[] group){
        int sum = 0;
        for (Student s : group) {
            if (s.getOriginCountry() == "Nigeria") sum++;
            {
                System.out.println("Total Number of Students from Nigeria is " + sum);
            }
        }
    }
    public static void studentsNotFromEstonia (Student[] group) {
        int count = 0;
        for (Student s : group) {
            if (s.getOriginCountry() != "Estonia") count++;
            {
                System.out.println("Total Number of Students not from Estonia is " + count);
            }
        }
    }
    public static void maleStudents(Student[] group) {
        int maleNum =0;
        for (Student s : group) {
            if (s.getEstonianPersonalID() % 2 != 0) maleNum++; {
                System.out.println("The number of male students is "+ maleNum);
            }
        }
    }
    public static void earliestAdmissionYear(Student[] group){
        int earliestYear = group[0].getAdmissionYear();
        int earliestYearIndex = 0;

        for (int i = 1; i < group.length; i++) {
            if (earliestYear == 2017);
            {
                System.out.println(group[earliestYearIndex].getAdmissionYear() + "was admitted the earliest in " + earliestYear);
            }
        }
    }
    public static void latestAdmissionYear(Student[]group){
        int latestYear = group[0].getAdmissionYear();
        int latestYearIndex = 0;
        for (int i = 1; i < group.length; i++){
            if (latestYear == 2022);
            System.out.println(group[latestYearIndex].getAdmissionYear() + "was admitted the latest in " + latestYear);}
    }
    public static void group01data (Student[]group01){
        for (Student s : group01) {
            System.out.println(s.getName() + ", " + s.getAdmissionYear() +", "+ s.getCurriculumName() +", " + s.getOriginCountry());}
    }
    public static void group02data (Student[]group02){
        for (Student s : group02) {
            System.out.println(s.getName() + ", " + s.getAdmissionYear() +", "+ s.getCurriculumName() +", " + s.getOriginCountry());}
    }

}


