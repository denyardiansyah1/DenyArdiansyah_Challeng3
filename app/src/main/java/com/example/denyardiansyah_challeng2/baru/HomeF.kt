package com.example.denyardiansyah_challeng2.baru

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.denyardiansyah_challeng2.R
import com.example.denyardiansyah_challeng2.baru.Adapter.DataAdapterList
import com.example.denyardiansyah_challeng2.baru.data.DataDummy
import com.example.denyardiansyah_challeng2.baru.data.DataList
import com.example.denyardiansyah_challeng2.databinding.HomeFBinding


class HomeF : Fragment() {
    lateinit var binding : HomeFBinding
    lateinit var adapter : DataAdapterList

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = HomeFBinding.inflate(inflater, container, false)
        return binding.root


    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()
        callListView()
        binding.listSwtich.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                initRecyclerViewList()
                callListView()
            }else{
                initRecyclerView()
                callListView()
            }
        }
    }

    private fun initRecyclerView() {
        binding.rvMenu.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.rvMenu.setHasFixedSize(true)
    }
    private fun initRecyclerViewList() {
        binding.rvMenu.layoutManager = LinearLayoutManager(requireContext())
        binding.rvMenu.setHasFixedSize(true)
    }
    private fun callListView(){
        binding.rvMenu.adapter = DataAdapterList(DataDummy.listData)
    }


}