package com.example.useaapp.GUEST.Events.past;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiController_guest_event_past
{
   private static final String url="https://myuseaapp.000webhostapp.com/Guest/";
   private static ApiController_guest_event_past clientobject;
   private static Retrofit retrofit;

     ApiController_guest_event_past()
     {
        retrofit=new Retrofit.Builder()
                     .baseUrl(url)
                     .addConverterFactory(GsonConverterFactory.create())
                     .build();
     }

     public static synchronized ApiController_guest_event_past getInstance()
     {
          if(clientobject==null)
              clientobject=new ApiController_guest_event_past();
          return clientobject;
     }

     Apiset_guest_event_past getapi()
     {
         return retrofit.create(Apiset_guest_event_past.class);
     }
}