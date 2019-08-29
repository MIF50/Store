package com.mif50.store

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.mif50.store.models.Product
import com.mif50.store.resources.Products
import kotlinx.android.synthetic.main.activity_view_product.*

class ViewProductActivity : AppCompatActivity() {

    // widget product_container
    // vars
    lateinit var mProduct : Product
    lateinit var mPagerAdapter: ProductPagerAdapter

    companion object{
        private const val EXTRA_PRODUCT_KEY = "extra product key"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_product)

        getIncomingIntent()
        initPagerAdapter()
    }

    private fun getIncomingIntent() {
        if (intent.hasExtra(getString(R.string.intent_product))){
            mProduct = intent.getParcelableExtra(getString(R.string.intent_product))
        }
    }

    private fun initPagerAdapter(){
        val fragments = arrayListOf<Fragment>()
        val products = Products()
        val selectedProducts = products.PRODUCT_MAP[mProduct.type]
        selectedProducts?.map {
//            val bundle = Bundle()
//            bundle.putParcelable(getString(R.string.intent_product),it)
            val viewProductFragment = ViewProductFragment.newInstance(it)

            fragments.add(viewProductFragment)
        }
        mPagerAdapter = ProductPagerAdapter(supportFragmentManager,fragments)
        product_container.adapter = mPagerAdapter

    }
}
