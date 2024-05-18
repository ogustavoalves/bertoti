import java.util.List;

class MovieList {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public List<Movie> filterMovies(List<Movie> data) {
        return strategy.filter(data);
    }
}