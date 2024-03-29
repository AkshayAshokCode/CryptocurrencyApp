package com.akshayashokcode.cryptocurrencyapp.domain.use_case.get_coin

import com.akshayashokcode.cryptocurrencyapp.common.Resource
import com.akshayashokcode.cryptocurrencyapp.data.remote.dto.toCoin
import com.akshayashokcode.cryptocurrencyapp.data.remote.dto.toCoinDetail
import com.akshayashokcode.cryptocurrencyapp.data.repository.Coin
import com.akshayashokcode.cryptocurrencyapp.data.repository.CoinDetail
import com.akshayashokcode.cryptocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId:String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading<CoinDetail>())
            val coin=repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success<CoinDetail>(coin))

        }catch (e:HttpException){
            emit(Resource.Error<CoinDetail>(e.localizedMessage?:"An unexpected error occurred"))
        }catch (e:IOException){
            emit(Resource.Error<CoinDetail>("Check your internet connection"))
        }
    }
}