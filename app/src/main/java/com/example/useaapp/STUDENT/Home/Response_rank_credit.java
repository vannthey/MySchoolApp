package com.example.useaapp.STUDENT.Home;

import com.google.gson.annotations.SerializedName;

public class Response_rank_credit {

    @SerializedName("Total Credit")
    String Credit;

    @SerializedName("Rank")
    String Rank;

    public Response_rank_credit(String credit, String rank) {
        Credit = credit;
        Rank = rank;
    }

    public String getRank() {
        return Rank;
    }

    public String getCredit() {
        return Credit;
    }
}