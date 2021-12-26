package com.example.entities;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class User {

    String username;
    String email;
    String password;

    static ArrayList<String> Users = new ArrayList<>();
    static String emailUnico = "antonyrebolledo@gmail.com";
    static String passwd = "12345";
    static String passwordencrypt = Argon2(passwd);

    List<student>  students = new ArrayList<>();
    List<User> users = new ArrayList<>();

    public User() {
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<student> getStudents() {
        return students;
    }

    public void setStudents(List<student> students) {
        this.students = students;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }



    public static String Argon2 (String txt){
        String password = txt;
        Instant beginHash = Instant.now();

        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2i);

        String hash = argon2.hash(4,1024 * 1024, 8, password);
        return hash;
    }

    public static boolean register(String email, String password){

        Users.add(emailUnico);
        Users.add(passwordencrypt);

        boolean respuesta = true;
        for (int i = 0; i < Users.size(); i++){
            if (email == Users.get(i)){
                respuesta = false;
                break;
            } else{
                Users.add(email);
                Users.add(Argon2(password));
                respuesta = true;
                System.out.println("El usuario ha sido registrado con exito!");
                break;
            }
        }

        return respuesta;

    }

    public static int login(String email, String password){
        int respuesta = 0;
        int respuesta2 = 0;
        String encryptpass = Argon2(password);
        for (int i = 0; i < Users.size(); i++){
            if (email == Users.get(i) ){

                if (Users.contains(encryptpass)){
                    respuesta2 = 1;
                    System.out.println("La contraseña es Correcta");
                } else {
                    respuesta2 = -2;
                    System.out.println("La contraseña es incorrecta");
                }

                respuesta = respuesta2;
                break;
            }else if(email != Users.get(i)){
                respuesta = -1;
            }
        }


        System.out.println(respuesta);
        return  respuesta;
    }
}
