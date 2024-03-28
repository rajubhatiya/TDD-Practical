package com.tdd.rbhatiya.practical.ser_des;

import java.io.*;

public class TestSerDes {
    public static void main(String[] args) {
        writeFile();
        try {
            whenCustomSerializingAndDeserializing_ThenObjectIsTheSame();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void writeFile(){
        try {
            Person person = new Person(10, "Raj", new Address(1,"Hyderabad", "Telangana", "India"));
            FileOutputStream fileOutputStream = new FileOutputStream("d:/testSer.txt");
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(person);
                objectOutputStream.flush();
                objectOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("d:/testSer.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            try {
                Person person = (Person) objectInputStream.readObject();
                System.out.println(person);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            objectInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void whenCustomSerializingAndDeserializing_ThenObjectIsTheSame()
            throws IOException, ClassNotFoundException {
        Person p = new Person();
        p.setAge(20);
        p.setName("Joe");

        Address a = new Address();
        a.setHouseNumber(1);

        Employee e = new Employee();
        e.setPerson(p);
        e.setAddress(a);

        FileOutputStream fileOutputStream
                = new FileOutputStream("d:/yourfile2.txt");
        ObjectOutputStream objectOutputStream
                = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(e);
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream
                = new FileInputStream("d:/yourfile2.txt");
        ObjectInputStream objectInputStream
                = new ObjectInputStream(fileInputStream);
        Employee e2 = (Employee) objectInputStream.readObject();
        System.out.println(e2);
        objectInputStream.close();

    }
}
