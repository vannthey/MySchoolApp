package com.example.useaapp.GUEST.Events.current;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Apiset_guest_event_current
{
    @GET("fetch_guest_event_current.php")
    Call<List<Response_model_guest_event_current>> getdata();
}