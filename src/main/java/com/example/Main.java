package com.example;

import com.example.entities.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        User usuario = new User();
        byte option;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba la opcion que desee realizar! \n" +
                "1. Registrar Usuario \n" +
                "2. Verificar Login ");

        option = sc.nextByte();


        switch (option){
            case 1 -> {
                usuario.register("antonymatus@gmail.com","234234");
               break;
            }
            case 2 -> {
                usuario.login("antonyrebolledo@gmail.com", "12345");
                break;
            }
            default -> {
                System.out.println("La opcion introducida no es Valida!");
            }
        }
    }
}
