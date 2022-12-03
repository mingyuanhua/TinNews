package com.laioffer.tinnews.repository;

import com.laioffer.tinnews.network.NewsApi;
import com.laioffer.tinnews.network.RetrofitClient;

public class NewsRepository {

    private final NewsApi newsApi;

    public NewsRepository() {
        newsApi = RetrofitClient.newInstance().create(NewsApi.class);
    }
}
