package cl.desafiolatam.pruebaandroid.model;

public class RetrofitClientDog {

    private static Retrofit retrofit;

    private static final String URL="https://dog.ceo/";

    public static Retrofit getRetrofitDog(){

        if(retrofit== null){
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        } return retrofit;
    }
}
