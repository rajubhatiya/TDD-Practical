package com.tdd.rbhatiya.practical.singlton;

import java.io.*;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        try {
//            exampleSerializtion();
//            exampleSerializtionSinglton();
            singltonBreakWithReflection();
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static void exampleSerializtion() throws IOException, ClassNotFoundException {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.obj"));
        objectOutputStream.writeObject(lazySingleton);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
        LazySingleton lazySingleton1 = (LazySingleton) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("lazySingleton : " +lazySingleton.hashCode());
        System.out.println("lazySingleton1 : " +lazySingleton1.hashCode());
    }

    private static void exampleSerializtionSinglton() throws IOException, ClassNotFoundException {
        SerializationSingleton serializationSingleton = SerializationSingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.obj"));
        objectOutputStream.writeObject(serializationSingleton);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
        SerializationSingleton SerializationSingleton1 = (SerializationSingleton) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("SerializationSingleton : " +serializationSingleton.hashCode());
        System.out.println("SerializationSingleton1 : " +serializationSingleton.hashCode());
    }

    public static void singltonBreakWithReflection() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
        for(Constructor c : constructors){
            c.setAccessible(true);
            LazySingleton lazySingleton = (LazySingleton) c.newInstance();
            System.out.println("lazySingleton : " +lazySingleton.hashCode());
        }
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println("Lazy singleton "+lazySingleton.hashCode());
    }

}
