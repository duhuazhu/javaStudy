package com.huazhu.movie;

public class demo {
    public static void main(String[] args) {
        movie[] movies = new movie[3];
        movies[0] = new movie("《长津湖》", 9.7, "吴京");
        movies[1] = new movie("《长津湖1》", 9.7, "吴京");
        movies[2] = new movie("《长津湖2》", 9.7, "吴京");

        for (int i = 0; i < movies.length; i++) {
            System.out.println("片名:"+movies[i].getName());
            System.out.println("评分:"+movies[i].getGrade());
            System.out.println("导演:"+movies[i].getDirector());
            System.out.println("------------------------------------------");
        }
    }
}

