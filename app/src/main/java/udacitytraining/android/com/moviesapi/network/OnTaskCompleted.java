package udacitytraining.android.com.moviesapi.network;


import udacitytraining.android.com.moviesapi.model.Movie;

/**
 * Created by Ayetolu
 * <p/>
 *
 */
interface OnTaskCompleted {
    void onFetchMoviesTaskCompleted(Movie[] movies);
}
