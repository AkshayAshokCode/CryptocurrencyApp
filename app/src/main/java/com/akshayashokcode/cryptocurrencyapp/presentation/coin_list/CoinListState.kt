package com.akshayashokcode.cryptocurrencyapp.presentation.coin_list

import com.akshayashokcode.cryptocurrencyapp.data.repository.Coin

data class CoinListState(
    val isLoading:Boolean=false,
    val coins:List<Coin> = emptyList(),
    val error:String=""
)
