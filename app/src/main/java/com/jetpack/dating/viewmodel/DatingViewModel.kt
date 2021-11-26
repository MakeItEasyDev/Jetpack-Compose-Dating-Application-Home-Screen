package com.jetpack.dating.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jetpack.dating.model.Album
import com.jetpack.dating.model.AlbumsDataProvider

class DatingViewModel : ViewModel() {
    private val _albumLiveData = MutableLiveData<MutableList<Album>>()
    val albumLiveData: LiveData<MutableList<Album>> = _albumLiveData

    init {
        getAlbums()
    }

    private fun getAlbums() {
        _albumLiveData.value = AlbumsDataProvider.albums.take(15).toMutableList()
    }
}