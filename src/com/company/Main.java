package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Song> songs = new ArrayList<>();
        for (int i = 0; i< 10;i++){
            System.out.println("An Artist: ");
            String artist = input.next();  //modify program to prompt user for an artist
            System.out.println("A Title: ");
            String title = input.next(); //modify program to prompt user for a title
            Song s = new Song();
            s.setArtist(artist);
            s.setTitle(title);
            songs.add(s);
        }

        //print all the songs in the array list
        for(Song so: songs){
            System.out.println(so);
        }

        //look for blue and print if found
        System.out.println("Title find: ");
        String titleToFind = input.next();
        for (Song so: songs){
            if (so.getTitle().equals(titleToFind)){
                System.out.println("I found: \r\n" + so.getArtist());
            }
        }
    }
}