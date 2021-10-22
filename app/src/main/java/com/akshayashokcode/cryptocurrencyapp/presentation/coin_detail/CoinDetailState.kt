package com.akshayashokcode.cryptocurrencyapp.presentation.coin_detail

import com.akshayashokcode.cryptocurrencyapp.data.repository.Coin
import com.akshayashokcode.cryptocurrencyapp.data.repository.CoinDetail

data class CoinDetailState(
    val isLoading:Boolean=false,
    val coin:CoinDetail? = null,
    val error:String=""
)
