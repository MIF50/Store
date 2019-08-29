package com.mif50.store

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mif50.store.models.Product
import com.mif50.store.util.BigDecimatUtil
import com.mif50.store.util.ktx.loadImage
import kotlinx.android.synthetic.main.fragment_view_product.*


class ViewProductFragment : Fragment() {

    // widget->  image  title   price

    // vars
    private  var mProduct: Product? = null

    companion object {

        private const val EXTRA_PRODUCT_KEY = "intent_product"
        @JvmStatic
        fun newInstance(product: Product) =
            ViewProductFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(EXTRA_PRODUCT_KEY,product)
                }
            }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (arguments!=null){
            mProduct = arguments!!.getParcelable(EXTRA_PRODUCT_KEY)
        }

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_product, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setProduct()
    }


    private fun setProduct(){
        mProduct?.let {
            image.loadImage(it.image)
            title.text = it.title
            price.text = BigDecimatUtil.getValue(it.price)
        }

    }




}
