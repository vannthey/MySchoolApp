package com.example.useaapp.GUEST.Events.upcoming;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiController_guest_event_upcoming
{
   private static final String url="https://myuseaapp.000webhostapp.com/Guest/";
   private static ApiController_guest_event_upcoming clientobject;
   private static Retrofit retrofit;

     ApiController_guest_event_upcoming()
     {
        retrofit=new Retrofit.Builder()
                     .baseUrl(url)
                     .addConverterFactory(GsonConverterFactory.create())
                     .build();
     }

     public static synchronized ApiController_guest_event_upcoming getInstance()
     {
          if(clientobject==null)
              clientobject=new ApiController_guest_event_upcoming();
          return clientobject;
     }

     Apiset_guest_event_upcoming getapi()
     {
         return retrofit.create(Apiset_guest_event_upcoming.class);
     }
}