package test.app.criptoapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.bumptech.glide.Glide
import test.app.criptoapp.R

class CurrenciesAdapter : BaseAdapter<CurrenciesAdapter.CurrencyViewHolder>() {

    //создает ViewHolder и инициализирует views для списка
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false)
        return CurrencyViewHolder(v)

    }

    //реализация вьюхолдера
    class CurrencyViewHolder(view: View) : BaseAdapter.BaseViewHolder(view) {
        val mtvCurrencySym = view.findViewById<TextView>(R.id.tvCurrencySym)
        val mtvCurrencyName = view.findViewById<TextView>(R.id.tvCurrencyName)
        val mtvCurrencyMarketCap = view.findViewById<TextView>(R.id.tvCurrencyMarketCap)
        val mtvCurrencyPrice = view.findViewById<TextView>(R.id.tvCurrencyPrice)
        val mivCurrencyIcon = view.findViewById<TextView>(R.id.ivCurrencyIcon)

        //привязываем элементы представления списка к RecyclerView и заполняем данными
        override fun bind(item: Any) {
            let {
                item as Currency
                //Glide.with(view.context).load(item.image).into(view.mivCurrencyIcon)
                mtvCurrencySym.text = item.symbol
                mtvCurrencyName.text = item.name
                mtvCurrencyMarketCap.text = item.marketCap
                mtvCurrencyPrice.text = item.price.toString()
            }

        }
    }

    //класс данных для элемента списка
    data class Currency(
        val id: String,
        val symbol: String,
        val name: String,
        val image: String,
        val price: Float,
        val marketCap: String,
        val marketCapRank: Int,
        val totalVolume: Float,
        val priceChangePercentage24h: Float,
        val marketCapChangePercentage24h: Float,
        val circulatingSupply: Double,
        val totalSupply: Float,
        val ath: Float,
        val athChangePercentage: Float
    )
}