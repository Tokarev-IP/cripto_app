package test.app.criptoapp.di

import dagger.Component
import test.app.criptoapp.activities.MainActivity
import test.app.criptoapp.fragments.CurrenciesListFragment
import test.app.criptoapp.mvp.CurrenciesPresenter
import test.app.criptoapp.mvp.LatestChartPresenter
import javax.inject.Singleton

//Данной аннотацией мы говорим Даггеру, что AppComponent содержит четыре модуля: AppModule, ChartModule, MvpModule и RestModule.
//Зависимости, которые провайдит каждый из этих модулей, доступны для всех остальных модулей, объединенных в компоненте AppComponent.
@Component(modules = [AppModule::class, RestModule::class, MvpModule::class, ChartModule::class])
@Singleton
interface AppComponent {

    //Пока здесь только одна функция inject(mainActivity: MainActivity),
    //которая сообщает Даггеру класс, в который мы хотим внедрять зависимости.

    fun inject(mainActivity: MainActivity)

    fun inject(presenter: CurrenciesPresenter)
    fun inject(presenter: LatestChartPresenter)
    fun inject(fragment: CurrenciesListFragment)
}