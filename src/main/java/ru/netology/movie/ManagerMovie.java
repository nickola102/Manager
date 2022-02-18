package ru.netology.movie;

public class ManagerMovie {

    private int limit = 10;


    public ManagerMovie(int limit) {
        this.limit = limit;
    }

    public ManagerMovie() {

    }
    private Movie[] movies = new Movie[0];

    public void save(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Movie[] findAll() {
        return movies;
    }

    public Movie[] findLast() {
        Movie [] movies = findAll();
        Movie[] result = new Movie[limit];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}


