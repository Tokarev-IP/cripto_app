package test.app.criptoapp.di

import dagger.Module
import dagger.Provides
import test.app.criptoapp.mvp.CurrenciesPresenter
import test.app.criptoapp.mvp.LatestChartPresenter
import javax.inject.Singleton

@Module
class MvpModule {

    @Provides
    @Singleton
    fun provideCurrenciesPresenter(): CurrenciesPresenter = CurrenciesPresenter()

    @Provides
    @Singleton
    fun provideLatestChartPresenter(): LatestChartPresenter = LatestChartPresenter()
}