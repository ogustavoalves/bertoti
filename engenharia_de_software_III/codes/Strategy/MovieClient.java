import java.util.ArrayList;
import java.util.List;
import MovieList;

public class MovieClient {

    public static void main(String[] args) {
        List<Movie> movies = new ArrayList();
    

    MovieList movieList = new MovieList();

    MovieList.setStrategy(new SearchStrategy("comedy")); {
        List<Movie> filteredMovies = movieList.filterMovies(movies);
    }

    
    movieList.setStrategy(new MostWatchedStrategy()); {
        filteredMovies = movieList.filterMovies(movies);
    }
    
    
    movieList.setStrategy(new FavoritedStrategy()); {
            filteredMovies = movieList.filterMovies(movies);
        }
    }
}