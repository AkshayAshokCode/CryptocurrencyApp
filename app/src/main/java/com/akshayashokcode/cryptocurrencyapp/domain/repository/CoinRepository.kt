package com.akshayashokcode.cryptocurrencyapp.domain.repository

import com.akshayashokcode.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.akshayashokcode.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins():List<CoinDto>

    suspend fun getCoinById(coinId:String): CoinDetailDto
}