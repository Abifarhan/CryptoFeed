package com.hightech.cryptoapp.main.factories

import com.hightech.cryptoapp.frameworks.HttpFactory
import com.hightech.cryptoapp.crypto.feed.http.CryptoFeedService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class CryptoFeedServiceFactory {

    @Provides
    fun createCryptoFeedService(retrofit: Retrofit): CryptoFeedService {
        return retrofit.create(CryptoFeedService::class.java)
    }
}