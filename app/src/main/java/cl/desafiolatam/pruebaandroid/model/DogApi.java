package cl.desafiolatam.pruebaandroid.model;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DogApi {


    @GET("api/breeds/list")
    Call<BreedsText> breedResponse;
}
