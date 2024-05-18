import java.util.List;

class SearchStrategy implements Strategy {
    private String searchTerm;

    public SearchStrategy(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    @Override
    public List<Movie> filter(List<Movie> data) {
        List<Movie> filteredMovies = new ArrayList<>();
        for (Movie movie : data) {
            if (movie.getTitle().contains(searchTerm) || movie.getDescription().contains(searchTerm)) {
                filteredMovies.add(movie);
            }
        }
        return filteredMovies;
    }
}
