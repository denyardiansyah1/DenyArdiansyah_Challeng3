package com.example.denyardiansyah_challeng2.baru

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.denyardiansyah_challeng2.R
import com.example.denyardiansyah_challeng2.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {
    lateinit var binding: FragmentDetailBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundle = arguments
        val getNama = bundle!!.getString("inputmakanan")
        val getHarga = bundle!!.getString("inputprice")
        val getNilai = bundle!!.getDouble("inputrating")
        val getGambar = bundle!!.getInt("inputgambar")

        binding.tvFoodNameDetail.text = getNama
        binding.tvPriceDetail.text = getHarga
        binding.rating.text = getNilai.toString()
        Glide.with(requireContext()).load(getGambar).into(binding.banner)

        Glide.with(requireContext()).load(getGambar).into(binding.ivRectangleImg)

        binding.textviewLokasi.setOnClickListener {
            val data = getNama
            val uri = Uri.parse("https://www.google.com/maps/search/$data")
            val mapIntent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(mapIntent)
        }

    }


}